package typings.babylonjs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Node/Enums/nodeMaterialModes", JSImport.Namespace)
@js.native
object nodeMaterialModesMod extends js.Object {
  
  @js.native
  sealed trait NodeMaterialModes extends js.Object
  @js.native
  object NodeMaterialModes extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NodeMaterialModes with Double] = js.native
    
    /** Regular material */
    @js.native
    sealed trait Material extends NodeMaterialModes
    /* 0 */ @js.native
    object Material extends TopLevel[Material with Double]
    
    /** For particle system */
    @js.native
    sealed trait Particle extends NodeMaterialModes
    /* 2 */ @js.native
    object Particle extends TopLevel[Particle with Double]
    
    /** For post process */
    @js.native
    sealed trait PostProcess extends NodeMaterialModes
    /* 1 */ @js.native
    object PostProcess extends TopLevel[PostProcess with Double]
    
    /** For procedural texture */
    @js.native
    sealed trait ProceduralTexture extends NodeMaterialModes
    /* 3 */ @js.native
    object ProceduralTexture extends TopLevel[ProceduralTexture with Double]
  }
}
