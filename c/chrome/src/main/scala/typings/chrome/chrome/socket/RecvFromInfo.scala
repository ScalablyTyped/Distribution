package typings.chrome.chrome.socket

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecvFromInfo extends js.Object {
  var address: String
  var data: ArrayBuffer
  var port: Double
  var resultCode: Double
}

object RecvFromInfo {
  @scala.inline
  def apply(address: String, data: ArrayBuffer, port: Double, resultCode: Double): RecvFromInfo = {
    val __obj = js.Dynamic.literal(address = address, data = data, port = port, resultCode = resultCode)
  
    __obj.asInstanceOf[RecvFromInfo]
  }
}

