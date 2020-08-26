package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttribTooltipTarget extends js.Object {
  var attribTooltipTarget: String = js.native
  var classShown: String = js.native
  var initEventNames: js.Array[String] = js.native
  var selectorContent: String = js.native
  var selectorInit: String = js.native
  def objMenuOffset(menuBody: js.Any, menuDirection: js.Any): js.UndefOr[Dictx] = js.native
}

object AttribTooltipTarget {
  @scala.inline
  def apply(
    attribTooltipTarget: String,
    classShown: String,
    initEventNames: js.Array[String],
    objMenuOffset: (js.Any, js.Any) => js.UndefOr[Dictx],
    selectorContent: String,
    selectorInit: String
  ): AttribTooltipTarget = {
    val __obj = js.Dynamic.literal(attribTooltipTarget = attribTooltipTarget.asInstanceOf[js.Any], classShown = classShown.asInstanceOf[js.Any], initEventNames = initEventNames.asInstanceOf[js.Any], objMenuOffset = js.Any.fromFunction2(objMenuOffset), selectorContent = selectorContent.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttribTooltipTarget]
  }
  @scala.inline
  implicit class AttribTooltipTargetOps[Self <: AttribTooltipTarget] (val x: Self) extends AnyVal {
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
    def setAttribTooltipTarget(value: String): Self = this.set("attribTooltipTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassShown(value: String): Self = this.set("classShown", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitEventNamesVarargs(value: String*): Self = this.set("initEventNames", js.Array(value :_*))
    @scala.inline
    def setInitEventNames(value: js.Array[String]): Self = this.set("initEventNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjMenuOffset(value: (js.Any, js.Any) => js.UndefOr[Dictx]): Self = this.set("objMenuOffset", js.Any.fromFunction2(value))
    @scala.inline
    def setSelectorContent(value: String): Self = this.set("selectorContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorInit(value: String): Self = this.set("selectorInit", value.asInstanceOf[js.Any])
  }
  
}

