package typings
package cldrjsLib.cldrjsMod.selfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeDataStatic extends js.Object {
  def allowed(): java.lang.String
  def preferred(): java.lang.String
}

object TimeDataStatic {
  @scala.inline
  def apply(allowed: js.Function0[java.lang.String], preferred: js.Function0[java.lang.String]): TimeDataStatic = {
    val __obj = js.Dynamic.literal(allowed = allowed, preferred = preferred)
  
    __obj.asInstanceOf[TimeDataStatic]
  }
}

