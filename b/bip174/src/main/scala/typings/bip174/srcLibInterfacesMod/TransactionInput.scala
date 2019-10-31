package typings.bip174.srcLibInterfacesMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionInput extends js.Object {
  var hash: String | Buffer
  var index: Double
  var sequence: js.UndefOr[Double] = js.undefined
}

object TransactionInput {
  @scala.inline
  def apply(hash: String | Buffer, index: Double, sequence: Int | Double = null): TransactionInput = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], index = index)
    if (sequence != null) __obj.updateDynamic("sequence")(sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionInput]
  }
}

