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
}

