package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.MetaProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaProperty_
  extends Node
     with Expression {
  var meta: Identifier_ = js.native
  var property: Identifier_ = js.native
  @JSName("type")
  var type_MetaProperty_ : MetaProperty = js.native
}

object MetaProperty_ {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    meta: Identifier_,
    property: Identifier_,
    start: Double,
    `type`: MetaProperty
  ): MetaProperty_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaProperty_]
  }
  @scala.inline
  implicit class MetaProperty_Ops[Self <: MetaProperty_] (val x: Self) extends AnyVal {
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
    def setMeta(value: Identifier_): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperty(value: Identifier_): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: MetaProperty): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

