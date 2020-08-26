package typings.cloudeventsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Name extends js.Object {
  var name: String = js.native
  def parser(v: js.Any): js.Any = js.native
}

object Name {
  @scala.inline
  def apply(name: String, parser: js.Any => js.Any): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parser = js.Any.fromFunction1(parser))
    __obj.asInstanceOf[Name]
  }
  @scala.inline
  implicit class NameOps[Self <: Name] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParser(value: js.Any => js.Any): Self = this.set("parser", js.Any.fromFunction1(value))
  }
  
}

