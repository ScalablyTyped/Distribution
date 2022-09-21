package typings.cesium.mod

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PinBuilder")
@js.native
open class PinBuilder () extends StObject {
  
  /**
    * Creates an empty pin of the specified color and size.
    * @param color - The color of the pin.
    * @param size - The size of the pin, in pixels.
    * @returns The canvas element that represents the generated pin.
    */
  def fromColor(color: Color, size: Double): HTMLCanvasElement = js.native
  
  /**
    * Creates a pin with the specified {@link https://www.mapbox.com/maki/|maki} icon identifier, color, and size.
    * @param id - The id of the maki icon to be stamped onto the pin.
    * @param color - The color of the pin.
    * @param size - The size of the pin, in pixels.
    * @returns The canvas element or a Promise to the canvas element that represents the generated pin.
    */
  def fromMakiIconId(id: String, color: Color, size: Double): HTMLCanvasElement | js.Promise[HTMLCanvasElement] = js.native
  
  /**
    * Creates a pin with the specified text, color, and size.  The text will be sized to be as large as possible
    * while still being contained completely within the pin.
    * @param text - The text to be stamped onto the pin.
    * @param color - The color of the pin.
    * @param size - The size of the pin, in pixels.
    * @returns The canvas element that represents the generated pin.
    */
  def fromText(text: String, color: Color, size: Double): HTMLCanvasElement = js.native
  
  def fromUrl(url: String, color: Color, size: Double): HTMLCanvasElement | js.Promise[HTMLCanvasElement] = js.native
  /**
    * Creates a pin with the specified icon, color, and size.
    * @param url - The url of the image to be stamped onto the pin.
    * @param color - The color of the pin.
    * @param size - The size of the pin, in pixels.
    * @returns The canvas element or a Promise to the canvas element that represents the generated pin.
    */
  def fromUrl(url: Resource, color: Color, size: Double): HTMLCanvasElement | js.Promise[HTMLCanvasElement] = js.native
}
