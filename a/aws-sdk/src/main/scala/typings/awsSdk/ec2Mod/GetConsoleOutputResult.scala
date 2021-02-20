package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConsoleOutputResult extends StObject {
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  
  /**
    * The console output, base64-encoded. If you are using a command line tool, the tool decodes the output for you.
    */
  var Output: js.UndefOr[String] = js.native
  
  /**
    * The time at which the output was last updated.
    */
  var Timestamp: js.UndefOr[DateTime] = js.native
}
object GetConsoleOutputResult {
  
  @scala.inline
  def apply(): GetConsoleOutputResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConsoleOutputResult]
  }
  
  @scala.inline
  implicit class GetConsoleOutputResultMutableBuilder[Self <: GetConsoleOutputResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setOutput(value: String): Self = StObject.set(x, "Output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUndefined: Self = StObject.set(x, "Output", js.undefined)
    
    @scala.inline
    def setTimestamp(value: DateTime): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
