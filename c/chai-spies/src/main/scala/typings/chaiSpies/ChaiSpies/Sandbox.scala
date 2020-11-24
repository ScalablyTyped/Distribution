package typings.chaiSpies.ChaiSpies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sandbox extends js.Object {
  
  /**
    * #### chai.spy.on (function)
    *
    * Wraps an object method into spy. All calls will pass through to the original function.
    *
    * @param {Object} object
    * @param {String} methodNames names to spy on
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
    * Restores previously wrapped object's method.
    * Restores all spied objects of a sandbox if called without parameters.
    *
    * @function
    * @param {Object} [object]
    * @param {String|String[]} [methods] name or names
    * @return {Sandbox} Sandbox instance
    */
  def restore(): Unit = js.native
  def restore(`object`: js.UndefOr[scala.Nothing], methodNames: String): Unit = js.native
  def restore(`object`: js.UndefOr[scala.Nothing], methodNames: js.Array[String]): Unit = js.native
  def restore(`object`: js.Object): Unit = js.native
  def restore(`object`: js.Object, methodNames: String): Unit = js.native
  def restore(`object`: js.Object, methodNames: js.Array[String]): Unit = js.native
}
