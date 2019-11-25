package typings.broDashFs

import typings.broDashFs.broDashFsMod.TextType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type extends js.Object {
  var `type`: js.UndefOr[TextType] = js.undefined
}

object Anon_Type {
  @scala.inline
  def apply(`type`: TextType = null): Anon_Type = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Type]
  }
}

