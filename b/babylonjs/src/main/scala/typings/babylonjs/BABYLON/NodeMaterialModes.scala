package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NodeMaterialModes extends StObject
@JSGlobal("BABYLON.NodeMaterialModes")
@js.native
object NodeMaterialModes extends StObject {
  
  /** Regular material */
  @js.native
  sealed trait Material extends NodeMaterialModes
  
  /** For particle system */
  @js.native
  sealed trait Particle extends NodeMaterialModes
  
  /** For post process */
  @js.native
  sealed trait PostProcess extends NodeMaterialModes
  
  /** For procedural texture */
  @js.native
  sealed trait ProceduralTexture extends NodeMaterialModes
}
