package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.CopyTextureToTexture")
@js.native
open class CopyTextureToTexture protected ()
  extends StObject
     with typings.babylonjs.BABYLON.CopyTextureToTexture {
  /**
    * Constructs a new instance of the class
    * @param engine The engine to use for the copy
    * @param isDepthTexture True means that we should write (using gl_FragDepth) into the depth texture attached to the destination (default: false)
    */
  def this(engine: typings.babylonjs.BABYLON.ThinEngine) = this()
  def this(engine: typings.babylonjs.BABYLON.ThinEngine, isDepthTexture: Boolean) = this()
}
