package typings.awsSdkTypes.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shape extends js.Object {
  var sensitive: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: SerializationType
}

object Shape {
  @scala.inline
  def apply(`type`: SerializationType, sensitive: js.UndefOr[scala.Boolean] = js.undefined): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
}

