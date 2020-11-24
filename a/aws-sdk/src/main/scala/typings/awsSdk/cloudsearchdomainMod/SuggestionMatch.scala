package typings.awsSdk.cloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuggestionMatch extends js.Object {
  
  /**
    * The document ID of the suggested document.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The relevance score of a suggested match.
    */
  var score: js.UndefOr[Long] = js.native
  
  /**
    * The string that matches the query string specified in the SuggestRequest. 
    */
  var suggestion: js.UndefOr[String] = js.native
}
object SuggestionMatch {
  
  @scala.inline
  def apply(): SuggestionMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestionMatch]
  }
  
  @scala.inline
  implicit class SuggestionMatchOps[Self <: SuggestionMatch] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setScore(value: Long): Self = this.set("score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
    
    @scala.inline
    def setSuggestion(value: String): Self = this.set("suggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestion: Self = this.set("suggestion", js.undefined)
  }
}
