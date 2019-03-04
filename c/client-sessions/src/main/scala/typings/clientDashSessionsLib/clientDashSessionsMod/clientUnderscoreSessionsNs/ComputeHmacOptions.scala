package typings
package clientDashSessionsLib.clientDashSessionsMod.clientUnderscoreSessionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputeHmacOptions extends js.Object {
  var signatureAlgorithm: java.lang.String
  var signatureKey: nodeLib.Buffer
}

object ComputeHmacOptions {
  @scala.inline
  def apply(signatureAlgorithm: java.lang.String, signatureKey: nodeLib.Buffer): ComputeHmacOptions = {
    val __obj = js.Dynamic.literal(signatureAlgorithm = signatureAlgorithm, signatureKey = signatureKey)
  
    __obj.asInstanceOf[ComputeHmacOptions]
  }
}

