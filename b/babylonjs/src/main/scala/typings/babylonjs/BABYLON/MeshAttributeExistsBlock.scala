package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshAttributeExistsBlock
  extends StObject
     with NodeMaterialBlock {
  
  /**
    * Defines which mesh attribute to use
    */
  var attributeType: MeshAttributeExistsBlockTypes = js.native
  
  /**
    * Gets the fallback component when speciefied attribute doesn't exist
    */
  def fallback: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the input component
    */
  def input: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
}
