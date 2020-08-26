package typings.cliColor.anon

import org.scalablytyped.runtime.Instantiable0
import typings.cliColor.throbberMod.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofthrobber extends js.Object {
  var Iterator: Instantiable0[typings.cliColor.throbberMod.Iterator] = js.native
}

object Typeofthrobber {
  @scala.inline
  def apply(Iterator: Instantiable0[Iterator]): Typeofthrobber = {
    val __obj = js.Dynamic.literal(Iterator = Iterator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofthrobber]
  }
  @scala.inline
  implicit class TypeofthrobberOps[Self <: Typeofthrobber] (val x: Self) extends AnyVal {
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
    def setIterator(value: Instantiable0[Iterator]): Self = this.set("Iterator", value.asInstanceOf[js.Any])
  }
  
}

