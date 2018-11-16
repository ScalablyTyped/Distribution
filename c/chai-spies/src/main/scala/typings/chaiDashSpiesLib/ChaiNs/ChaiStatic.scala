package typings
package chaiDashSpiesLib.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChaiStatic extends js.Object {
  @JSName("spy")
  var spy_Original: chaiDashSpiesLib.ChaiSpiesNs.Spy = js.native
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
  def spy(): chaiDashSpiesLib.ChaiSpiesNs.SpyFunc0Proxy[scala.Unit] = js.native
  def spy[R](fn: chaiDashSpiesLib.ChaiSpiesNs.SpyFunc0[R]): chaiDashSpiesLib.ChaiSpiesNs.SpyFunc0Proxy[R] = js.native
  def spy[R](name: java.lang.String, fn: chaiDashSpiesLib.ChaiSpiesNs.SpyFunc0[R]): chaiDashSpiesLib.ChaiSpiesNs.SpyFunc0Proxy[R] = js.native
  def spy[A1, R](fn: chaiDashSpiesLib.ChaiSpiesNs.SpyFunc1[A1, R]): chaiDashSpiesLib.ChaiSpiesNs.SpyFunc1Proxy[A1, R] = js.native
  def spy[A1, R](name: java.lang.String, fn: chaiDashSpiesLib.ChaiSpiesNs.SpyFunc1[A1, R]): chaiDashSpiesLib.ChaiSpiesNs.SpyFunc1Proxy[A1, R] = js.native
  def spy[A1, A2, R](fn: chaiDashSpiesLib.ChaiSpiesNs.SpyFunc2[A1, A2, R]): chaiDashSpiesLib.ChaiSpiesNs.SpyFunc2Proxy[A1, A2, R] = js.native
  def spy[A1, A2, R](name: java.lang.String, fn: chaiDashSpiesLib.ChaiSpiesNs.SpyFunc2[A1, A2, R]): chaiDashSpiesLib.ChaiSpiesNs.SpyFunc2Proxy[A1, A2, R] = js.native
  def spy[A1, A2, A3, R](fn: chaiDashSpiesLib.ChaiSpiesNs.SpyFunc3[A1, A2, A3, R]): chaiDashSpiesLib.ChaiSpiesNs.SpyFunc3Proxy[A1, A2, A3, R] = js.native
  def spy[A1, A2, A3, R](name: java.lang.String, fn: chaiDashSpiesLib.ChaiSpiesNs.SpyFunc3[A1, A2, A3, R]): chaiDashSpiesLib.ChaiSpiesNs.SpyFunc3Proxy[A1, A2, A3, R] = js.native
  def spy[A1, A2, A3, A4, R](fn: chaiDashSpiesLib.ChaiSpiesNs.SpyFunc4[A1, A2, A3, A4, R]): chaiDashSpiesLib.ChaiSpiesNs.SpyFunc4Proxy[A1, A2, A3, A4, R] = js.native
  def spy[A1, A2, A3, A4, R](name: java.lang.String, fn: chaiDashSpiesLib.ChaiSpiesNs.SpyFunc4[A1, A2, A3, A4, R]): chaiDashSpiesLib.ChaiSpiesNs.SpyFunc4Proxy[A1, A2, A3, A4, R] = js.native
  def spy[A1, A2, A3, A4, A5, R](fn: chaiDashSpiesLib.ChaiSpiesNs.SpyFunc5[A1, A2, A3, A4, A5, R]): chaiDashSpiesLib.ChaiSpiesNs.SpyFunc5Proxy[A1, A2, A3, A4, A5, R] = js.native
  def spy[A1, A2, A3, A4, A5, R](name: java.lang.String, fn: chaiDashSpiesLib.ChaiSpiesNs.SpyFunc5[A1, A2, A3, A4, A5, R]): chaiDashSpiesLib.ChaiSpiesNs.SpyFunc5Proxy[A1, A2, A3, A4, A5, R] = js.native
  def spy[A1, A2, A3, A4, A5, A6, R](fn: chaiDashSpiesLib.ChaiSpiesNs.SpyFunc6[A1, A2, A3, A4, A5, A6, R]): chaiDashSpiesLib.ChaiSpiesNs.SpyFunc6Proxy[A1, A2, A3, A4, A5, A6, R] = js.native
  def spy[A1, A2, A3, A4, A5, A6, R](name: java.lang.String, fn: chaiDashSpiesLib.ChaiSpiesNs.SpyFunc6[A1, A2, A3, A4, A5, A6, R]): chaiDashSpiesLib.ChaiSpiesNs.SpyFunc6Proxy[A1, A2, A3, A4, A5, A6, R] = js.native
  def spy[A1, A2, A3, A4, A5, A6, A7, R](fn: chaiDashSpiesLib.ChaiSpiesNs.SpyFunc7[A1, A2, A3, A4, A5, A6, A7, R]): chaiDashSpiesLib.ChaiSpiesNs.SpyFunc7Proxy[A1, A2, A3, A4, A5, A6, A7, R] = js.native
  def spy[A1, A2, A3, A4, A5, A6, A7, R](name: java.lang.String, fn: chaiDashSpiesLib.ChaiSpiesNs.SpyFunc7[A1, A2, A3, A4, A5, A6, A7, R]): chaiDashSpiesLib.ChaiSpiesNs.SpyFunc7Proxy[A1, A2, A3, A4, A5, A6, A7, R] = js.native
  def spy[A1, A2, A3, A4, A5, A6, A7, A8, R](fn: chaiDashSpiesLib.ChaiSpiesNs.SpyFunc8[A1, A2, A3, A4, A5, A6, A7, A8, R]): chaiDashSpiesLib.ChaiSpiesNs.SpyFunc8Proxy[A1, A2, A3, A4, A5, A6, A7, A8, R] = js.native
  def spy[A1, A2, A3, A4, A5, A6, A7, A8, R](
    name: java.lang.String,
    fn: chaiDashSpiesLib.ChaiSpiesNs.SpyFunc8[A1, A2, A3, A4, A5, A6, A7, A8, R]
  ): chaiDashSpiesLib.ChaiSpiesNs.SpyFunc8Proxy[A1, A2, A3, A4, A5, A6, A7, A8, R] = js.native
  def spy[A1, A2, A3, A4, A5, A6, A7, A8, A9, R](fn: chaiDashSpiesLib.ChaiSpiesNs.SpyFunc9[A1, A2, A3, A4, A5, A6, A7, A8, A9, R]): chaiDashSpiesLib.ChaiSpiesNs.SpyFunc9Proxy[A1, A2, A3, A4, A5, A6, A7, A8, A9, R] = js.native
  def spy[A1, A2, A3, A4, A5, A6, A7, A8, A9, R](
    name: java.lang.String,
    fn: chaiDashSpiesLib.ChaiSpiesNs.SpyFunc9[A1, A2, A3, A4, A5, A6, A7, A8, A9, R]
  ): chaiDashSpiesLib.ChaiSpiesNs.SpyFunc9Proxy[A1, A2, A3, A4, A5, A6, A7, A8, A9, R] = js.native
  def spy[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, R](fn: chaiDashSpiesLib.ChaiSpiesNs.SpyFunc10[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, R]): chaiDashSpiesLib.ChaiSpiesNs.SpyFunc10Proxy[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, R] = js.native
  def spy[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, R](
    name: java.lang.String,
    fn: chaiDashSpiesLib.ChaiSpiesNs.SpyFunc10[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, R]
  ): chaiDashSpiesLib.ChaiSpiesNs.SpyFunc10Proxy[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, R] = js.native
}

