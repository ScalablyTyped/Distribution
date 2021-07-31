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
  
  @scala.inline
  def apply(recordAllRosTopics: BoxedBoolean): LoggingConfig = {
    val __obj = js.Dynamic.literal(recordAllRosTopics = recordAllRosTopics.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingConfig]
  }
  
  @scala.inline
  implicit class LoggingConfigMutableBuilder[Self <: LoggingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecordAllRosTopics(value: BoxedBoolean): Self = StObject.set(x, "recordAllRosTopics", value.asInstanceOf[js.Any])
  }
}
