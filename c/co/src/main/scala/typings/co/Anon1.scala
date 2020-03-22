package typings.co

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  def next(): Anon0
}

object Anon1 {
  @scala.inline
  def apply(next: () => Anon0): Anon1 = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
  
    __obj.asInstanceOf[Anon1]
  }
}

