package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonClassifier extends js.Object {
  /**
    * The time that this classifier was registered.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    * A JsonPath string defining the JSON data for the classifier to classify. AWS Glue supports a subset of JsonPath, as described in Writing JsonPath Custom Classifiers.
    */
  var JsonPath: typings.awsSdk.glueMod.JsonPath = js.native
  /**
    * The time that this classifier was last updated.
    */
  var LastUpdated: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the classifier.
    */
  var Name: NameString = js.native
  /**
    * The version of this classifier.
    */
  var Version: js.UndefOr[VersionId] = js.native
}

object JsonClassifier {
  @scala.inline
  def apply(
    JsonPath: JsonPath,
    Name: NameString,
    CreationTime: Timestamp = null,
    LastUpdated: Timestamp = null,
    Version: js.UndefOr[VersionId] = js.undefined
  ): JsonClassifier = {
    val __obj = js.Dynamic.literal(JsonPath = JsonPath.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (LastUpdated != null) __obj.updateDynamic("LastUpdated")(LastUpdated.asInstanceOf[js.Any])
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonClassifier]
  }
}

