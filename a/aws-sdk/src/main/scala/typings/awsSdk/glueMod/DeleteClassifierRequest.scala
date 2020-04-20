package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteClassifierRequest extends js.Object {
  /**
    * Name of the classifier to remove.
    */
  var Name: NameString = js.native
}

object DeleteClassifierRequest {
  @scala.inline
  def apply(Name: NameString): DeleteClassifierRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClassifierRequest]
  }
}

