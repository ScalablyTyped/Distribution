package typings.coreDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegExpConstructor extends js.Object {
  def escape(str: java.lang.String): java.lang.String
}

object RegExpConstructor {
  @scala.inline
  def apply(escape: java.lang.String => java.lang.String): RegExpConstructor = {
    val __obj = js.Dynamic.literal(escape = js.Any.fromFunction1(escape))
  
    __obj.asInstanceOf[RegExpConstructor]
  }
}

