package typings
package cypressLib.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChaiStatic extends js.Object {
  var AssertionError: org.scalablytyped.runtime.Instantiable3[
    /* message */ java.lang.String, 
    js.UndefOr[/* _props */ js.Any], 
    js.UndefOr[/* ssf */ js.Function], 
    AssertionError
  ] = js.native
  @JSName("assert")
  var assert_Original: AssertStatic = js.native
  var config: Config = js.native
  var expect: ExpectStatic = js.native
  var version: java.lang.String = js.native
  /**
    * @param expression    Expression to test for truthiness.
    * @param message    Message to display on error.
    */
  def assert(expression: js.Any): scala.Unit = js.native
  def assert(expression: js.Any, message: java.lang.String): scala.Unit = js.native
  def should(): Should = js.native
  /**
    * Provides a way to extend the internals of Chai
    */
  def use(fn: js.Function2[/* chai */ js.Any, /* utils */ js.Any, scala.Unit]): ChaiStatic = js.native
}

