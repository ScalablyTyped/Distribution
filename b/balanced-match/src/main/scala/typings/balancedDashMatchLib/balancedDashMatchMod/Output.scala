package typings
package balancedDashMatchLib.balancedDashMatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Output extends js.Object {
  /**
    * The match, a and b not included
    */
  var body: java.lang.String
  /**
    * The index of the matching b
    */
  var end: scala.Double
  /**
    * The postscript, a and b not included
    */
  var post: java.lang.String
  /**
    * The preamble, a and b not included
    */
  var pre: java.lang.String
  /**
    * The index of the first match of a
    */
  var start: scala.Double
}

object Output {
  @scala.inline
  def apply(
    body: java.lang.String,
    end: scala.Double,
    post: java.lang.String,
    pre: java.lang.String,
    start: scala.Double
  ): Output = {
    val __obj = js.Dynamic.literal(body = body, end = end, post = post, pre = pre, start = start)
  
    __obj.asInstanceOf[Output]
  }
}

