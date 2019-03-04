package typings
package atBlueprintjsCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlwaysShowFocus extends js.Object {
  def alwaysShowFocus(): scala.Boolean | scala.Unit
  def isActive(): scala.Boolean
  def onlyShowFocusOnTabs(): scala.Boolean | scala.Unit
}

object Anon_AlwaysShowFocus {
  @scala.inline
  def apply(
    alwaysShowFocus: js.Function0[scala.Boolean | scala.Unit],
    isActive: js.Function0[scala.Boolean],
    onlyShowFocusOnTabs: js.Function0[scala.Boolean | scala.Unit]
  ): Anon_AlwaysShowFocus = {
    val __obj = js.Dynamic.literal(alwaysShowFocus = alwaysShowFocus, isActive = isActive, onlyShowFocusOnTabs = onlyShowFocusOnTabs)
  
    __obj.asInstanceOf[Anon_AlwaysShowFocus]
  }
}

