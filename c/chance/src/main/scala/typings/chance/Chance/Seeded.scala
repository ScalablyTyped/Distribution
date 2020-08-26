package typings.chance.Chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Seeded extends js.Object {
  var seed: Seed = js.native
}

object Seeded {
  @scala.inline
  def apply(seed: Seed): Seeded = {
    val __obj = js.Dynamic.literal(seed = seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Seeded]
  }
  @scala.inline
  implicit class SeededOps[Self <: Seeded] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSeed(value: Seed): Self = this.set("seed", value.asInstanceOf[js.Any])
  }
  
}

