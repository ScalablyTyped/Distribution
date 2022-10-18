package typings.cypress.anon

import typings.cypress.typesLodashMod.MapCacheConstructor
import typings.cypress.typesLodashMod.MemoizedFunction
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call extends StObject {
  
  def apply[T /* <: js.Function1[/* args */ Any, Any] */](func: T): T & MemoizedFunction = js.native
  def apply[T /* <: js.Function1[/* args */ Any, Any] */](func: T, resolver: js.Function1[/* args */ Parameters[T], Any]): T & MemoizedFunction = js.native
  
  var Cache: MapCacheConstructor = js.native
}
