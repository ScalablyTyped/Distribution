package typings
package bitcoinjsDashLibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Check extends js.Object {
  def check(script: nodeLib.Buffer): scala.Boolean
}

object Anon_Check {
  @scala.inline
  def apply(check: nodeLib.Buffer => scala.Boolean): Anon_Check = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction1(check))
  
    __obj.asInstanceOf[Anon_Check]
  }
}

