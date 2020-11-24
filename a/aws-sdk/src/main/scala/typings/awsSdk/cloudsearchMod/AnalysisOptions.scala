package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalysisOptions extends js.Object {
  
  /**
    * The level of algorithmic stemming to perform: none, minimal, light, or full. The available levels vary depending on the language. For more information, see Language Specific Text Processing Settings in the Amazon CloudSearch Developer Guide 
    */
  var AlgorithmicStemming: js.UndefOr[typings.awsSdk.cloudsearchMod.AlgorithmicStemming] = js.native
  
  /**
    * A JSON array that contains a collection of terms, tokens, readings and part of speech for Japanese Tokenizaiton. The Japanese tokenization dictionary enables you to override the default tokenization for selected terms. This is only valid for Japanese language fields.
    */
  var JapaneseTokenizationDictionary: js.UndefOr[String] = js.native
  
  /**
    * A JSON object that contains a collection of string:value pairs that each map a term to its stem. For example, {"term1": "stem1", "term2": "stem2", "term3": "stem3"}. The stemming dictionary is applied in addition to any algorithmic stemming. This enables you to override the results of the algorithmic stemming to correct specific cases of overstemming or understemming. The maximum size of a stemming dictionary is 500 KB.
    */
  var StemmingDictionary: js.UndefOr[String] = js.native
  
  /**
    * A JSON array of terms to ignore during indexing and searching. For example, ["a", "an", "the", "of"]. The stopwords dictionary must explicitly list each word you want to ignore. Wildcards and regular expressions are not supported. 
    */
  var Stopwords: js.UndefOr[String] = js.native
  
  /**
    * A JSON object that defines synonym groups and aliases. A synonym group is an array of arrays, where each sub-array is a group of terms where each term in the group is considered a synonym of every other term in the group. The aliases value is an object that contains a collection of string:value pairs where the string specifies a term and the array of values specifies each of the aliases for that term. An alias is considered a synonym of the specified term, but the term is not considered a synonym of the alias. For more information about specifying synonyms, see Synonyms in the Amazon CloudSearch Developer Guide.
    */
  var Synonyms: js.UndefOr[String] = js.native
}
object AnalysisOptions {
  
  @scala.inline
  def apply(): AnalysisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisOptions]
  }
  
  @scala.inline
  implicit class AnalysisOptionsOps[Self <: AnalysisOptions] (val x: Self) extends AnyVal {
    
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
    def setAlgorithmicStemming(value: AlgorithmicStemming): Self = this.set("AlgorithmicStemming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithmicStemming: Self = this.set("AlgorithmicStemming", js.undefined)
    
    @scala.inline
    def setJapaneseTokenizationDictionary(value: String): Self = this.set("JapaneseTokenizationDictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJapaneseTokenizationDictionary: Self = this.set("JapaneseTokenizationDictionary", js.undefined)
    
    @scala.inline
    def setStemmingDictionary(value: String): Self = this.set("StemmingDictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStemmingDictionary: Self = this.set("StemmingDictionary", js.undefined)
    
    @scala.inline
    def setStopwords(value: String): Self = this.set("Stopwords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopwords: Self = this.set("Stopwords", js.undefined)
    
    @scala.inline
    def setSynonyms(value: String): Self = this.set("Synonyms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSynonyms: Self = this.set("Synonyms", js.undefined)
  }
}
