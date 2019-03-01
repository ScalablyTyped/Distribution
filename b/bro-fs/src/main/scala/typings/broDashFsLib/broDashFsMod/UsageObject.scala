package typings
package broDashFsLib.broDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsageObject extends js.Object {
  var grantedBytes: scala.Double
  var usedBytes: scala.Double
}

object UsageObject {
  @scala.inline
  def apply(grantedBytes: scala.Double, usedBytes: scala.Double): UsageObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("grantedBytes")(grantedBytes)
    __obj.updateDynamic("usedBytes")(usedBytes)
    __obj.asInstanceOf[UsageObject]
  }
}

