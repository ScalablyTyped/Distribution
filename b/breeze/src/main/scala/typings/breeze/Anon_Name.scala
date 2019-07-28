package typings.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var serializerFn: js.UndefOr[js.Function] = js.undefined
}

object Anon_Name {
  @scala.inline
  def apply(name: String = null, serializerFn: js.Function = null): Anon_Name = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (serializerFn != null) __obj.updateDynamic("serializerFn")(serializerFn)
    __obj.asInstanceOf[Anon_Name]
  }
}

