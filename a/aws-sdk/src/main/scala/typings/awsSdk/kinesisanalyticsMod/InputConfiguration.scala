package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputConfiguration extends js.Object {
  /**
    * Input source ID. You can get this ID by calling the DescribeApplication operation.
    */
  var Id: typings.awsSdk.kinesisanalyticsMod.Id = js.native
  /**
    * Point at which you want the application to start processing records from the streaming source.
    */
  var InputStartingPositionConfiguration: typings.awsSdk.kinesisanalyticsMod.InputStartingPositionConfiguration = js.native
}

object InputConfiguration {
  @scala.inline
  def apply(Id: Id, InputStartingPositionConfiguration: InputStartingPositionConfiguration): InputConfiguration = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], InputStartingPositionConfiguration = InputStartingPositionConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputConfiguration]
  }
}

