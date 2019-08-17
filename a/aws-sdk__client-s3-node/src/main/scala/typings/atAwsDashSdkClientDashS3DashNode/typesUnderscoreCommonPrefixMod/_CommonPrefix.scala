package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreCommonPrefixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _CommonPrefix extends js.Object {
  /**
    * _Prefix shape
    */
  var Prefix: js.UndefOr[String] = js.undefined
}

object _CommonPrefix {
  @scala.inline
  def apply(Prefix: String = null): _CommonPrefix = {
    val __obj = js.Dynamic.literal()
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    __obj.asInstanceOf[_CommonPrefix]
  }
}

