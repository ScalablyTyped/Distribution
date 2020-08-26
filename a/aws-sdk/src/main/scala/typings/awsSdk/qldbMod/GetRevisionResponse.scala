package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRevisionResponse extends js.Object {
  /**
    * The proof object in Amazon Ion format returned by a GetRevision request. A proof contains the list of hash values that are required to recalculate the specified digest using a Merkle tree, starting with the specified document revision.
    */
  var Proof: js.UndefOr[ValueHolder] = js.native
  /**
    * The document revision data object in Amazon Ion format.
    */
  var Revision: ValueHolder = js.native
}

object GetRevisionResponse {
  @scala.inline
  def apply(Revision: ValueHolder): GetRevisionResponse = {
    val __obj = js.Dynamic.literal(Revision = Revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRevisionResponse]
  }
  @scala.inline
  implicit class GetRevisionResponseOps[Self <: GetRevisionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRevision(value: ValueHolder): Self = this.set("Revision", value.asInstanceOf[js.Any])
    @scala.inline
    def setProof(value: ValueHolder): Self = this.set("Proof", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProof: Self = this.set("Proof", js.undefined)
  }
  
}

