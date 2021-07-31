package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngressAccessLogs extends StObject {
  
  /**
    * Customize the log group name.
    */
  var LogGroupName: js.UndefOr[string] = js.undefined
}
object IngressAccessLogs {
  
  @scala.inline
  def apply(): IngressAccessLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngressAccessLogs]
  }
  
  @scala.inline
  implicit class IngressAccessLogsMutableBuilder[Self <: IngressAccessLogs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogGroupName(value: string): Self = StObject.set(x, "LogGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroupNameUndefined: Self = StObject.set(x, "LogGroupName", js.undefined)
  }
}
