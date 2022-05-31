package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PositionNormalVertex")
@js.native
/**
  * Creates a PositionNormalVertex
  * @param position the position of the vertex (defaut: 0,0,0)
  * @param normal the normal of the vertex (defaut: 0,1,0)
  */
class PositionNormalVertex ()
  extends StObject
     with typings.babylonjs.BABYLON.PositionNormalVertex {
  def this(/** the position of the vertex (defaut: 0,0,0) */
  position: typings.babylonjs.BABYLON.Vector3) = this()
  def this(
    /** the position of the vertex (defaut: 0,0,0) */
  position: Unit,
    /** the normal of the vertex (defaut: 0,1,0) */
  normal: typings.babylonjs.BABYLON.Vector3
  ) = this()
  def this(
    /** the position of the vertex (defaut: 0,0,0) */
  position: typings.babylonjs.BABYLON.Vector3,
    /** the normal of the vertex (defaut: 0,1,0) */
  normal: typings.babylonjs.BABYLON.Vector3
  ) = this()
  
  /** the normal of the vertex (defaut: 0,1,0) */
  /* CompleteClass */
  var normal: typings.babylonjs.BABYLON.Vector3 = js.native
  
  /** the position of the vertex (defaut: 0,0,0) */
  /* CompleteClass */
  var position: typings.babylonjs.BABYLON.Vector3 = js.native
}
