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
  def apply(EntityRecognizerPropertiesList: EntityRecognizerPropertiesList = null, NextToken: String = null): ListEntityRecognizersResponse = {
    val __obj = js.Dynamic.literal()
    if (EntityRecognizerPropertiesList != null) __obj.updateDynamic("EntityRecognizerPropertiesList")(EntityRecognizerPropertiesList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEntityRecognizersResponse]
  }
}

