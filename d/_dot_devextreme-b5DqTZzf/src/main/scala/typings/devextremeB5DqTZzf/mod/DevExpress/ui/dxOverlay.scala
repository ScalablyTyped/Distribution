package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.core.utils.DxPromise
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxOverlay[TProperties]
  extends StObject
     with Widget[TProperties] {
  
  /**
    * Gets the UI component&apos;s content.
    */
  def content(): DxElement_[HTMLElement] = js.native
  
  /**
    * Hides the UI component.
    */
  def hide(): DxPromise[Boolean] = js.native
  
  /**
    * Shows the UI component.
    */
  def show(): DxPromise[Boolean] = js.native
  
  /**
    * Shows or hides the UI component depending on the argument.
    */
  def toggle(showing: Boolean): DxPromise[Boolean] = js.native
}
