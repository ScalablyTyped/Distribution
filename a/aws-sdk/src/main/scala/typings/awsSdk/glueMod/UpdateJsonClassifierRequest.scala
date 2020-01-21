package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateJsonClassifierRequest extends js.Object {
  /**
    * A JsonPath string defining the JSON data for the classifier to classify. AWS Glue supports a subset of JsonPath, as described in Writing JsonPath Custom Classifiers.
    */
  var JsonPath: js.UndefOr[typings.awsSdk.glueMod.JsonPath] = js.native
  /**
    * The name of the classifier.
    */
  var Name: NameString = js.native
}

object UpdateJsonClassifierRequest {
  @scala.inline
  def apply(Name: NameString, JsonPath: JsonPath = null): UpdateJsonClassifierRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (JsonPath != null) __obj.updateDynamic("JsonPath")(JsonPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJsonClassifierRequest]
  }
}

