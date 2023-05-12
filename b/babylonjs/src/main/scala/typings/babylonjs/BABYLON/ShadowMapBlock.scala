package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShadowMapBlock
  extends StObject
     with NodeMaterialBlock {
  
  /**
    * Gets the depth output component
    */
  def depth: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the view x projection input component
    */
  def viewProjection: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the world normal input component
    */
  def worldNormal: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the world position input component
    */
  def worldPosition: NodeMaterialConnectionPoint = js.native
}
