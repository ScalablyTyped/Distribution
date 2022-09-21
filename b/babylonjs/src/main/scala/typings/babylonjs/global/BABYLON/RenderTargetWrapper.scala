package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.TextureSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.RenderTargetWrapper")
@js.native
open class RenderTargetWrapper protected ()
  extends StObject
     with typings.babylonjs.BABYLON.RenderTargetWrapper {
  /**
    * Initializes the render target wrapper
    * @param isMulti true if the wrapper is a multi render target
    * @param isCube true if the wrapper should render to a cube texture
    * @param size size of the render target (width/height/layers)
    * @param engine engine used to create the render target
    */
  def this(isMulti: Boolean, isCube: Boolean, size: TextureSize, engine: typings.babylonjs.BABYLON.ThinEngine) = this()
}
