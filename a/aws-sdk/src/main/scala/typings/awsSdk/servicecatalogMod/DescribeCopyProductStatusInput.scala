package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCopyProductStatusInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * The token for the copy product operation. This token is returned by CopyProduct.
    */
  var CopyProductToken: Id
}
object DescribeCopyProductStatusInput {
  
  inline def apply(CopyProductToken: Id): DescribeCopyProductStatusInput = {
    val __obj = js.Dynamic.literal(CopyProductToken = CopyProductToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCopyProductStatusInput]
  }
  
  extension [Self <: DescribeCopyProductStatusInput](x: Self) {
    
    inline def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    inline def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    inline def setCopyProductToken(value: Id): Self = StObject.set(x, "CopyProductToken", value.asInstanceOf[js.Any])
  }
}
