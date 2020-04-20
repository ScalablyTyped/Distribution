package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DemodulationConfig extends js.Object {
  /**
    * Unvalidated JSON of a demodulation Config.
    */
  var unvalidatedJSON: JsonString = js.native
}

object DemodulationConfig {
  @scala.inline
  def apply(unvalidatedJSON: JsonString): DemodulationConfig = {
    val __obj = js.Dynamic.literal(unvalidatedJSON = unvalidatedJSON.asInstanceOf[js.Any])
    __obj.asInstanceOf[DemodulationConfig]
  }
}

