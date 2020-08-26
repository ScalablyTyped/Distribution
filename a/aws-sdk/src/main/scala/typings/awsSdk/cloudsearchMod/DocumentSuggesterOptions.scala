package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentSuggesterOptions extends js.Object {
  /**
    * The level of fuzziness allowed when suggesting matches for a string: none, low, or high. With none, the specified string is treated as an exact prefix. With low, suggestions must differ from the specified string by no more than one character. With high, suggestions can differ by up to two characters. The default is none. 
    */
  var FuzzyMatching: js.UndefOr[SuggesterFuzzyMatching] = js.native
  /**
    * An expression that computes a score for each suggestion to control how they are sorted. The scores are rounded to the nearest integer, with a floor of 0 and a ceiling of 2^31-1. A document's relevance score is not computed for suggestions, so sort expressions cannot reference the _score value. To sort suggestions using a numeric field or existing expression, simply specify the name of the field or expression. If no expression is configured for the suggester, the suggestions are sorted with the closest matches listed first.
    */
  var SortExpression: js.UndefOr[String] = js.native
  /**
    * The name of the index field you want to use for suggestions. 
    */
  var SourceField: FieldName = js.native
}

object DocumentSuggesterOptions {
  @scala.inline
  def apply(SourceField: FieldName): DocumentSuggesterOptions = {
    val __obj = js.Dynamic.literal(SourceField = SourceField.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSuggesterOptions]
  }
  @scala.inline
  implicit class DocumentSuggesterOptionsOps[Self <: DocumentSuggesterOptions] (val x: Self) extends AnyVal {
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
    def setSourceField(value: FieldName): Self = this.set("SourceField", value.asInstanceOf[js.Any])
    @scala.inline
    def setFuzzyMatching(value: SuggesterFuzzyMatching): Self = this.set("FuzzyMatching", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFuzzyMatching: Self = this.set("FuzzyMatching", js.undefined)
    @scala.inline
    def setSortExpression(value: String): Self = this.set("SortExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortExpression: Self = this.set("SortExpression", js.undefined)
  }
  
}

