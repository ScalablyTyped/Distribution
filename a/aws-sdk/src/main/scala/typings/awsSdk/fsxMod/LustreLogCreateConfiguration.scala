package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LustreLogCreateConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that specifies the destination of the logs. The destination can be any Amazon CloudWatch Logs log group ARN, with the following requirements:   The destination ARN that you provide must be in the same Amazon Web Services partition, Amazon Web Services Region, and Amazon Web Services account as your Amazon FSx file system.   The name of the Amazon CloudWatch Logs log group must begin with the /aws/fsx prefix.   If you do not provide a destination, Amazon FSx will create and use a log stream in the CloudWatch Logs /aws/fsx/lustre log group.   If Destination is provided and the resource does not exist, the request will fail with a BadRequest error.   If Level is set to DISABLED, you cannot specify a destination in Destination.  
    */
  var Destination: js.UndefOr[GeneralARN] = js.undefined
  
  /**
    * Sets which data repository events are logged by Amazon FSx.    WARN_ONLY - only warning events are logged.    ERROR_ONLY - only error events are logged.    WARN_ERROR - both warning events and error events are logged.    DISABLED - logging of data repository events is turned off.  
    */
  var Level: LustreAccessAuditLogLevel
}
object LustreLogCreateConfiguration {
  
  inline def apply(Level: LustreAccessAuditLogLevel): LustreLogCreateConfiguration = {
    val __obj = js.Dynamic.literal(Level = Level.asInstanceOf[js.Any])
    __obj.asInstanceOf[LustreLogCreateConfiguration]
  }
  
  extension [Self <: LustreLogCreateConfiguration](x: Self) {
    
    inline def setDestination(value: GeneralARN): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setLevel(value: LustreAccessAuditLogLevel): Self = StObject.set(x, "Level", value.asInstanceOf[js.Any])
  }
}
