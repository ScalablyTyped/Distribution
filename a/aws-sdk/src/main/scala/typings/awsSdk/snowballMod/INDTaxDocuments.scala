package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INDTaxDocuments extends js.Object {
  
  /**
    * The Goods and Services Tax (GST) documents required in AWS Regions in India.
    */
  var GSTIN: js.UndefOr[typings.awsSdk.snowballMod.GSTIN] = js.native
}
object INDTaxDocuments {
  
  @scala.inline
  def apply(): INDTaxDocuments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INDTaxDocuments]
  }
  
  @scala.inline
  implicit class INDTaxDocumentsOps[Self <: INDTaxDocuments] (val x: Self) extends AnyVal {
    
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
    def setGSTIN(value: GSTIN): Self = this.set("GSTIN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGSTIN: Self = this.set("GSTIN", js.undefined)
  }
}
