package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INDTaxDocuments extends js.Object {
  /**
    * The Goods and Services Tax (GST) documents required in AWS Regions in India.
    */
  var GSTIN: js.UndefOr[typings.awsSdk.snowballMod.GSTIN] = js.native
}

object INDTaxDocuments {
  @scala.inline
  def apply(GSTIN: GSTIN = null): INDTaxDocuments = {
    val __obj = js.Dynamic.literal()
    if (GSTIN != null) __obj.updateDynamic("GSTIN")(GSTIN.asInstanceOf[js.Any])
    __obj.asInstanceOf[INDTaxDocuments]
  }
}

