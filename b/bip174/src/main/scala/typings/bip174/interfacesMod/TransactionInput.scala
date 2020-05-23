package typings.bip174.interfacesMod

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
  def apply(hash: String | Buffer, index: Double, sequence: js.UndefOr[Double] = js.undefined): TransactionInput = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    if (!js.isUndefined(sequence)) __obj.updateDynamic("sequence")(sequence.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionInput]
  }
}

