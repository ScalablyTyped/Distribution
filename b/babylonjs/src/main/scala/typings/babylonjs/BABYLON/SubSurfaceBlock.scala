package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubSurfaceBlock
  extends StObject
     with NodeMaterialBlock {
  
  def autoConfigure(): Unit = js.native
  
  /**
    * Gets the refraction object parameters
    */
  def refraction: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the sub surface object output component
    */
  def subsurface: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the thickness component
    */
  def thickness: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the tint color input component
    */
  def tintColor: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the translucency diffusion distance input component
    */
  def translucencyDiffusionDist: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the translucency intensity input component
    */
  def translucencyIntensity: NodeMaterialConnectionPoint = js.native
}
