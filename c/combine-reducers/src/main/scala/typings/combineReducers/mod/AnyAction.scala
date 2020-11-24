package typings.combineReducers.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnyAction
  extends Action[js.Any]
     with // Allows any extra properties to be defined in an action.
/* extraProps */ StringDictionary[js.Any]
object AnyAction {
  
  @scala.inline
  def apply(`type`: js.Any): AnyAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyAction]
  }
}
