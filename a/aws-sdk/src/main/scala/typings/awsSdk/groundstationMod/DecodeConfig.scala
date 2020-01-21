package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecodeConfig extends js.Object {
  /**
    * Unvalidated JSON of a decode Config.
    */
  var unvalidatedJSON: JsonString = js.native
}

object DecodeConfig {
  @scala.inline
  def apply(unvalidatedJSON: JsonString): DecodeConfig = {
    val __obj = js.Dynamic.literal(unvalidatedJSON = unvalidatedJSON.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DecodeConfig]
  }
}

