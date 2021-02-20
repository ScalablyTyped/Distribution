package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EgressAccessLogs extends StObject {
  
  /**
    * Customize the log group name.
    */
  var LogGroupName: js.UndefOr[string] = js.native
}
object EgressAccessLogs {
  
  @scala.inline
  def apply(): EgressAccessLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EgressAccessLogs]
  }
  
  @scala.inline
  implicit class EgressAccessLogsMutableBuilder[Self <: EgressAccessLogs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogGroupName(value: string): Self = StObject.set(x, "LogGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroupNameUndefined: Self = StObject.set(x, "LogGroupName", js.undefined)
  }
}
