package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextLogDestination extends StObject {
  
  /**
    * Defines the Amazon CloudWatch Logs log group where text and metadata logs are delivered.
    */
  var cloudWatch: CloudWatchLogGroupLogDestination
}
object TextLogDestination {
  
  inline def apply(cloudWatch: CloudWatchLogGroupLogDestination): TextLogDestination = {
    val __obj = js.Dynamic.literal(cloudWatch = cloudWatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextLogDestination]
  }
  
  extension [Self <: TextLogDestination](x: Self) {
    
    inline def setCloudWatch(value: CloudWatchLogGroupLogDestination): Self = StObject.set(x, "cloudWatch", value.asInstanceOf[js.Any])
  }
}
