package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Severity extends js.Object {
  
  /**
    * The severity value of the finding. The allowed values are the following.    INFORMATIONAL - No issue was found.    LOW - The issue does not require action on its own.    MEDIUM - The issue must be addressed but not urgently.    HIGH - The issue must be addressed as a priority.    CRITICAL - The issue must be remediated immediately to avoid it escalating.   If you provide Normalized and do not provide Label, then Label is set automatically as follows.    0 - INFORMATIONAL    1–39 - LOW    40–69 - MEDIUM    70–89 - HIGH    90–100 - CRITICAL   
    */
  var Label: js.UndefOr[SeverityLabel] = js.native
  
  /**
    * Deprecated. The normalized severity of a finding. This attribute is being deprecated. Instead of providing Normalized, provide Label. If you provide Label and do not provide Normalized, then Normalized is set automatically as follows.    INFORMATIONAL - 0    LOW - 1    MEDIUM - 40    HIGH - 70    CRITICAL - 90  
    */
  var Normalized: js.UndefOr[Integer] = js.native
  
  /**
    * The native severity from the finding product that generated the finding.
    */
  var Original: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Deprecated. This attribute is being deprecated. Instead of providing Product, provide Original. The native severity as defined by the AWS service or integrated partner product that generated the finding.
    */
  var Product: js.UndefOr[Double] = js.native
}
object Severity {
  
  @scala.inline
  def apply(): Severity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Severity]
  }
  
  @scala.inline
  implicit class SeverityOps[Self <: Severity] (val x: Self) extends AnyVal {
    
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
    def setNormalized(value: Integer): Self = this.set("Normalized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalized: Self = this.set("Normalized", js.undefined)
    
    @scala.inline
    def setOriginal(value: NonEmptyString): Self = this.set("Original", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginal: Self = this.set("Original", js.undefined)
    
    @scala.inline
    def setProduct(value: Double): Self = this.set("Product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduct: Self = this.set("Product", js.undefined)
  }
}
