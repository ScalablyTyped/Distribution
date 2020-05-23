package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextArrayOptions extends js.Object {
  /**
    * The name of an analysis scheme for a text-array field.
    */
  var AnalysisScheme: js.UndefOr[Word] = js.native
  /**
    * A value to use for the field if the field isn't specified for a document.
    */
  var DefaultValue: js.UndefOr[FieldValue] = js.native
  /**
    * Whether highlights can be returned for the field.
    */
  var HighlightEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the contents of the field can be returned in the search results.
    */
  var ReturnEnabled: js.UndefOr[Boolean] = js.native
  /**
    * A list of source fields to map to the field. 
    */
  var SourceFields: js.UndefOr[FieldNameCommaList] = js.native
}

object TextArrayOptions {
  @scala.inline
  def apply(
    AnalysisScheme: Word = null,
    DefaultValue: FieldValue = null,
    HighlightEnabled: js.UndefOr[Boolean] = js.undefined,
    ReturnEnabled: js.UndefOr[Boolean] = js.undefined,
    SourceFields: FieldNameCommaList = null
  ): TextArrayOptions = {
    val __obj = js.Dynamic.literal()
    if (AnalysisScheme != null) __obj.updateDynamic("AnalysisScheme")(AnalysisScheme.asInstanceOf[js.Any])
    if (DefaultValue != null) __obj.updateDynamic("DefaultValue")(DefaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(HighlightEnabled)) __obj.updateDynamic("HighlightEnabled")(HighlightEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ReturnEnabled)) __obj.updateDynamic("ReturnEnabled")(ReturnEnabled.get.asInstanceOf[js.Any])
    if (SourceFields != null) __obj.updateDynamic("SourceFields")(SourceFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextArrayOptions]
  }
}

