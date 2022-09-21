package typings.cookieclicker.Game

import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tooltip extends StObject {
  
  def draw(from: HTMLElement, text: String, origin: TooltipOrigins): Unit = js.native
  /**
    * Draws the tooltip
    * @param from The element the tooltip is going from
    * @param text The text (or the text function) to use in the tooltip
    * @param origin The mode of position of the tooltip
    */
  def draw(from: HTMLElement, text: js.Function0[String], origin: TooltipOrigins): Unit = js.native
  
  /**
    * If true, the tooltip content will be updated constantly, otherwise, it will be static
    */
  var dynamic: PseudoBoolean = js.native
  
  /**
    * The element where the tooltip is going from
    */
  var from: HTMLElement = js.native
  
  /**
    * Hides the tooltip
    */
  def hide(): Unit = js.native
  
  /**
    * Indicates if the tooltip is currently showing
    */
  var on: PseudoBoolean = js.native
  
  /**
    * The mode for the tooltip, where should it go
    */
  var origin: TooltipOrigins = js.native
  
  /**
    * Indicates if the tooltip should be hidden, usually set on by `mouseout`
    */
  var shouldHide: PseudoBoolean = js.native
  
  /**
    * The html text the tooltip should have
    */
  var text: js.Function0[String] | String = js.native
  
  /**
    * The tooltip itself
    */
  var tt: HTMLDivElement = js.native
  
  /**
    * The anchor of the tooltip which is positioned with `top` and `left`
    */
  var tta: HTMLDivElement = js.native
  
  /**
    * Updates the tooltip position and contents
    */
  def update(): Unit = js.native
  
  /**
    * Does nothing @deprecated
    */
  def wobble(): Unit = js.native
  
  /**
    * Unused @deprecated
    */
  var x: Double = js.native
  
  /**
    * Unused @deprecated
    */
  var y: Double = js.native
}
