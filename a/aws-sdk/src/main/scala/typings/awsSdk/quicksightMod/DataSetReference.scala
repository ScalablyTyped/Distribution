package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSetReference extends js.Object {
  /**
    * Dataset Amazon Resource Name (ARN).
    */
  var DataSetArn: Arn = js.native
  /**
    * Dataset placeholder.
    */
  var DataSetPlaceholder: NonEmptyString = js.native
}

object DataSetReference {
  @scala.inline
  def apply(DataSetArn: Arn, DataSetPlaceholder: NonEmptyString): DataSetReference = {
    val __obj = js.Dynamic.literal(DataSetArn = DataSetArn.asInstanceOf[js.Any], DataSetPlaceholder = DataSetPlaceholder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataSetReference]
  }
}

