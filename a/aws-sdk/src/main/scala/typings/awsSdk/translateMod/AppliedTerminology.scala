package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppliedTerminology extends StObject {
  
  /**
    * The name of the custom terminology applied to the input text by Amazon Translate for the translated text response.
    */
  var Name: js.UndefOr[ResourceName] = js.native
  
  /**
    * The specific terms of the custom terminology applied to the input text by Amazon Translate for the translated text response. A maximum of 250 terms will be returned, and the specific terms applied will be the first 250 terms in the source text. 
    */
  var Terms: js.UndefOr[TermList] = js.native
}
object AppliedTerminology {
  
  @scala.inline
  def apply(): AppliedTerminology = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppliedTerminology]
  }
  
  @scala.inline
  implicit class AppliedTerminologyMutableBuilder[Self <: AppliedTerminology] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setTerms(value: TermList): Self = StObject.set(x, "Terms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermsUndefined: Self = StObject.set(x, "Terms", js.undefined)
    
    @scala.inline
    def setTermsVarargs(value: Term*): Self = StObject.set(x, "Terms", js.Array(value :_*))
  }
}
