package typings.coreJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Escape extends js.Object {
  def escape(str: String): String = js.native
}

object Escape {
  @scala.inline
  def apply(escape: String => String): Escape = {
    val __obj = js.Dynamic.literal(escape = js.Any.fromFunction1(escape))
    __obj.asInstanceOf[Escape]
  }
  @scala.inline
  implicit class EscapeOps[Self <: Escape] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEscape(value: String => String): Self = this.set("escape", js.Any.fromFunction1(value))
  }
  
}

