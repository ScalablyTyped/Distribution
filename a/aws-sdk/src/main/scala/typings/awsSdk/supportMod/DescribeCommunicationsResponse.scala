package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCommunicationsResponse extends js.Object {
  /**
    * The communications for the case.
    */
  var communications: js.UndefOr[CommunicationList] = js.native
  /**
    * A resumption point for pagination.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeCommunicationsResponse {
  @scala.inline
  def apply(): DescribeCommunicationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCommunicationsResponse]
  }
  @scala.inline
  implicit class DescribeCommunicationsResponseOps[Self <: DescribeCommunicationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommunicationsVarargs(value: Communication*): Self = this.set("communications", js.Array(value :_*))
    @scala.inline
    def setCommunications(value: CommunicationList): Self = this.set("communications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommunications: Self = this.set("communications", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

