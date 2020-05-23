package typings.bip38.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compressed extends js.Object {
  var compressed: Boolean
  var privateKey: Buffer
}

object Compressed {
  @scala.inline
  def apply(compressed: Boolean, privateKey: Buffer): Compressed = {
    val __obj = js.Dynamic.literal(compressed = compressed.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compressed]
  }
}

