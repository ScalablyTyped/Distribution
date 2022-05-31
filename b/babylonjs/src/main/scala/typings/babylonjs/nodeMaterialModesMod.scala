package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMaterialModesMod {
  
  @js.native
  sealed trait NodeMaterialModes extends StObject
  @JSImport("babylonjs/Materials/Node/Enums/nodeMaterialModes", "NodeMaterialModes")
  @js.native
  object NodeMaterialModes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NodeMaterialModes & Double] = js.native
    
    /** Regular material */
    @js.native
    sealed trait Material
      extends StObject
         with NodeMaterialModes
    /* 0 */ val Material: typings.babylonjs.nodeMaterialModesMod.NodeMaterialModes.Material & Double = js.native
    
    /** For particle system */
    @js.native
    sealed trait Particle
      extends StObject
         with NodeMaterialModes
    /* 2 */ val Particle: typings.babylonjs.nodeMaterialModesMod.NodeMaterialModes.Particle & Double = js.native
    
    /** For post process */
    @js.native
    sealed trait PostProcess
      extends StObject
         with NodeMaterialModes
    /* 1 */ val PostProcess: typings.babylonjs.nodeMaterialModesMod.NodeMaterialModes.PostProcess & Double = js.native
    
    /** For procedural texture */
    @js.native
    sealed trait ProceduralTexture
      extends StObject
         with NodeMaterialModes
    /* 3 */ val ProceduralTexture: typings.babylonjs.nodeMaterialModesMod.NodeMaterialModes.ProceduralTexture & Double = js.native
  }
}
