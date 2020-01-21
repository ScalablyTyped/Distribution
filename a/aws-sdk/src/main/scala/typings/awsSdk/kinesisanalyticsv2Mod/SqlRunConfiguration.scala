package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlRunConfiguration extends js.Object {
  /**
    * The input source ID. You can get this ID by calling the DescribeApplication operation. 
    */
  var InputId: Id = js.native
  /**
    * The point at which you want the application to start processing records from the streaming source. 
    */
  var InputStartingPositionConfiguration: typings.awsSdk.kinesisanalyticsv2Mod.InputStartingPositionConfiguration = js.native
}

object SqlRunConfiguration {
  @scala.inline
  def apply(InputId: Id, InputStartingPositionConfiguration: InputStartingPositionConfiguration): SqlRunConfiguration = {
    val __obj = js.Dynamic.literal(InputId = InputId.asInstanceOf[js.Any], InputStartingPositionConfiguration = InputStartingPositionConfiguration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SqlRunConfiguration]
  }
}

