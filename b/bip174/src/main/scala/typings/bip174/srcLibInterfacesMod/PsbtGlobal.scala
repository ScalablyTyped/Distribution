package typings.bip174.srcLibInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PsbtGlobal extends PsbtGlobalUpdate {
  var unknownKeyVals: js.UndefOr[js.Array[KeyValue]] = js.undefined
  var unsignedTx: Transaction
}

object PsbtGlobal {
  @scala.inline
  def apply(
    unsignedTx: Transaction,
    globalXpub: js.Array[GlobalXpub] = null,
    unknownKeyVals: js.Array[KeyValue] = null
  ): PsbtGlobal = {
    val __obj = js.Dynamic.literal(unsignedTx = unsignedTx.asInstanceOf[js.Any])
    if (globalXpub != null) __obj.updateDynamic("globalXpub")(globalXpub.asInstanceOf[js.Any])
    if (unknownKeyVals != null) __obj.updateDynamic("unknownKeyVals")(unknownKeyVals.asInstanceOf[js.Any])
    __obj.asInstanceOf[PsbtGlobal]
  }
}

