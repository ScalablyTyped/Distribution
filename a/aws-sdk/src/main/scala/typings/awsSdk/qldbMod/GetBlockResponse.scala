package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBlockResponse extends js.Object {
  /**
    * The block data object in Amazon Ion format.
    */
  var Block: ValueHolder = js.native
  /**
    * The proof object in Amazon Ion format returned by a GetBlock request. A proof contains the list of hash values required to recalculate the specified digest using a Merkle tree, starting with the specified block.
    */
  var Proof: js.UndefOr[ValueHolder] = js.native
}

object GetBlockResponse {
  @scala.inline
  def apply(Block: ValueHolder, Proof: ValueHolder = null): GetBlockResponse = {
    val __obj = js.Dynamic.literal(Block = Block.asInstanceOf[js.Any])
    if (Proof != null) __obj.updateDynamic("Proof")(Proof.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBlockResponse]
  }
}

