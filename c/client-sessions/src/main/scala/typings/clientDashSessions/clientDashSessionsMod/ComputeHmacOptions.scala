package typings.clientDashSessions.clientDashSessionsMod

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
    val __obj = js.Dynamic.literal(signatureAlgorithm = signatureAlgorithm, signatureKey = signatureKey)
  
    __obj.asInstanceOf[ComputeHmacOptions]
  }
}

