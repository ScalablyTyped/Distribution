package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreDeleteMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreObjectIdentifierMod._ObjectIdentifier
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Delete extends js.Object {
  /**
    * _ObjectIdentifierList shape
    */
  var Objects: js.Array[_ObjectIdentifier] | Iterable[_ObjectIdentifier]
  /**
    * <p>Element to enable quiet mode for the request. When you add this element, you must set its value to true.</p>
    */
  var Quiet: js.UndefOr[Boolean] = js.undefined
}

object _Delete {
  @scala.inline
  def apply(
    Objects: js.Array[_ObjectIdentifier] | Iterable[_ObjectIdentifier],
    Quiet: js.UndefOr[Boolean] = js.undefined
  ): _Delete = {
    val __obj = js.Dynamic.literal(Objects = Objects.asInstanceOf[js.Any])
    if (!js.isUndefined(Quiet)) __obj.updateDynamic("Quiet")(Quiet)
    __obj.asInstanceOf[_Delete]
  }
}

