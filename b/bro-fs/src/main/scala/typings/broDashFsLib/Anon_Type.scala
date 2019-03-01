package typings
package broDashFsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type extends js.Object {
  var `type`: js.UndefOr[broDashFsLib.broDashFsMod.TextType] = js.undefined
}

object Anon_Type {
  @scala.inline
  def apply(`type`: broDashFsLib.broDashFsMod.TextType = null): Anon_Type = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Type]
  }
}

