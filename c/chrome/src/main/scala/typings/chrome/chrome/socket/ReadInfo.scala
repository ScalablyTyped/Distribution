package typings.chrome.chrome.socket

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadInfo extends js.Object {
  var data: ArrayBuffer
  var resultCode: Double
}

object ReadInfo {
  @scala.inline
  def apply(data: ArrayBuffer, resultCode: Double): ReadInfo = {
    val __obj = js.Dynamic.literal(data = data, resultCode = resultCode)
  
    __obj.asInstanceOf[ReadInfo]
  }
}

