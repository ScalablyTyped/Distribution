package typings.cesium.mod

import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "TileDiscardPolicy")
@js.native
class TileDiscardPolicy () extends StObject {
  
  def isReady(): Boolean = js.native
  
  def shouldDiscardImage(image: js.Promise[HTMLImageElement]): js.Promise[Boolean] = js.native
  def shouldDiscardImage(image: HTMLImageElement): js.Promise[Boolean] = js.native
}
