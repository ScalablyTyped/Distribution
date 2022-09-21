package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.WeakRefConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("WeakRef")
@js.native
/**
  * Creates a WeakRef instance for the given target object.
  * @param target The target object for the WeakRef instance.
  */
open class WeakRef[T /* <: js.Object */] ()
  extends StObject
     with typings.typescriptNn5FuAjk.WeakRef[T] {
  /**
    * Creates a WeakRef instance for the given target object.
    * @param target The target object for the WeakRef instance.
    */
  def this(target: T) = this()
}
object WeakRef {
  
  inline def apply: WeakRefConstructor = js.Dynamic.global.selectDynamic("WeakRef").asInstanceOf[WeakRefConstructor]
}
