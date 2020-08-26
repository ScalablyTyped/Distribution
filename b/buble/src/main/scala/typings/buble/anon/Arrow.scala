package typings.buble.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arrow extends js.Object {
  var arrow: js.UndefOr[Boolean] = js.native
  var classes: js.UndefOr[Boolean] = js.native
  var collections: js.UndefOr[Boolean] = js.native
  var computedProperty: js.UndefOr[Boolean] = js.native
  var conciseMethodProperty: js.UndefOr[Boolean] = js.native
  var constLoop: js.UndefOr[Boolean] = js.native
  var dangerousForOf: js.UndefOr[Boolean] = js.native
  var dangerousTaggedTemplateString: js.UndefOr[Boolean] = js.native
  var defaultParameter: js.UndefOr[Boolean] = js.native
  var destructuring: js.UndefOr[Boolean] = js.native
  var forOf: js.UndefOr[Boolean] = js.native
  var generator: js.UndefOr[Boolean] = js.native
  var letConst: js.UndefOr[Boolean] = js.native
  var modules: js.UndefOr[Boolean] = js.native
  var numericLiteral: js.UndefOr[Boolean] = js.native
  var parameterDestructuring: js.UndefOr[Boolean] = js.native
  var reservedProperties: js.UndefOr[Boolean] = js.native
  var spreadRest: js.UndefOr[Boolean] = js.native
  var stickyRegExp: js.UndefOr[Boolean] = js.native
  var templateString: js.UndefOr[Boolean] = js.native
  var unicodeRegExp: js.UndefOr[Boolean] = js.native
}

object Arrow {
  @scala.inline
  def apply(): Arrow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Arrow]
  }
  @scala.inline
  implicit class ArrowOps[Self <: Arrow] (val x: Self) extends AnyVal {
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
    def setArrow(value: Boolean): Self = this.set("arrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrow: Self = this.set("arrow", js.undefined)
    @scala.inline
    def setClasses(value: Boolean): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setCollections(value: Boolean): Self = this.set("collections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollections: Self = this.set("collections", js.undefined)
    @scala.inline
    def setComputedProperty(value: Boolean): Self = this.set("computedProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputedProperty: Self = this.set("computedProperty", js.undefined)
    @scala.inline
    def setConciseMethodProperty(value: Boolean): Self = this.set("conciseMethodProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConciseMethodProperty: Self = this.set("conciseMethodProperty", js.undefined)
    @scala.inline
    def setConstLoop(value: Boolean): Self = this.set("constLoop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstLoop: Self = this.set("constLoop", js.undefined)
    @scala.inline
    def setDangerousForOf(value: Boolean): Self = this.set("dangerousForOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDangerousForOf: Self = this.set("dangerousForOf", js.undefined)
    @scala.inline
    def setDangerousTaggedTemplateString(value: Boolean): Self = this.set("dangerousTaggedTemplateString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDangerousTaggedTemplateString: Self = this.set("dangerousTaggedTemplateString", js.undefined)
    @scala.inline
    def setDefaultParameter(value: Boolean): Self = this.set("defaultParameter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultParameter: Self = this.set("defaultParameter", js.undefined)
    @scala.inline
    def setDestructuring(value: Boolean): Self = this.set("destructuring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestructuring: Self = this.set("destructuring", js.undefined)
    @scala.inline
    def setForOf(value: Boolean): Self = this.set("forOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForOf: Self = this.set("forOf", js.undefined)
    @scala.inline
    def setGenerator(value: Boolean): Self = this.set("generator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenerator: Self = this.set("generator", js.undefined)
    @scala.inline
    def setLetConst(value: Boolean): Self = this.set("letConst", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLetConst: Self = this.set("letConst", js.undefined)
    @scala.inline
    def setModules(value: Boolean): Self = this.set("modules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
    @scala.inline
    def setNumericLiteral(value: Boolean): Self = this.set("numericLiteral", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumericLiteral: Self = this.set("numericLiteral", js.undefined)
    @scala.inline
    def setParameterDestructuring(value: Boolean): Self = this.set("parameterDestructuring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterDestructuring: Self = this.set("parameterDestructuring", js.undefined)
    @scala.inline
    def setReservedProperties(value: Boolean): Self = this.set("reservedProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReservedProperties: Self = this.set("reservedProperties", js.undefined)
    @scala.inline
    def setSpreadRest(value: Boolean): Self = this.set("spreadRest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpreadRest: Self = this.set("spreadRest", js.undefined)
    @scala.inline
    def setStickyRegExp(value: Boolean): Self = this.set("stickyRegExp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStickyRegExp: Self = this.set("stickyRegExp", js.undefined)
    @scala.inline
    def setTemplateString(value: Boolean): Self = this.set("templateString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateString: Self = this.set("templateString", js.undefined)
    @scala.inline
    def setUnicodeRegExp(value: Boolean): Self = this.set("unicodeRegExp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnicodeRegExp: Self = this.set("unicodeRegExp", js.undefined)
  }
  
}

