package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.FinalizationRegistryConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("FinalizationRegistry")
@js.native
open class FinalizationRegistry[T] protected ()
  extends StObject
     with typings.typescriptNn5FuAjk.FinalizationRegistry[T] {
  /**
    * Creates a finalization registry with an associated cleanup callback
    * @param cleanupCallback The callback to call after an object in the registry has been reclaimed.
    */
  def this(cleanupCallback: js.Function1[/* heldValue */ T, Unit]) = this()
}
object FinalizationRegistry {
  
  inline def apply: FinalizationRegistryConstructor = js.Dynamic.global.selectDynamic("FinalizationRegistry").asInstanceOf[FinalizationRegistryConstructor]
}
