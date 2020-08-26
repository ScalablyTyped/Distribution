package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeParameter_ extends Node {
  var bound: TypeAnnotation_ | Null = js.native
  var default: Flow | Null = js.native
  var name: String | Null = js.native
  @JSName("type")
  var type_TypeParameter_ : TypeParameterDeclaration = js.native
}

object TypeParameter_ {
  @scala.inline
  def apply(end: Double, loc: SourceLocation, start: Double, `type`: TypeParameterDeclaration): TypeParameter_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeParameter_]
  }
  @scala.inline
  implicit class TypeParameter_Ops[Self <: TypeParameter_] (val x: Self) extends AnyVal {
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
    def setType(value: TypeParameterDeclaration): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setBound(value: TypeAnnotation_): Self = this.set("bound", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoundNull: Self = this.set("bound", null)
    @scala.inline
    def setDefault(value: Flow): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultNull: Self = this.set("default", null)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameNull: Self = this.set("name", null)
  }
  
}

