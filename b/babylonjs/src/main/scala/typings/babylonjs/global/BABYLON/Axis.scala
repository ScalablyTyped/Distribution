package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Axis")
@js.native
open class Axis ()
  extends StObject
     with typings.babylonjs.BABYLON.Axis
/* static members */
object Axis {
  
  @JSGlobal("BABYLON.Axis")
  @js.native
  val ^ : js.Any = js.native
  
  /** X axis */
  @JSGlobal("BABYLON.Axis.X")
  @js.native
  def X: typings.babylonjs.BABYLON.Vector3 = js.native
  inline def X_=(x: typings.babylonjs.BABYLON.Vector3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X")(x.asInstanceOf[js.Any])
  
  /** Y axis */
  @JSGlobal("BABYLON.Axis.Y")
  @js.native
  def Y: typings.babylonjs.BABYLON.Vector3 = js.native
  inline def Y_=(x: typings.babylonjs.BABYLON.Vector3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Y")(x.asInstanceOf[js.Any])
  
  /** Z axis */
  @JSGlobal("BABYLON.Axis.Z")
  @js.native
  def Z: typings.babylonjs.BABYLON.Vector3 = js.native
  inline def Z_=(x: typings.babylonjs.BABYLON.Vector3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z")(x.asInstanceOf[js.Any])
}
