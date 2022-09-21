package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LustreLogConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that specifies the destination of the logs. The destination can be any Amazon CloudWatch Logs log group ARN. The destination ARN must be in the same Amazon Web Services partition, Amazon Web Services Region, and Amazon Web Services account as your Amazon FSx file system.
    */
  var Destination: js.UndefOr[GeneralARN] = js.undefined
  
  /**
    * The data repository events that are logged by Amazon FSx.    WARN_ONLY - only warning events are logged.    ERROR_ONLY - only error events are logged.    WARN_ERROR - both warning events and error events are logged.    DISABLED - logging of data repository events is turned off.  
    */
  var Level: LustreAccessAuditLogLevel
}
object LustreLogConfiguration {
  
  inline def apply(Level: LustreAccessAuditLogLevel): LustreLogConfiguration = {
    val __obj = js.Dynamic.literal(Level = Level.asInstanceOf[js.Any])
    __obj.asInstanceOf[LustreLogConfiguration]
  }
  
  extension [Self <: LustreLogConfiguration](x: Self) {
    
    inline def setDestination(value: GeneralARN): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setLevel(value: LustreAccessAuditLogLevel): Self = StObject.set(x, "Level", value.asInstanceOf[js.Any])
  }
}
