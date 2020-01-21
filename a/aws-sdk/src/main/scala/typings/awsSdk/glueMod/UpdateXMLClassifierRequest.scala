package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateXMLClassifierRequest extends js.Object {
  /**
    * An identifier of the data format that the classifier matches.
    */
  var Classification: js.UndefOr[typings.awsSdk.glueMod.Classification] = js.native
  /**
    * The name of the classifier.
    */
  var Name: NameString = js.native
  /**
    * The XML tag designating the element that contains each record in an XML document being parsed. This cannot identify a self-closing element (closed by /&gt;). An empty row element that contains only attributes can be parsed as long as it ends with a closing tag (for example, &lt;row item_a="A" item_b="B"&gt;&lt;/row&gt; is okay, but &lt;row item_a="A" item_b="B" /&gt; is not).
    */
  var RowTag: js.UndefOr[typings.awsSdk.glueMod.RowTag] = js.native
}

object UpdateXMLClassifierRequest {
  @scala.inline
  def apply(Name: NameString, Classification: Classification = null, RowTag: RowTag = null): UpdateXMLClassifierRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (Classification != null) __obj.updateDynamic("Classification")(Classification.asInstanceOf[js.Any])
    if (RowTag != null) __obj.updateDynamic("RowTag")(RowTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateXMLClassifierRequest]
  }
}

