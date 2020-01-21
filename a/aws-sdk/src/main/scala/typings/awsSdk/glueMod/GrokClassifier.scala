package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrokClassifier extends js.Object {
  /**
    * An identifier of the data format that the classifier matches, such as Twitter, JSON, Omniture logs, and so on.
    */
  var Classification: typings.awsSdk.glueMod.Classification = js.native
  /**
    * The time that this classifier was registered.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    * Optional custom grok patterns defined by this classifier. For more information, see custom patterns in Writing Custom Classifiers.
    */
  var CustomPatterns: js.UndefOr[typings.awsSdk.glueMod.CustomPatterns] = js.native
  /**
    * The grok pattern applied to a data store by this classifier. For more information, see built-in patterns in Writing Custom Classifiers.
    */
  var GrokPattern: typings.awsSdk.glueMod.GrokPattern = js.native
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

object GrokClassifier {
  @scala.inline
  def apply(
    Classification: Classification,
    GrokPattern: GrokPattern,
    Name: NameString,
    CreationTime: Timestamp = null,
    CustomPatterns: CustomPatterns = null,
    LastUpdated: Timestamp = null,
    Version: Int | Double = null
  ): GrokClassifier = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], GrokPattern = GrokPattern.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (CustomPatterns != null) __obj.updateDynamic("CustomPatterns")(CustomPatterns.asInstanceOf[js.Any])
    if (LastUpdated != null) __obj.updateDynamic("LastUpdated")(LastUpdated.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrokClassifier]
  }
}

