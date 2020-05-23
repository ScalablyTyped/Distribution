package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XMLClassifier extends js.Object {
  /**
    * An identifier of the data format that the classifier matches.
    */
  var Classification: typings.awsSdk.glueMod.Classification = js.native
  /**
    * The time that this classifier was registered.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The time that this classifier was last updated.
    */
  var LastUpdated: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the classifier.
    */
  var Name: NameString = js.native
  /**
    * The XML tag designating the element that contains each record in an XML document being parsed. This can't identify a self-closing element (closed by /&gt;). An empty row element that contains only attributes can be parsed as long as it ends with a closing tag (for example, &lt;row item_a="A" item_b="B"&gt;&lt;/row&gt; is okay, but &lt;row item_a="A" item_b="B" /&gt; is not).
    */
  var RowTag: js.UndefOr[typings.awsSdk.glueMod.RowTag] = js.native
  /**
    * The version of this classifier.
    */
  var Version: js.UndefOr[VersionId] = js.native
}

object XMLClassifier {
  @scala.inline
  def apply(
    Classification: Classification,
    Name: NameString,
    CreationTime: Timestamp = null,
    LastUpdated: Timestamp = null,
    RowTag: RowTag = null,
    Version: js.UndefOr[VersionId] = js.undefined
  ): XMLClassifier = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (LastUpdated != null) __obj.updateDynamic("LastUpdated")(LastUpdated.asInstanceOf[js.Any])
    if (RowTag != null) __obj.updateDynamic("RowTag")(RowTag.asInstanceOf[js.Any])
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLClassifier]
  }
}

