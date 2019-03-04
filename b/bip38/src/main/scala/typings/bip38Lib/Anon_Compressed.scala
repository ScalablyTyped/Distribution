package typings
package bip38Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Compressed extends js.Object {
  var compressed: scala.Boolean
  var privateKey: nodeLib.Buffer
}

object Anon_Compressed {
  @scala.inline
  def apply(compressed: scala.Boolean, privateKey: nodeLib.Buffer): Anon_Compressed = {
    val __obj = js.Dynamic.literal(compressed = compressed, privateKey = privateKey)
  
    __obj.asInstanceOf[Anon_Compressed]
  }
}

