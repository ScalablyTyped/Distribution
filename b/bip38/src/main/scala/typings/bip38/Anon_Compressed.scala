package typings.bip38

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Compressed extends js.Object {
  var compressed: Boolean
  var privateKey: Buffer
}

object Anon_Compressed {
  @scala.inline
  def apply(compressed: Boolean, privateKey: Buffer): Anon_Compressed = {
    val __obj = js.Dynamic.literal(compressed = compressed, privateKey = privateKey)
  
    __obj.asInstanceOf[Anon_Compressed]
  }
}

