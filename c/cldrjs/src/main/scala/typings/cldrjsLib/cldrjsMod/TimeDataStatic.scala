package typings
package cldrjsLib.cldrjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeDataStatic extends js.Object {
  def allowed(): java.lang.String
  def preferred(): java.lang.String
}

object TimeDataStatic {
  @scala.inline
  def apply(allowed: () => java.lang.String, preferred: () => java.lang.String): TimeDataStatic = {
    val __obj = js.Dynamic.literal(allowed = js.Any.fromFunction0(allowed), preferred = js.Any.fromFunction0(preferred))
  
    __obj.asInstanceOf[TimeDataStatic]
  }
}

