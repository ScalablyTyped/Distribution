package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaxDocuments extends StObject {
  
  var IND: js.UndefOr[INDTaxDocuments] = js.native
}
object TaxDocuments {
  
  @scala.inline
  def apply(): TaxDocuments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaxDocuments]
  }
  
  @scala.inline
  implicit class TaxDocumentsMutableBuilder[Self <: TaxDocuments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIND(value: INDTaxDocuments): Self = StObject.set(x, "IND", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINDUndefined: Self = StObject.set(x, "IND", js.undefined)
  }
}
