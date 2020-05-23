package typings.awsSdkClientS3Node.typesDeleteMod

import typings.awsSdkClientS3Node.typesObjectIdentifierMod.ObjectIdentifier
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delete extends js.Object {
  /**
    * _ObjectIdentifierList shape
    */
  var Objects: js.Array[ObjectIdentifier] | Iterable[ObjectIdentifier]
  /**
    * <p>Element to enable quiet mode for the request. When you add this element, you must set its value to true.</p>
    */
  var Quiet: js.UndefOr[Boolean] = js.undefined
}

object Delete {
  @scala.inline
  def apply(
    Objects: js.Array[ObjectIdentifier] | Iterable[ObjectIdentifier],
    Quiet: js.UndefOr[Boolean] = js.undefined
  ): Delete = {
    val __obj = js.Dynamic.literal(Objects = Objects.asInstanceOf[js.Any])
    if (!js.isUndefined(Quiet)) __obj.updateDynamic("Quiet")(Quiet.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delete]
  }
}

