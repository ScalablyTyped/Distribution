package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INDTaxDocuments extends StObject {
  
  /**
    * The Goods and Services Tax (GST) documents required in AWS Regions in India.
    */
  var GSTIN: js.UndefOr[typings.awsSdk.snowballMod.GSTIN] = js.undefined
}
object INDTaxDocuments {
  
  inline def apply(): INDTaxDocuments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INDTaxDocuments]
  }
  
  extension [Self <: INDTaxDocuments](x: Self) {
    
    inline def setGSTIN(value: GSTIN): Self = StObject.set(x, "GSTIN", value.asInstanceOf[js.Any])
    
    inline def setGSTINUndefined: Self = StObject.set(x, "GSTIN", js.undefined)
  }
}
