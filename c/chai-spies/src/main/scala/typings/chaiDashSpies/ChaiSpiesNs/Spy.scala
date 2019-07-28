package typings.chaiDashSpies.ChaiSpiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spy extends js.Object {
  /**
    * #### chai.spy (function)
    *
    * Wraps a function in a proxy function. All calls will pass through to the original function.
    * ```ts
    * function original() {}
    * var spy = chai.spy(original)
    *   , e_spy = chai.spy();
    * ```
    * @param fn function to spy on. @default ```function () {}```
    * @returns function to actually call
    */
  def apply(): SpyFunc0Proxy[Unit] = js.native
  def apply[R](fn: SpyFunc0[R]): SpyFunc0Proxy[R] = js.native
  def apply[R](name: String, fn: SpyFunc0[R]): SpyFunc0Proxy[R] = js.native
  def apply[A1, R](fn: SpyFunc1[A1, R]): SpyFunc1Proxy[A1, R] = js.native
  def apply[A1, R](name: String, fn: SpyFunc1[A1, R]): SpyFunc1Proxy[A1, R] = js.native
  def apply[A1, A2, R](fn: SpyFunc2[A1, A2, R]): SpyFunc2Proxy[A1, A2, R] = js.native
  def apply[A1, A2, R](name: String, fn: SpyFunc2[A1, A2, R]): SpyFunc2Proxy[A1, A2, R] = js.native
  def apply[A1, A2, A3, R](fn: SpyFunc3[A1, A2, A3, R]): SpyFunc3Proxy[A1, A2, A3, R] = js.native
  def apply[A1, A2, A3, R](name: String, fn: SpyFunc3[A1, A2, A3, R]): SpyFunc3Proxy[A1, A2, A3, R] = js.native
  def apply[A1, A2, A3, A4, R](fn: SpyFunc4[A1, A2, A3, A4, R]): SpyFunc4Proxy[A1, A2, A3, A4, R] = js.native
  def apply[A1, A2, A3, A4, R](name: String, fn: SpyFunc4[A1, A2, A3, A4, R]): SpyFunc4Proxy[A1, A2, A3, A4, R] = js.native
  def apply[A1, A2, A3, A4, A5, R](fn: SpyFunc5[A1, A2, A3, A4, A5, R]): SpyFunc5Proxy[A1, A2, A3, A4, A5, R] = js.native
  def apply[A1, A2, A3, A4, A5, R](name: String, fn: SpyFunc5[A1, A2, A3, A4, A5, R]): SpyFunc5Proxy[A1, A2, A3, A4, A5, R] = js.native
  def apply[A1, A2, A3, A4, A5, A6, R](fn: SpyFunc6[A1, A2, A3, A4, A5, A6, R]): SpyFunc6Proxy[A1, A2, A3, A4, A5, A6, R] = js.native
  def apply[A1, A2, A3, A4, A5, A6, R](name: String, fn: SpyFunc6[A1, A2, A3, A4, A5, A6, R]): SpyFunc6Proxy[A1, A2, A3, A4, A5, A6, R] = js.native
  def apply[A1, A2, A3, A4, A5, A6, A7, R](fn: SpyFunc7[A1, A2, A3, A4, A5, A6, A7, R]): SpyFunc7Proxy[A1, A2, A3, A4, A5, A6, A7, R] = js.native
  def apply[A1, A2, A3, A4, A5, A6, A7, R](name: String, fn: SpyFunc7[A1, A2, A3, A4, A5, A6, A7, R]): SpyFunc7Proxy[A1, A2, A3, A4, A5, A6, A7, R] = js.native
  def apply[A1, A2, A3, A4, A5, A6, A7, A8, R](fn: SpyFunc8[A1, A2, A3, A4, A5, A6, A7, A8, R]): SpyFunc8Proxy[A1, A2, A3, A4, A5, A6, A7, A8, R] = js.native
  def apply[A1, A2, A3, A4, A5, A6, A7, A8, R](name: String, fn: SpyFunc8[A1, A2, A3, A4, A5, A6, A7, A8, R]): SpyFunc8Proxy[A1, A2, A3, A4, A5, A6, A7, A8, R] = js.native
  def apply[A1, A2, A3, A4, A5, A6, A7, A8, A9, R](fn: SpyFunc9[A1, A2, A3, A4, A5, A6, A7, A8, A9, R]): SpyFunc9Proxy[A1, A2, A3, A4, A5, A6, A7, A8, A9, R] = js.native
  def apply[A1, A2, A3, A4, A5, A6, A7, A8, A9, R](name: String, fn: SpyFunc9[A1, A2, A3, A4, A5, A6, A7, A8, A9, R]): SpyFunc9Proxy[A1, A2, A3, A4, A5, A6, A7, A8, A9, R] = js.native
  def apply[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, R](fn: SpyFunc10[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, R]): SpyFunc10Proxy[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, R] = js.native
  def apply[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, R](name: String, fn: SpyFunc10[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, R]): SpyFunc10Proxy[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, R] = js.native
  def `object`(methods: js.Array[String]): js.Any = js.native
  /**
    * #### chai.spy.object (function)
    *
    * Creates an object with spied methods.
    * ```ts
    * var object = chai.spy.object('Array', [ 'push', 'pop' ]);
    * ```
    * @param {String} [name] object name
    * @param {String[]|Object} method names or method definitions
    * @returns object with spied methods
    */
  def `object`(name: String, methods: js.Array[String]): js.Any = js.native
  def `object`[T](methods: T): T = js.native
  def `object`[T](name: String, methods: T): T = js.native
  /**
    * #### chai.spy.on (function)
    *
    * Wraps an object method into spy. All calls will pass through to the original function.
    * ```ts
    * var spy = chai.spy.on(Array, 'isArray');
    * ```
    * @param {Object} object
    * @param {String} method names to spy on
    * @param {function} fn replacement function
    * @returns function to actually call
    */
  def on(`object`: js.Object, methodNames: String): js.Any = js.native
  def on(
    `object`: js.Object,
    methodNames: String,
    fn: js.Function1[/* parameters */ js.Array[_] | js.Any, _]
  ): js.Any = js.native
  def on(`object`: js.Object, methodNames: js.Array[String]): js.Any = js.native
  def on(
    `object`: js.Object,
    methodNames: js.Array[String],
    fn: js.Function1[/* parameters */ js.Array[_] | js.Any, _]
  ): js.Any = js.native
  /**
    * #### chai.spy.restore (function)
    *
    * Restores spy assigned to DEFAULT sandbox
    *
    * Restores previously wrapped object's method.
    * Restores all spied objects of a sandbox if called without parameters.
    *
    * @param {Object} [object]
    * @param {String|String[]} [methods] name or names
    * @return {Sandbox} Sandbox instance
    */
  def restore(): Unit = js.native
  def restore(`object`: js.Object): Unit = js.native
  def restore(`object`: js.Object, methodNames: String): Unit = js.native
  def restore(`object`: js.Object, methodNames: js.Array[String]): Unit = js.native
  /**
    * #### chai.spy.returns (function)
    *
    * Creates a spy which returns static value.
    *```ts
    *      var method = chai.spy.returns(true);
    *```
    * @param {*} value static value which is returned by spy
    * @returns new spy function which returns static value
    * @api public
    */
  def returns[T](value: T): SpyFunc0Proxy[T] = js.native
  /**
    * ### chai.spy.sandbox
    *
    * Creates a sandbox.
    *
    * Sandbox is a set of spies.
    * Sandbox allows to track methods on objects and restore original methods with on restore call.
    *
    * @returns {Sandbox}
    */
  def sandbox(): Sandbox = js.native
}

