package typings.balancedDashMatch.balancedDashMatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Output extends js.Object {
  /**
    * The match, a and b not included
    */
  var body: String
  /**
    * The index of the matching b
    */
  var end: Double
  /**
    * The postscript, a and b not included
    */
  var post: String
  /**
    * The preamble, a and b not included
    */
  var pre: String
  /**
    * The index of the first match of a
    */
  var start: Double
}

object Output {
  @scala.inline
  def apply(body: String, end: Double, post: String, pre: String, start: Double): Output = {
    val __obj = js.Dynamic.literal(body = body, end = end, post = post, pre = pre, start = start)
  
    __obj.asInstanceOf[Output]
  }
}

