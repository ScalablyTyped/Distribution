package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTextTranslationJobsResponse extends js.Object {
  /**
    * The token to use to retreive the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.translateMod.NextToken] = js.native
  /**
    * A list containing the properties of each job that is returned.
    */
  var TextTranslationJobPropertiesList: js.UndefOr[typings.awsSdk.translateMod.TextTranslationJobPropertiesList] = js.native
}

object ListTextTranslationJobsResponse {
  @scala.inline
  def apply(): ListTextTranslationJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTextTranslationJobsResponse]
  }
  @scala.inline
  implicit class ListTextTranslationJobsResponseOps[Self <: ListTextTranslationJobsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setTextTranslationJobPropertiesListVarargs(value: TextTranslationJobProperties*): Self = this.set("TextTranslationJobPropertiesList", js.Array(value :_*))
    @scala.inline
    def setTextTranslationJobPropertiesList(value: TextTranslationJobPropertiesList): Self = this.set("TextTranslationJobPropertiesList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextTranslationJobPropertiesList: Self = this.set("TextTranslationJobPropertiesList", js.undefined)
  }
  
}

