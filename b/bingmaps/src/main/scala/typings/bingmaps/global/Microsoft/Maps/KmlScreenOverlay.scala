package typings.bingmaps.global.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.IKmlScreenOverlayOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Microsoft.Maps.KmlScreenOverlay")
@js.native
/**
  * @constructor
  * @param htmlElement The new htmlElement to set for the overlay.
  * @param options The options to customize the screen overlay.
  */
open class KmlScreenOverlay ()
  extends StObject
     with typings.bingmaps.Microsoft.Maps.KmlScreenOverlay {
  def this(htmlElement: String) = this()
  def this(htmlElement: HTMLElement) = this()
  def this(htmlElement: String, options: IKmlScreenOverlayOptions) = this()
  def this(htmlElement: Unit, options: IKmlScreenOverlayOptions) = this()
  def this(htmlElement: HTMLElement, options: IKmlScreenOverlayOptions) = this()
}
