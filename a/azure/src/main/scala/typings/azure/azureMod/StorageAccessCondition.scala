package typings.azure.azureMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageAccessCondition extends js.Object {
  var `If-Match`: String
  var `If-Modified-Since`: Date
  var `If-None-Match`: String
  var `If-Unmodified-Since`: Date
}

object StorageAccessCondition {
  @scala.inline
  def apply(
    `If-Match`: String,
    `If-Modified-Since`: Date,
    `If-None-Match`: String,
    `If-Unmodified-Since`: Date
  ): StorageAccessCondition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("If-Match")(`If-Match`)
    __obj.updateDynamic("If-Modified-Since")(`If-Modified-Since`)
    __obj.updateDynamic("If-None-Match")(`If-None-Match`)
    __obj.updateDynamic("If-Unmodified-Since")(`If-Unmodified-Since`)
    __obj.asInstanceOf[StorageAccessCondition]
  }
}

