package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingConfig extends js.Object {
  /**
    * A boolean indicating whether to record all ROS topics.
    */
  var recordAllRosTopics: BoxedBoolean = js.native
}

object LoggingConfig {
  @scala.inline
  def apply(recordAllRosTopics: BoxedBoolean): LoggingConfig = {
    val __obj = js.Dynamic.literal(recordAllRosTopics = recordAllRosTopics.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LoggingConfig]
  }
}

