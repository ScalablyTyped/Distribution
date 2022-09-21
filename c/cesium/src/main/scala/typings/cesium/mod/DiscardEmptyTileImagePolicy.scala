package typings.cesium.mod

import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "DiscardEmptyTileImagePolicy")
@js.native
open class DiscardEmptyTileImagePolicy () extends StObject {
  
  /**
    * Determines if the discard policy is ready to process images.
    * @returns True if the discard policy is ready to process images; otherwise, false.
    */
  def isReady(): Boolean = js.native
  
  /**
    * Given a tile image, decide whether to discard that image.
    * @param image - An image to test.
    * @returns True if the image should be discarded; otherwise, false.
    */
  def shouldDiscardImage(image: HTMLImageElement): Boolean = js.native
}
/* static members */
object DiscardEmptyTileImagePolicy {
  
  /**
    * Default value for representing an empty image.
    */
  @JSImport("cesium", "DiscardEmptyTileImagePolicy.EMPTY_IMAGE")
  @js.native
  val EMPTY_IMAGE: HTMLImageElement = js.native
}
