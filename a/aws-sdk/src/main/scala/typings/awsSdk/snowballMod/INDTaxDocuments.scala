package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INDTaxDocuments extends StObject {
  
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
  implicit class INDTaxDocumentsMutableBuilder[Self <: INDTaxDocuments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGSTIN(value: GSTIN): Self = StObject.set(x, "GSTIN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGSTINUndefined: Self = StObject.set(x, "GSTIN", js.undefined)
  }
}
