package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecimalParameter extends js.Object {
  /**
    * A display name for the dataset.
    */
  var Name: NonEmptyString = js.native
  /**
    * Values.
    */
  var Values: DoubleList = js.native
}

object DecimalParameter {
  @scala.inline
  def apply(Name: NonEmptyString, Values: DoubleList): DecimalParameter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecimalParameter]
  }
}

