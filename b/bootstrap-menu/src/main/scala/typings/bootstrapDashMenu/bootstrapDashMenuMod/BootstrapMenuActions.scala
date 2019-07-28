package typings.bootstrapDashMenu.bootstrapDashMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Every function attribute is called before rendering the menu each time it is opened.
  * If `fetchElementData` was defined, these functions will receive as first argument its returned value for the currently selected element.
  */
trait BootstrapMenuActions extends js.Object {
  /**
    * Optional, classes to add to the action.
    */
  var classNames: js.UndefOr[String | js.Object | (js.Function0[String | js.Object])] = js.undefined
  /**
    * Optional, Font Awesome class of the icon to show for the action.
    */
  var iconClass: js.UndefOr[String] = js.undefined
  /**
    * Optional, decides if the action should appear enabled or disabled in the context menu.
    */
  var isEnabled: js.UndefOr[js.Function1[/* rowElement */ BootstrapMenuRowElement, Boolean]] = js.undefined
  /**
    * Optional, decides if the action should be shown or hidden in the context menu.
    */
  var isShown: js.UndefOr[js.Function1[/* rowElement */ BootstrapMenuRowElement, Boolean]] = js.undefined
  /**
    * The name of the action.
    */
  var name: String
  /**
    * Handler to run when an action is clicked.
    */
  def onClick(rowElement: BootstrapMenuRowElement): Unit
}

object BootstrapMenuActions {
  @scala.inline
  def apply(
    name: String,
    onClick: BootstrapMenuRowElement => Unit,
    classNames: String | js.Object | (js.Function0[String | js.Object]) = null,
    iconClass: String = null,
    isEnabled: /* rowElement */ BootstrapMenuRowElement => Boolean = null,
    isShown: /* rowElement */ BootstrapMenuRowElement => Boolean = null
  ): BootstrapMenuActions = {
    val __obj = js.Dynamic.literal(name = name, onClick = js.Any.fromFunction1(onClick))
    if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(js.Any.fromFunction1(isEnabled))
    if (isShown != null) __obj.updateDynamic("isShown")(js.Any.fromFunction1(isShown))
    __obj.asInstanceOf[BootstrapMenuActions]
  }
}

