package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEntityRecognizersResponse extends js.Object {
  /**
    * The list of properties of an entity recognizer.
    */
  var EntityRecognizerPropertiesList: js.UndefOr[typings.awsSdk.comprehendMod.EntityRecognizerPropertiesList] = js.native
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListEntityRecognizersResponse {
  @scala.inline
  def apply(): ListEntityRecognizersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEntityRecognizersResponse]
  }
  @scala.inline
  implicit class ListEntityRecognizersResponseOps[Self <: ListEntityRecognizersResponse] (val x: Self) extends AnyVal {
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
    def setEntityRecognizerPropertiesListVarargs(value: EntityRecognizerProperties*): Self = this.set("EntityRecognizerPropertiesList", js.Array(value :_*))
    @scala.inline
    def setEntityRecognizerPropertiesList(value: EntityRecognizerPropertiesList): Self = this.set("EntityRecognizerPropertiesList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityRecognizerPropertiesList: Self = this.set("EntityRecognizerPropertiesList", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

