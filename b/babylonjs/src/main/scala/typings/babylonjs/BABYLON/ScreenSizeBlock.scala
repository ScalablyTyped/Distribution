package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreenSizeBlock
  extends StObject
     with NodeMaterialBlock {
  
  /* private */ var _scene: Any = js.native
  
  /* private */ var _varName: Any = js.native
  
  def bind(effect: Effect): Unit = js.native
  
  /* protected */ def writeOutputs(state: NodeMaterialBuildState, varName: String): String = js.native
  
  /**
    * Gets the x component
    */
  def x: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the xy component
    */
  def xy: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the y component
    */
  def y: NodeMaterialConnectionPoint = js.native
}
