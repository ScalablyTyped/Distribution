package typings.classTransformer.exposeExcludeOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeHelpOptions extends js.Object {
  var newObject: js.Any = js.native
  var `object`: js.Object = js.native
  var property: String = js.native
}

object TypeHelpOptions {
  @scala.inline
  def apply(newObject: js.Any, `object`: js.Object, property: String): TypeHelpOptions = {
    val __obj = js.Dynamic.literal(newObject = newObject.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeHelpOptions]
  }
  @scala.inline
  implicit class TypeHelpOptionsOps[Self <: TypeHelpOptions] (val x: Self) extends AnyVal {
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
    def setNewObject(value: js.Any): Self = this.set("newObject", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: js.Object): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
  }
  
}

