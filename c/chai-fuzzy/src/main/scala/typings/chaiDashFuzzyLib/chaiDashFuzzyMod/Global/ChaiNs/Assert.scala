package typings
package chaiDashFuzzyLib.chaiDashFuzzyMod.Global.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assert extends js.Object {
  /**
  			 * Check the first level of the container for a value like the one provided.
  			 */
  def containOneLike(actual: js.Any, expected: js.Any): scala.Unit = js.native
  /**
  			 * Check the first level of the container for a value like the one provided.
  			 */
  def containOneLike(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
  			 * Check that the given javascript object is like the JSON-ified expected
  			 * value. Useful for checking stringification and parsing of an object.
  			 */
  def jsonOf(actual: js.Any, expected: js.Any): scala.Unit = js.native
  /**
  			 * Check that the given javascript object is like the JSON-ified expected
  			 * value. Useful for checking stringification and parsing of an object.
  			 */
  def jsonOf(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
  			 * Compare object attributes and values rather than checking to see if
  			 * they're the same reference.
  			 */
  def like(actual: js.Any, expected: js.Any): scala.Unit = js.native
  /**
  			 * Compare object attributes and values rather than checking to see if
  			 * they're the same reference.
  			 */
  def like(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
  			 * Check the first level of the container for a value like the one provided.
  			 */
  def notContainOneLike(actual: js.Any, expected: js.Any): scala.Unit = js.native
  /**
  			 * Check the first level of the container for a value like the one provided.
  			 */
  def notContainOneLike(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
  			 * Check that the given javascript object is like the JSON-ified expected
  			 * value. Useful for checking stringification and parsing of an object.
  			 */
  def notJsonOf(actual: js.Any, expected: js.Any): scala.Unit = js.native
  /**
  			 * Check that the given javascript object is like the JSON-ified expected
  			 * value. Useful for checking stringification and parsing of an object.
  			 */
  def notJsonOf(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
  			 * Compare object attributes and values rather than checking to see if
  			 * they're the same reference.
  			 */
  def notLike(actual: js.Any, expected: js.Any): scala.Unit = js.native
  /**
  			 * Compare object attributes and values rather than checking to see if
  			 * they're the same reference.
  			 */
  def notLike(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
}

