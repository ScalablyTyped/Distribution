package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchLogsDestination extends StObject {
  
  /**
    * The name of the log group where the project stores evaluation events.
    */
  var logGroup: js.UndefOr[CwLogGroupSafeName] = js.undefined
}
object CloudWatchLogsDestination {
  
  inline def apply(): CloudWatchLogsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchLogsDestination]
  }
  
  extension [Self <: CloudWatchLogsDestination](x: Self) {
    
    inline def setLogGroup(value: CwLogGroupSafeName): Self = StObject.set(x, "logGroup", value.asInstanceOf[js.Any])
    
    inline def setLogGroupUndefined: Self = StObject.set(x, "logGroup", js.undefined)
  }
}
