package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaxDocuments extends js.Object {
  var IND: js.UndefOr[INDTaxDocuments] = js.native
}

object TaxDocuments {
  @scala.inline
  def apply(IND: INDTaxDocuments = null): TaxDocuments = {
    val __obj = js.Dynamic.literal()
    if (IND != null) __obj.updateDynamic("IND")(IND.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaxDocuments]
  }
}

