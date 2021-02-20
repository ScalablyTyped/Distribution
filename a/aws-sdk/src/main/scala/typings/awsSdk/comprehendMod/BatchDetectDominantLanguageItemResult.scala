package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDetectDominantLanguageItemResult extends StObject {
  
  /**
    * The zero-based index of the document in the input list.
    */
  var Index: js.UndefOr[Integer] = js.native
  
  /**
    * One or more DominantLanguage objects describing the dominant languages in the document.
    */
  var Languages: js.UndefOr[ListOfDominantLanguages] = js.native
}
object BatchDetectDominantLanguageItemResult {
  
  @scala.inline
  def apply(): BatchDetectDominantLanguageItemResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDetectDominantLanguageItemResult]
  }
  
  @scala.inline
  implicit class BatchDetectDominantLanguageItemResultMutableBuilder[Self <: BatchDetectDominantLanguageItemResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Integer): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "Index", js.undefined)
    
    @scala.inline
    def setLanguages(value: ListOfDominantLanguages): Self = StObject.set(x, "Languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguagesUndefined: Self = StObject.set(x, "Languages", js.undefined)
    
    @scala.inline
    def setLanguagesVarargs(value: DominantLanguage*): Self = StObject.set(x, "Languages", js.Array(value :_*))
  }
}
