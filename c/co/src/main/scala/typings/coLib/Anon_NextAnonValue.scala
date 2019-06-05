package typings
package coLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NextAnonValue extends js.Object {
  def next(): Anon_Value
}

object Anon_NextAnonValue {
  @scala.inline
  def apply(next: () => Anon_Value): Anon_NextAnonValue = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
  
    __obj.asInstanceOf[Anon_NextAnonValue]
  }
}

