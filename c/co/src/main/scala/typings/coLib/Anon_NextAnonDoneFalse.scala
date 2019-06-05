package typings
package coLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NextAnonDoneFalse extends js.Object {
  def next(): Anon_DoneFalse
}

object Anon_NextAnonDoneFalse {
  @scala.inline
  def apply(next: () => Anon_DoneFalse): Anon_NextAnonDoneFalse = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
  
    __obj.asInstanceOf[Anon_NextAnonDoneFalse]
  }
}

