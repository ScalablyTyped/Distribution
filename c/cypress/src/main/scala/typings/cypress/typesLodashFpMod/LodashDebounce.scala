package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.DebouncedFunc
import typings.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashDebounce extends StObject {
  
  def apply(wait: Double): LodashDebounce1x1 = js.native
  def apply[T /* <: js.Function1[/* args */ Any, Any] */](wait: Double, func: T): DebouncedFunc[T] = js.native
  def apply[T /* <: js.Function1[/* args */ Any, Any] */](wait: __, func: T): LodashDebounce1x2[T] = js.native
}
