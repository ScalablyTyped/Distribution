package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoronoiNoiseBlock
  extends StObject
     with NodeMaterialBlock {
  
  /**
    * Gets the output component
    */
  def cells: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the density input component
    */
  def density: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the offset input component
    */
  def offset: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the seed input component
    */
  def seed: NodeMaterialConnectionPoint = js.native
}
