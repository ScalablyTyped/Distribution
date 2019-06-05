package typings
package coLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Next extends js.Object {
  def next(): Anon_Done
}

object Anon_Next {
  @scala.inline
  def apply(next: () => Anon_Done): Anon_Next = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
  
    __obj.asInstanceOf[Anon_Next]
  }
}

