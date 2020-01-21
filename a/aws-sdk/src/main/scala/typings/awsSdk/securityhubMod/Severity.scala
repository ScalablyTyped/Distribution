package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Severity extends js.Object {
  /**
    * The normalized severity of a finding.
    */
  var Normalized: Integer = js.native
  /**
    * The native severity as defined by the AWS service or integrated partner product that generated the finding.
    */
  var Product: js.UndefOr[Double] = js.native
}

object Severity {
  @scala.inline
  def apply(Normalized: Integer, Product: Int | scala.Double = null): Severity = {
    val __obj = js.Dynamic.literal(Normalized = Normalized.asInstanceOf[js.Any])
    if (Product != null) __obj.updateDynamic("Product")(Product.asInstanceOf[js.Any])
    __obj.asInstanceOf[Severity]
  }
}

