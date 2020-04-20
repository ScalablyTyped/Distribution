package typings.clearbladejsNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  var URI: String
  var URIPrefix: String
  var callTimeout: Double
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def execute(name: String, params: js.Object, callback: CbCallback): Unit
}

object Code {
  @scala.inline
  def apply(
    URI: String,
    URIPrefix: String,
    callTimeout: Double,
    execute: (String, js.Object, CbCallback) => Unit,
    systemKey: String,
    systemSecret: String,
    user: APIUser
  ): Code = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], URIPrefix = URIPrefix.asInstanceOf[js.Any], callTimeout = callTimeout.asInstanceOf[js.Any], execute = js.Any.fromFunction3(execute), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
}

