package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "Collider")
@js.native
open class Collider ()
  extends typings.babylonjs.collisionsIndexMod.Collider
/* static members */
object Collider {
  
  @JSImport("babylonjs/index", "Collider")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * If true, it check for double sided faces and only returns 1 collision instead of 2
    */
  @JSImport("babylonjs/index", "Collider.DoubleSidedCheck")
  @js.native
  def DoubleSidedCheck: Boolean = js.native
  inline def DoubleSidedCheck_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DoubleSidedCheck")(x.asInstanceOf[js.Any])
}
