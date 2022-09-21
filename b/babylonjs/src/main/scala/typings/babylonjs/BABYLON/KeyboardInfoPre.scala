package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyboardInfoPre
  extends StObject
     with KeyboardInfo {
  
  /**
    * Defines whether the engine should skip the next onKeyboardObservable associated to this pre.
    */
  var skipOnKeyboardObservable: Boolean = js.native
  
  /**
    * Defines whether the engine should skip the next onKeyboardObservable associated to this pre.
    * @deprecated use skipOnKeyboardObservable property instead
    */
  def skipOnPointerObservable: Boolean = js.native
  def skipOnPointerObservable_=(value: Boolean): Unit = js.native
}
