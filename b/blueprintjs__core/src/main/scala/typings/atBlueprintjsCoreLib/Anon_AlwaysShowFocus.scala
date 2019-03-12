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
    alwaysShowFocus: () => scala.Boolean | scala.Unit,
    isActive: () => scala.Boolean,
    onlyShowFocusOnTabs: () => scala.Boolean | scala.Unit
  ): Anon_AlwaysShowFocus = {
    val __obj = js.Dynamic.literal(alwaysShowFocus = js.Any.fromFunction0(alwaysShowFocus), isActive = js.Any.fromFunction0(isActive), onlyShowFocusOnTabs = js.Any.fromFunction0(onlyShowFocusOnTabs))
  
    __obj.asInstanceOf[Anon_AlwaysShowFocus]
  }
}

