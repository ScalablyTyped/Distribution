package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeverityUpdate extends js.Object {
  
  /**
    * The severity value of the finding. The allowed values are the following.    INFORMATIONAL - No issue was found.    LOW - The issue does not require action on its own.    MEDIUM - The issue must be addressed but not urgently.    HIGH - The issue must be addressed as a priority.    CRITICAL - The issue must be remediated immediately to avoid it escalating.  
    */
  var Label: js.UndefOr[SeverityLabel] = js.native
  
  /**
    * The normalized severity for the finding. This attribute is to be deprecated in favor of Label. If you provide Normalized and do not provide Label, Label is set automatically as follows.   0 - INFORMATIONAL    1–39 - LOW    40–69 - MEDIUM    70–89 - HIGH    90–100 - CRITICAL   
    */
  var Normalized: js.UndefOr[RatioScale] = js.native
  
  /**
    * The native severity as defined by the AWS service or integrated partner product that generated the finding.
    */
  var Product: js.UndefOr[Double] = js.native
}
object SeverityUpdate {
  
  @scala.inline
  def apply(): SeverityUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeverityUpdate]
  }
  
  @scala.inline
  implicit class SeverityUpdateOps[Self <: SeverityUpdate] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: SeverityLabel): Self = this.set("Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("Label", js.undefined)
    
    @scala.inline
    def setNormalized(value: RatioScale): Self = this.set("Normalized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalized: Self = this.set("Normalized", js.undefined)
    
    @scala.inline
    def setProduct(value: Double): Self = this.set("Product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduct: Self = this.set("Product", js.undefined)
  }
}
