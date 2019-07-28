package typings.bitcoinjsDashLib

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hash extends js.Object {
  var hash: Buffer
  var version: Double
}

object Anon_Hash {
  @scala.inline
  def apply(hash: Buffer, version: Double): Anon_Hash = {
    val __obj = js.Dynamic.literal(hash = hash, version = version)
  
    __obj.asInstanceOf[Anon_Hash]
  }
}

