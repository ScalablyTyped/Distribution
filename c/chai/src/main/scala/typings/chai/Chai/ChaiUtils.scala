package typings.chai.Chai

import typings.chai.chaiNumbers.`-1`
import typings.chai.chaiNumbers.`1`
import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChaiUtils extends js.Object {
  def addChainableMethod(
    // object to define the method on, e.g. chai.Assertion.prototype
  ctx: js.Object,
    // method name
  name: String,
    // method itself; any arguments
  method: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = js.native
  def addChainableMethod(
    // object to define the method on, e.g. chai.Assertion.prototype
  ctx: js.Object,
    // method name
  name: String,
    // method itself; any arguments
  method: js.Function1[/* repeated */ js.Any, Unit],
    // called when property is accessed
  chainingBehavior: js.Function0[Unit]
  ): Unit = js.native
  def addLengthGuard(fn: js.Function, assertionName: String, isChainable: Boolean): Unit = js.native
  def addMethod(ctx: js.Object, name: String, method: js.Function): Unit = js.native
  def addProperty(ctx: js.Object, name: String, getter: js.Function0[_]): Unit = js.native
  def compareByInspect(a: js.Object, b: js.Object): `-1` | `1` = js.native
  def compatibleConstructor(thrown: Error, errorLike: ErrorConstructor): Boolean = js.native
  def compatibleConstructor(thrown: Error, errorLike: Error): Boolean = js.native
  def compatibleInstance(thrown: Error, errorLike: ErrorConstructor): Boolean = js.native
  def compatibleInstance(thrown: Error, errorLike: Error): Boolean = js.native
  def compatibleMessage(thrown: Error, errMatcher: String): Boolean = js.native
  def compatibleMessage(thrown: Error, errMatcher: RegExp): Boolean = js.native
  def expectTypes(obj: js.Object, types: js.Array[String]): Unit = js.native
  def flag(obj: js.Object, key: String): js.Any = js.native
  def flag(obj: js.Object, key: String, value: js.Any): js.Any = js.native
  def getActual(obj: js.Object, args: AssertionArgs): js.Any = js.native
  def getConstructorName(constructorFn: js.Function): String = js.native
  def getEnumerableProperties(obj: js.Object): js.Array[String] = js.native
  def getFuncName(constructorFn: js.Function): String | Null = js.native
  def getMessage(errorLike: String): String = js.native
  def getMessage(errorLike: Error): String = js.native
  def getMessage(obj: js.Any, args: AssertionArgs): String = js.native
  def getOwnEnumerableProperties(obj: js.Object): js.Array[String | js.Symbol] = js.native
  def getOwnEnumerablePropertySymbols(obj: js.Object): js.Array[js.Symbol] = js.native
  def getPathInfo(obj: js.Object, path: String): PathInfo = js.native
  def getPathValue(obj: js.Object, path: String): js.UndefOr[js.Object] = js.native
  def getProperties(obj: js.Object): js.Array[String] = js.native
  // Reexports from pathval:
  def hasProperty(obj: js.UndefOr[Null | js.Object], name: ObjectProperty): Boolean = js.native
  def inspect(obj: js.Any): Unit = js.native
  def inspect(obj: js.Any, showHidden: Boolean): Unit = js.native
  def inspect(obj: js.Any, showHidden: Boolean, depth: Double): Unit = js.native
  def inspect(obj: js.Any, showHidden: Boolean, depth: Double, colors: Boolean): Unit = js.native
  def isProxyEnabled(): Boolean = js.native
  def objDisplay(obj: js.Object): Unit = js.native
  def overwriteChainableMethod(ctx: js.Object, name: String, method: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def overwriteChainableMethod(
    ctx: js.Object,
    name: String,
    method: js.Function1[/* repeated */ js.Any, Unit],
    chainingBehavior: js.Function0[Unit]
  ): Unit = js.native
  def overwriteMethod(ctx: js.Object, name: String, method: js.Function): Unit = js.native
  def overwriteProperty(ctx: js.Object, name: String, getter: js.Function0[_]): Unit = js.native
  def proxify(obj: js.Object, nonChainableMethodName: String): js.Object = js.native
  def test(obj: js.Object, args: AssertionArgs): Boolean = js.native
  def transferFlags(assertion: Assertion, obj: js.Object): Unit = js.native
  def transferFlags(assertion: Assertion, obj: js.Object, includeAll: Boolean): Unit = js.native
}

