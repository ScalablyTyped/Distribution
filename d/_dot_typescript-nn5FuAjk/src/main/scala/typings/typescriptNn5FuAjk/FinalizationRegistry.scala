package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinalizationRegistry[T] extends StObject {
  
  /**
    * Registers an object with the registry.
    * @param target The target object to register.
    * @param heldValue The value to pass to the finalizer for this object. This cannot be the
    * target object.
    * @param unregisterToken The token to pass to the unregister method to unregister the target
    * object. If provided (and not undefined), this must be an object. If not provided, the target
    * cannot be unregistered.
    */
  def register(target: js.Object, heldValue: Any | T): Unit = js.native
  def register(target: js.Object, heldValue: Any | T, unregisterToken: js.Object): Unit = js.native
  
  @JSName(js.Symbol.toStringTag)
  val toStringTag: typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.FinalizationRegistry = js.native
  
  /**
    * Unregisters an object from the registry.
    * @param unregisterToken The token that was used as the unregisterToken argument when calling
    * register to register the target object.
    */
  def unregister(unregisterToken: js.Object): Unit = js.native
}
