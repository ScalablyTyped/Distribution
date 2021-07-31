package typings.ckeditorCkeditor5Engine.mod

import typings.ckeditorCkeditor5Engine.mod.model.Model
import typings.ckeditorCkeditor5Engine.mod.view.View
import typings.ckeditorCkeditor5Utils.mod.Emitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utils {
  
  @JSImport("@ckeditor/ckeditor5-engine", "utils")
  @js.native
  val ^ : js.Any = js.native
  
  // engine/utils/bindtwostepcarettoattribute
  @scala.inline
  def bindTwoStepCaretToAttribute(view: View, model: Model, emitter: Emitter, attribute: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bindTwoStepCaretToAttribute")(view.asInstanceOf[js.Any], model.asInstanceOf[js.Any], emitter.asInstanceOf[js.Any], attribute.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
