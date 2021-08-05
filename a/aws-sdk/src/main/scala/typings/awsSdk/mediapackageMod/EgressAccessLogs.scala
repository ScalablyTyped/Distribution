package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EgressAccessLogs extends StObject {
  
  /**
    * Customize the log group name.
    */
  var LogGroupName: js.UndefOr[string] = js.undefined
}
object EgressAccessLogs {
  
  inline def apply(): EgressAccessLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EgressAccessLogs]
  }
  
  extension [Self <: EgressAccessLogs](x: Self) {
    
    inline def setLogGroupName(value: string): Self = StObject.set(x, "LogGroupName", value.asInstanceOf[js.Any])
    
    inline def setLogGroupNameUndefined: Self = StObject.set(x, "LogGroupName", js.undefined)
  }
}
