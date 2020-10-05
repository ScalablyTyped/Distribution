package typings.coreJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegExpConstructor extends js.Object {
  def escape(str: java.lang.String): java.lang.String = js.native
}

object RegExpConstructor {
  @scala.inline
  def apply(escape: java.lang.String => java.lang.String): RegExpConstructor = {
    val __obj = js.Dynamic.literal(escape = js.Any.fromFunction1(escape))
    __obj.asInstanceOf[RegExpConstructor]
  }
  @scala.inline
  implicit class RegExpConstructorOps[Self <: RegExpConstructor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEscape(value: java.lang.String => java.lang.String): Self = this.set("escape", js.Any.fromFunction1(value))
  }
  
}

