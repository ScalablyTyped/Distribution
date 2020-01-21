package typings.clientSessions.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputeHmacOptions extends js.Object {
  var signatureAlgorithm: String
  var signatureKey: Buffer
}

object ComputeHmacOptions {
  @scala.inline
  def apply(signatureAlgorithm: String, signatureKey: Buffer): ComputeHmacOptions = {
    val __obj = js.Dynamic.literal(signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], signatureKey = signatureKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ComputeHmacOptions]
  }
}

