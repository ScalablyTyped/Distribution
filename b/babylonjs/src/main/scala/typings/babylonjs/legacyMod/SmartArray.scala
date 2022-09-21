package typings.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "SmartArray")
@js.native
open class SmartArray[T] protected ()
  extends typings.babylonjs.indexMod.SmartArray[T] {
  /**
    * Instantiates a Smart Array.
    * @param capacity defines the default capacity of the array.
    */
  def this(capacity: Double) = this()
}
/* static members */
object SmartArray {
  
  @JSImport("babylonjs/Legacy/legacy", "SmartArray")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "SmartArray._GlobalId")
  @js.native
  def _GlobalId: Any = js.native
  inline def _GlobalId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GlobalId")(x.asInstanceOf[js.Any])
}
