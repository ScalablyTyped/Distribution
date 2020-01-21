package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailureDescription extends js.Object {
  /**
    * A message providing details about the error that caused the failure.
    */
  var Details: NonEmptyString = js.native
  /**
    * The type of error that caused the failure.
    */
  var Type: DeliveryStreamFailureType = js.native
}

object FailureDescription {
  @scala.inline
  def apply(Details: NonEmptyString, Type: DeliveryStreamFailureType): FailureDescription = {
    val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FailureDescription]
  }
}

