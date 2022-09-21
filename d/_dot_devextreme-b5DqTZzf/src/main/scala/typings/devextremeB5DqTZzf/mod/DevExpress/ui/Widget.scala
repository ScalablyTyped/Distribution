package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.mod.DevExpress.DOMComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Widget[TProperties]
  extends StObject
     with DOMComponent[TProperties] {
  
  /**
    * Sets focus on the UI component.
    */
  def focus(): Unit = js.native
  
  /**
    * Registers a handler to be executed when a user presses a specific key.
    */
  def registerKeyHandler(key: String, handler: js.Function): Unit = js.native
  
  /**
    * Repaints the UI component without reloading data. Call it to update the UI component&apos;s markup.
    */
  def repaint(): Unit = js.native
}
object Widget {
  
  type format = Format
}
