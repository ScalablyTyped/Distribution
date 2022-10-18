package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeEnumsNodeMaterialModesMod {
  
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
    /* 0 */ val Material: typings.babylonjs.materialsNodeEnumsNodeMaterialModesMod.NodeMaterialModes.Material & Double = js.native
    
    /** For particle system */
    @js.native
    sealed trait Particle
      extends StObject
         with NodeMaterialModes
    /* 2 */ val Particle: typings.babylonjs.materialsNodeEnumsNodeMaterialModesMod.NodeMaterialModes.Particle & Double = js.native
    
    /** For post process */
    @js.native
    sealed trait PostProcess
      extends StObject
         with NodeMaterialModes
    /* 1 */ val PostProcess: typings.babylonjs.materialsNodeEnumsNodeMaterialModesMod.NodeMaterialModes.PostProcess & Double = js.native
    
    /** For procedural texture */
    @js.native
    sealed trait ProceduralTexture
      extends StObject
         with NodeMaterialModes
    /* 3 */ val ProceduralTexture: typings.babylonjs.materialsNodeEnumsNodeMaterialModesMod.NodeMaterialModes.ProceduralTexture & Double = js.native
  }
}
