package typings.bootstrapMenu.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Every function attribute is called before rendering the menu each time it is opened.
  * If `fetchElementData` was defined, these functions will receive as first argument its returned value for the currently selected element.
  */
@js.native
trait BootstrapMenuActions extends js.Object {
  /**
    * Optional, classes to add to the action.
    */
  var classNames: js.UndefOr[String | js.Object | (js.Function0[String | js.Object])] = js.native
  /**
    * Optional, Font Awesome class of the icon to show for the action.
    */
  var iconClass: js.UndefOr[String] = js.native
  /**
    * Optional, decides if the action should appear enabled or disabled in the context menu.
    */
  var isEnabled: js.UndefOr[js.Function1[/* rowElement */ BootstrapMenuRowElement, Boolean]] = js.native
  /**
    * Optional, decides if the action should be shown or hidden in the context menu.
    */
  var isShown: js.UndefOr[js.Function1[/* rowElement */ BootstrapMenuRowElement, Boolean]] = js.native
  /**
    * The name of the action.
    */
  var name: String = js.native
  /**
    * Handler to run when an action is clicked.
    */
  def onClick(rowElement: BootstrapMenuRowElement): Unit = js.native
}

object BootstrapMenuActions {
  @scala.inline
  def apply(name: String, onClick: BootstrapMenuRowElement => Unit): BootstrapMenuActions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[BootstrapMenuActions]
  }
  @scala.inline
  implicit class BootstrapMenuActionsOps[Self <: BootstrapMenuActions] (val x: Self) extends AnyVal {
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
    def setOnClick(value: BootstrapMenuRowElement => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def setClassNamesFunction0(value: () => String | js.Object): Self = this.set("classNames", js.Any.fromFunction0(value))
    @scala.inline
    def setClassNames(value: String | js.Object | (js.Function0[String | js.Object])): Self = this.set("classNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassNames: Self = this.set("classNames", js.undefined)
    @scala.inline
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconClass: Self = this.set("iconClass", js.undefined)
    @scala.inline
    def setIsEnabled(value: /* rowElement */ BootstrapMenuRowElement => Boolean): Self = this.set("isEnabled", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsEnabled: Self = this.set("isEnabled", js.undefined)
    @scala.inline
    def setIsShown(value: /* rowElement */ BootstrapMenuRowElement => Boolean): Self = this.set("isShown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsShown: Self = this.set("isShown", js.undefined)
  }
  
}

