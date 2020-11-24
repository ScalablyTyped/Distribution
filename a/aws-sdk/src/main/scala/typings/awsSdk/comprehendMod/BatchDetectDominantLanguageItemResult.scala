package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDetectDominantLanguageItemResult extends js.Object {
  
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
  implicit class BatchDetectDominantLanguageItemResultOps[Self <: BatchDetectDominantLanguageItemResult] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: Integer): Self = this.set("Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("Index", js.undefined)
    
    @scala.inline
    def setLanguagesVarargs(value: DominantLanguage*): Self = this.set("Languages", js.Array(value :_*))
    
    @scala.inline
    def setLanguages(value: ListOfDominantLanguages): Self = this.set("Languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguages: Self = this.set("Languages", js.undefined)
  }
}
