package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Severity extends js.Object {
  /**
    * The severity value of the finding. The allowed values are the following.    INFORMATIONAL - No issue was found.    LOW - The issue does not require action on its own.    MEDIUM - The issue must be addressed but not urgently.    HIGH - The issue must be addressed as a priority.    CRITICAL - The issue must be remediated immediately to avoid it escalating.  
    */
  var Label: js.UndefOr[SeverityLabel] = js.native
  /**
    * Deprecated. This attribute is being deprecated. Instead of providing Normalized, provide Label. If you provide Normalized and do not provide Label, Label is set automatically as follows.    0 - INFORMATIONAL    1–39 - LOW    40–69 - MEDIUM    70–89 - HIGH    90–100 - CRITICAL   
    */
  var Normalized: js.UndefOr[Integer] = js.native
  /**
    * The native severity as defined by the AWS service or integrated partner product that generated the finding.
    */
  var Product: js.UndefOr[Double] = js.native
}

object Severity {
  @scala.inline
  def apply(
    Label: SeverityLabel = null,
    Normalized: Int | scala.Double = null,
    Product: Int | scala.Double = null
  ): Severity = {
    val __obj = js.Dynamic.literal()
    if (Label != null) __obj.updateDynamic("Label")(Label.asInstanceOf[js.Any])
    if (Normalized != null) __obj.updateDynamic("Normalized")(Normalized.asInstanceOf[js.Any])
    if (Product != null) __obj.updateDynamic("Product")(Product.asInstanceOf[js.Any])
    __obj.asInstanceOf[Severity]
  }
}

