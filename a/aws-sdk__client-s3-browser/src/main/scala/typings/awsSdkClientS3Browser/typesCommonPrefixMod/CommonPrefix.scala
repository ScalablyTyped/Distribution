package typings.awsSdkClientS3Browser.typesCommonPrefixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonPrefix extends js.Object {
  /**
    * _Prefix shape
    */
  var Prefix: js.UndefOr[String] = js.undefined
}

object CommonPrefix {
  @scala.inline
  def apply(Prefix: String = null): CommonPrefix = {
    val __obj = js.Dynamic.literal()
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonPrefix]
  }
}

