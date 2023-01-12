package typings.awsSdk.clientsTranslateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppliedTerminology extends StObject {
  
  /**
    * The name of the custom terminology applied to the input text by Amazon Translate for the translated text response.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The specific terms of the custom terminology applied to the input text by Amazon Translate for the translated text response. A maximum of 250 terms will be returned, and the specific terms applied will be the first 250 terms in the source text. 
    */
  var Terms: js.UndefOr[TermList] = js.undefined
}
object AppliedTerminology {
  
  inline def apply(): AppliedTerminology = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppliedTerminology]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppliedTerminology] (val x: Self) extends AnyVal {
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setTerms(value: TermList): Self = StObject.set(x, "Terms", value.asInstanceOf[js.Any])
    
    inline def setTermsUndefined: Self = StObject.set(x, "Terms", js.undefined)
    
    inline def setTermsVarargs(value: Term*): Self = StObject.set(x, "Terms", js.Array(value*))
  }
}
