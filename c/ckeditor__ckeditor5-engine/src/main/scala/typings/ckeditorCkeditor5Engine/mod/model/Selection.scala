package typings.ckeditorCkeditor5Engine.mod.model

import typings.ckeditorCkeditor5Engine.anon.Priority
import typings.ckeditorCkeditor5Engine.anon.`0`
import typings.ckeditorCkeditor5Utils.mod.Emitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// engine/model/selection
@JSImport("@ckeditor/ckeditor5-engine", "model.Selection")
@js.native
class Selection ()
  extends StObject
     with Emitter {
  
  def listenTo(emitter: Emitter, event: String, callback: js.Function, options: Priority): Unit = js.native
  
  def on(event: String, callback: js.Function, options: `0`): Unit = js.native
  
  def once(event: String, callback: js.Function, options: `0`): Unit = js.native
}
