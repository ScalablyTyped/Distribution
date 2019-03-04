package typings
package chanceLib.ChanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Seeded extends js.Object {
  var seed: Seed
}

object Seeded {
  @scala.inline
  def apply(seed: Seed): Seeded = {
    val __obj = js.Dynamic.literal(seed = seed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Seeded]
  }
}

