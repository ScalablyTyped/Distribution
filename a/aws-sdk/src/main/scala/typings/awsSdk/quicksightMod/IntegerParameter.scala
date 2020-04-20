package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntegerParameter extends js.Object {
  /**
    * A display name for the dataset.
    */
  var Name: NonEmptyString = js.native
  /**
    * Values.
    */
  var Values: LongList = js.native
}

object IntegerParameter {
  @scala.inline
  def apply(Name: NonEmptyString, Values: LongList): IntegerParameter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerParameter]
  }
}

