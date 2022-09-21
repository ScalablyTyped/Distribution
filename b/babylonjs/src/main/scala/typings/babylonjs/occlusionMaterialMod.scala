package typings.babylonjs

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.shaderMaterialMod.ShaderMaterial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object occlusionMaterialMod {
  
  @JSImport("babylonjs/Materials/Occlusion/occlusionMaterial", "OcclusionMaterial")
  @js.native
  open class OcclusionMaterial protected () extends ShaderMaterial {
    def this(name: String, scene: Scene) = this()
  }
}
