package typings.bitcoinjsDashLib

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HashType extends js.Object {
  var hashType: Double
  var signature: Buffer
}

object Anon_HashType {
  @scala.inline
  def apply(hashType: Double, signature: Buffer): Anon_HashType = {
    val __obj = js.Dynamic.literal(hashType = hashType, signature = signature)
  
    __obj.asInstanceOf[Anon_HashType]
  }
}

