package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelatedFinding extends js.Object {
  /**
    * The product-generated identifier for a related finding.
    */
  var Id: NonEmptyString = js.native
  /**
    * The ARN of the product that generated a related finding.
    */
  var ProductArn: NonEmptyString = js.native
}

object RelatedFinding {
  @scala.inline
  def apply(Id: NonEmptyString, ProductArn: NonEmptyString): RelatedFinding = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], ProductArn = ProductArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelatedFinding]
  }
  @scala.inline
  implicit class RelatedFindingOps[Self <: RelatedFinding] (val x: Self) extends AnyVal {
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
    def setId(value: NonEmptyString): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductArn(value: NonEmptyString): Self = this.set("ProductArn", value.asInstanceOf[js.Any])
  }
  
}

