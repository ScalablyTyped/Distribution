package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.NodeMaterialConnectionPoint")
@js.native
class NodeMaterialConnectionPoint protected ()
  extends StObject
     with typings.babylonjs.BABYLON.NodeMaterialConnectionPoint {
  /**
    * Creates a new connection point
    * @param name defines the connection point name
    * @param ownerBlock defines the block hosting this connection point
    * @param direction defines the direction of the connection point
    */
  def this(
    name: String,
    ownerBlock: typings.babylonjs.BABYLON.NodeMaterialBlock,
    direction: typings.babylonjs.BABYLON.NodeMaterialConnectionPointDirection
  ) = this()
}
/* static members */
object NodeMaterialConnectionPoint {
  
  @JSGlobal("BABYLON.NodeMaterialConnectionPoint")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Checks if two types are equivalent
    * @param type1 type 1 to check
    * @param type2 type 2 to check
    * @returns true if both types are equivalent, else false
    */
  inline def AreEquivalentTypes(type1: Double, type2: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("AreEquivalentTypes")(type1.asInstanceOf[js.Any], type2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
