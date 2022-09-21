package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.SetConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Set")
@js.native
open class Set[T] ()
  extends StObject
     with typings.typescriptNn5FuAjk.Set[T] {
  def this(values: typings.typescriptNn5FuAjk.Array[T]) = this()
}
object Set {
  
  inline def apply: SetConstructor = js.Dynamic.global.selectDynamic("Set").asInstanceOf[SetConstructor]
}
