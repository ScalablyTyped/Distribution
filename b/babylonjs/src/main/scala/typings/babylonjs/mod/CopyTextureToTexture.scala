package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "CopyTextureToTexture")
@js.native
open class CopyTextureToTexture protected ()
  extends typings.babylonjs.legacyLegacyMod.CopyTextureToTexture {
  /**
    * Constructs a new instance of the class
    * @param engine The engine to use for the copy
    * @param isDepthTexture True means that we should write (using gl_FragDepth) into the depth texture attached to the destination (default: false)
    */
  def this(engine: typings.babylonjs.enginesThinEngineMod.ThinEngine) = this()
  def this(engine: typings.babylonjs.enginesThinEngineMod.ThinEngine, isDepthTexture: Boolean) = this()
}
