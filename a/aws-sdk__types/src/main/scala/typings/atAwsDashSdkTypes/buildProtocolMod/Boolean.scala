package typings.atAwsDashSdkTypes.buildProtocolMod

import typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Boolean
  extends Shape
     with SerializationModel {
  @JSName("type")
  var type_Boolean: boolean
}

object Boolean {
  @scala.inline
  def apply(`type`: boolean, sensitive: js.UndefOr[scala.Boolean] = js.undefined): Boolean = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boolean]
  }
}

