package typings.babylonjs.miscIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "SmartArray")
@js.native
class SmartArray[T] protected ()
  extends typings.babylonjs.smartArrayMod.SmartArray[T] {
  /**
    * Instantiates a Smart Array.
    * @param capacity defines the default capacity of the array.
    */
  def this(capacity: Double) = this()
}
/* static members */
object SmartArray {
  
  @JSImport("babylonjs/Misc/index", "SmartArray")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Misc/index", "SmartArray._GlobalId")
  @js.native
  def _GlobalId: js.Any = js.native
  @scala.inline
  def _GlobalId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GlobalId")(x.asInstanceOf[js.Any])
}
