package typings.cesiumEngine.mod

import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "NeverTileDiscardPolicy")
@js.native
open class NeverTileDiscardPolicy () extends StObject {
  
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
