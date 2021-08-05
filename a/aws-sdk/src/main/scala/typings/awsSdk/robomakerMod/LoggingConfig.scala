package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingConfig extends StObject {
  
  /**
    * A boolean indicating whether to record all ROS topics.
    */
  var recordAllRosTopics: BoxedBoolean
}
object LoggingConfig {
  
  inline def apply(recordAllRosTopics: BoxedBoolean): LoggingConfig = {
    val __obj = js.Dynamic.literal(recordAllRosTopics = recordAllRosTopics.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingConfig]
  }
  
  extension [Self <: LoggingConfig](x: Self) {
    
    inline def setRecordAllRosTopics(value: BoxedBoolean): Self = StObject.set(x, "recordAllRosTopics", value.asInstanceOf[js.Any])
  }
}
