package typings.bip38

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompressed extends js.Object {
  var compressed: Boolean
  var privateKey: Buffer
}

object AnonCompressed {
  @scala.inline
  def apply(compressed: Boolean, privateKey: Buffer): AnonCompressed = {
    val __obj = js.Dynamic.literal(compressed = compressed.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompressed]
  }
}

