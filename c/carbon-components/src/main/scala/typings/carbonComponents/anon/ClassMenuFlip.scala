package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassMenuFlip extends js.Object {
  var classMenuFlip: String = js.native
  var classMenuShown: String = js.native
  var classShown: String = js.native
  var selectorContent: String = js.native
  var selectorInit: String = js.native
  var selectorItem: String = js.native
  var selectorOptionMenu: String = js.native
  var selectorTrigger: String = js.native
  def objMenuOffset(menuBody: js.Any, direction: js.Any, trigger: js.Any): js.UndefOr[Left] = js.native
  def objMenuOffsetFlip(menuBody: js.Any, direction: js.Any, trigger: js.Any): js.UndefOr[Left] = js.native
}

object ClassMenuFlip {
  @scala.inline
  def apply(
    classMenuFlip: String,
    classMenuShown: String,
    classShown: String,
    objMenuOffset: (js.Any, js.Any, js.Any) => js.UndefOr[Left],
    objMenuOffsetFlip: (js.Any, js.Any, js.Any) => js.UndefOr[Left],
    selectorContent: String,
    selectorInit: String,
    selectorItem: String,
    selectorOptionMenu: String,
    selectorTrigger: String
  ): ClassMenuFlip = {
    val __obj = js.Dynamic.literal(classMenuFlip = classMenuFlip.asInstanceOf[js.Any], classMenuShown = classMenuShown.asInstanceOf[js.Any], classShown = classShown.asInstanceOf[js.Any], objMenuOffset = js.Any.fromFunction3(objMenuOffset), objMenuOffsetFlip = js.Any.fromFunction3(objMenuOffsetFlip), selectorContent = selectorContent.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorItem = selectorItem.asInstanceOf[js.Any], selectorOptionMenu = selectorOptionMenu.asInstanceOf[js.Any], selectorTrigger = selectorTrigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassMenuFlip]
  }
  @scala.inline
  implicit class ClassMenuFlipOps[Self <: ClassMenuFlip] (val x: Self) extends AnyVal {
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
    def setClassMenuFlip(value: String): Self = this.set("classMenuFlip", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassMenuShown(value: String): Self = this.set("classMenuShown", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassShown(value: String): Self = this.set("classShown", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjMenuOffset(value: (js.Any, js.Any, js.Any) => js.UndefOr[Left]): Self = this.set("objMenuOffset", js.Any.fromFunction3(value))
    @scala.inline
    def setObjMenuOffsetFlip(value: (js.Any, js.Any, js.Any) => js.UndefOr[Left]): Self = this.set("objMenuOffsetFlip", js.Any.fromFunction3(value))
    @scala.inline
    def setSelectorContent(value: String): Self = this.set("selectorContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorInit(value: String): Self = this.set("selectorInit", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorItem(value: String): Self = this.set("selectorItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorOptionMenu(value: String): Self = this.set("selectorOptionMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorTrigger(value: String): Self = this.set("selectorTrigger", value.asInstanceOf[js.Any])
  }
  
}

