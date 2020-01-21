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
  def apply(
    NextToken: NextToken = null,
    TextTranslationJobPropertiesList: TextTranslationJobPropertiesList = null
  ): ListTextTranslationJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TextTranslationJobPropertiesList != null) __obj.updateDynamic("TextTranslationJobPropertiesList")(TextTranslationJobPropertiesList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTextTranslationJobsResponse]
  }
}

