package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SmartArray")
@js.native
class SmartArray[T] protected ()
  extends typings.babylonjs.BABYLON.SmartArray[T] {
  /**
    * Instantiates a Smart Array.
    * @param capacity defines the default capacity of the array.
    */
  def this(capacity: Double) = this()
}
/* static members */
object SmartArray {
  
  @JSGlobal("BABYLON.SmartArray")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.SmartArray._GlobalId")
  @js.native
  def _GlobalId: js.Any = js.native
  @scala.inline
  def _GlobalId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GlobalId")(x.asInstanceOf[js.Any])
}
