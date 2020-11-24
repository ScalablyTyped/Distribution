package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConsoleOutputResult extends js.Object {
  
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
  implicit class GetConsoleOutputResultOps[Self <: GetConsoleOutputResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    
    @scala.inline
    def setOutput(value: String): Self = this.set("Output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("Output", js.undefined)
    
    @scala.inline
    def setTimestamp(value: DateTime): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("Timestamp", js.undefined)
  }
}
