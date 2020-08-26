package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShuffleConfig extends js.Object {
  /**
    * Determines the shuffling order in ShuffleConfig value.
    */
  var Seed: typings.awsSdk.sagemakerMod.Seed = js.native
}

object ShuffleConfig {
  @scala.inline
  def apply(Seed: Seed): ShuffleConfig = {
    val __obj = js.Dynamic.literal(Seed = Seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShuffleConfig]
  }
  @scala.inline
  implicit class ShuffleConfigOps[Self <: ShuffleConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSeed(value: Seed): Self = this.set("Seed", value.asInstanceOf[js.Any])
  }
  
}

