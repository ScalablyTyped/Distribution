package typings.chromeDashApps

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataUuid extends js.Object {
  var data: js.Array[integer]
  var uuid: String
}

object Anon_DataUuid {
  @scala.inline
  def apply(data: js.Array[integer], uuid: String): Anon_DataUuid = {
    val __obj = js.Dynamic.literal(data = data, uuid = uuid)
  
    __obj.asInstanceOf[Anon_DataUuid]
  }
}

