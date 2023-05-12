package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FragDepthBlock
  extends StObject
     with NodeMaterialBlock {
  
  /**
    * Gets the depth input component
    */
  def depth: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the viewProjection input component
    */
  def viewProjection: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the worldPos input component
    */
  def worldPos: NodeMaterialConnectionPoint = js.native
}
