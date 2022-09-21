package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PositionNormalTextureVertex")
@js.native
/**
  * Creates a PositionNormalTextureVertex
  * @param position the position of the vertex (defaut: 0,0,0)
  * @param normal the normal of the vertex (defaut: 0,1,0)
  * @param uv the uv of the vertex (default: 0,0)
  */
open class PositionNormalTextureVertex ()
  extends StObject
     with typings.babylonjs.BABYLON.PositionNormalTextureVertex {
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
  def this(
    /** the position of the vertex (defaut: 0,0,0) */
  position: Unit,
    /** the normal of the vertex (defaut: 0,1,0) */
  normal: Unit,
    /** the uv of the vertex (default: 0,0) */
  uv: typings.babylonjs.BABYLON.Vector2
  ) = this()
  def this(
    /** the position of the vertex (defaut: 0,0,0) */
  position: Unit,
    /** the normal of the vertex (defaut: 0,1,0) */
  normal: typings.babylonjs.BABYLON.Vector3,
    /** the uv of the vertex (default: 0,0) */
  uv: typings.babylonjs.BABYLON.Vector2
  ) = this()
  def this(
    /** the position of the vertex (defaut: 0,0,0) */
  position: typings.babylonjs.BABYLON.Vector3,
    /** the normal of the vertex (defaut: 0,1,0) */
  normal: Unit,
    /** the uv of the vertex (default: 0,0) */
  uv: typings.babylonjs.BABYLON.Vector2
  ) = this()
  def this(
    /** the position of the vertex (defaut: 0,0,0) */
  position: typings.babylonjs.BABYLON.Vector3,
    /** the normal of the vertex (defaut: 0,1,0) */
  normal: typings.babylonjs.BABYLON.Vector3,
    /** the uv of the vertex (default: 0,0) */
  uv: typings.babylonjs.BABYLON.Vector2
  ) = this()
  
  /** the normal of the vertex (defaut: 0,1,0) */
  /* CompleteClass */
  var normal: typings.babylonjs.BABYLON.Vector3 = js.native
  
  /** the position of the vertex (defaut: 0,0,0) */
  /* CompleteClass */
  var position: typings.babylonjs.BABYLON.Vector3 = js.native
  
  /** the uv of the vertex (default: 0,0) */
  /* CompleteClass */
  var uv: typings.babylonjs.BABYLON.Vector2 = js.native
}
