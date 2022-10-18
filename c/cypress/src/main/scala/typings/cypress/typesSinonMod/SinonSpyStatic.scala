package typings.cypress.typesSinonMod

import typings.cypress.anon.Get
import typings.cypress.cypressStrings.get_
import typings.cypress.cypressStrings.set
import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SinonSpyStatic extends StObject {
  
  /**
    * Creates an anonymous function that records arguments, this value, exceptions and return values for all calls.
    */
  def apply(): SinonSpy[js.Array[Any], Any] = js.native
  /**
    * Spies on the provided function
    */
  def apply[F /* <: js.Function1[/* repeated */ Any, Any] */](func: F): SinonSpy[Parameters[F], ReturnType[F]] = js.native
  /**
    * Creates a spy for object.method and replaces the original method with the spy.
    * An exception is thrown if the property is not already a function.
    * The spy acts exactly like the original method in all cases.
    * The original method can be restored by calling object.method.restore().
    * The returned spy is the function object which replaced the original method. spy === object.method.
    */
  def apply[T, K /* <: /* keyof T */ String */](obj: T, method: K): /* import warning: importer.ImportType#apply Failed type conversion: T[K] extends (args : infer TArgs): infer TReturnValue ? cypress.cypress/types/sinon.SinonSpy<TArgs, TReturnValue> : cypress.cypress/types/sinon.SinonSpy<std.Array<any>, any> */ js.Any = js.native
  def apply[T, K /* <: /* keyof T */ String */](obj: T, method: K, types: js.Array[get_ | set]): js.PropertyDescriptor & (Get[T, K]) = js.native
}
