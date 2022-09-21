package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Collider")
@js.native
open class Collider ()
  extends StObject
     with typings.babylonjs.BABYLON.Collider
/* static members */
object Collider {
  
  @JSGlobal("BABYLON.Collider")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * If true, it check for double sided faces and only returns 1 collision instead of 2
    */
  @JSGlobal("BABYLON.Collider.DoubleSidedCheck")
  @js.native
  def DoubleSidedCheck: Boolean = js.native
  inline def DoubleSidedCheck_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DoubleSidedCheck")(x.asInstanceOf[js.Any])
}
