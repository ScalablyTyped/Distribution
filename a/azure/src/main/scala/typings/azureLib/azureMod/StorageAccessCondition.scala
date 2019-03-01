package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageAccessCondition extends js.Object {
  var `If-Match`: java.lang.String
  var `If-Modified-Since`: stdLib.Date
  var `If-None-Match`: java.lang.String
  var `If-Unmodified-Since`: stdLib.Date
}

object StorageAccessCondition {
  @scala.inline
  def apply(
    `If-Match`: java.lang.String,
    `If-Modified-Since`: stdLib.Date,
    `If-None-Match`: java.lang.String,
    `If-Unmodified-Since`: stdLib.Date
  ): StorageAccessCondition = {
    val __obj = js.Dynamic.literal(`If-Match` = `If-Match`, `If-Modified-Since` = `If-Modified-Since`, `If-None-Match` = `If-None-Match`, `If-Unmodified-Since` = `If-Unmodified-Since`)
  
    __obj.asInstanceOf[StorageAccessCondition]
  }
}

