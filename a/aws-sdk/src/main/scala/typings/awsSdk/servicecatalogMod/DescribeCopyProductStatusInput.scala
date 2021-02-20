package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCopyProductStatusInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  
  /**
    * The token for the copy product operation. This token is returned by CopyProduct.
    */
  var CopyProductToken: Id = js.native
}
object DescribeCopyProductStatusInput {
  
  @scala.inline
  def apply(CopyProductToken: Id): DescribeCopyProductStatusInput = {
    val __obj = js.Dynamic.literal(CopyProductToken = CopyProductToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCopyProductStatusInput]
  }
  
  @scala.inline
  implicit class DescribeCopyProductStatusInputMutableBuilder[Self <: DescribeCopyProductStatusInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    @scala.inline
    def setCopyProductToken(value: Id): Self = StObject.set(x, "CopyProductToken", value.asInstanceOf[js.Any])
  }
}
