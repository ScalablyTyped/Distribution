package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectDominantLanguageResponse extends js.Object {
  
  /**
    * The languages that Amazon Comprehend detected in the input text. For each language, the response returns the RFC 5646 language code and the level of confidence that Amazon Comprehend has in the accuracy of its inference. For more information about RFC 5646, see Tags for Identifying Languages on the IETF Tools web site.
    */
  var Languages: js.UndefOr[ListOfDominantLanguages] = js.native
}
object DetectDominantLanguageResponse {
  
  @scala.inline
  def apply(): DetectDominantLanguageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectDominantLanguageResponse]
  }
  
  @scala.inline
  implicit class DetectDominantLanguageResponseOps[Self <: DetectDominantLanguageResponse] (val x: Self) extends AnyVal {
    
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
    def setLanguagesVarargs(value: DominantLanguage*): Self = this.set("Languages", js.Array(value :_*))
    
    @scala.inline
    def setLanguages(value: ListOfDominantLanguages): Self = this.set("Languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguages: Self = this.set("Languages", js.undefined)
  }
}
