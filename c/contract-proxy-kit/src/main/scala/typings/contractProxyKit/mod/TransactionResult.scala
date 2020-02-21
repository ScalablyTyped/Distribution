package typings.contractProxyKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionResult extends js.Object {
  var hash: String
  var promiEvent: js.UndefOr[js.Object] = js.undefined
  var transactionResponse: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ethers.providers.TransactionResponse */ js.Any
  ] = js.undefined
}

object TransactionResult {
  @scala.inline
  def apply(
    hash: String,
    promiEvent: js.Object = null,
    transactionResponse: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ethers.providers.TransactionResponse */ js.Any = null
  ): TransactionResult = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
    if (promiEvent != null) __obj.updateDynamic("promiEvent")(promiEvent.asInstanceOf[js.Any])
    if (transactionResponse != null) __obj.updateDynamic("transactionResponse")(transactionResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionResult]
  }
}

