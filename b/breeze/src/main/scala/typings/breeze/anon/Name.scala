package typings.breeze.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var serializerFn: js.UndefOr[js.Function] = js.undefined
}

object Name {
  @scala.inline
  def apply(name: String = null, serializerFn: js.Function = null): Name = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (serializerFn != null) __obj.updateDynamic("serializerFn")(serializerFn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

