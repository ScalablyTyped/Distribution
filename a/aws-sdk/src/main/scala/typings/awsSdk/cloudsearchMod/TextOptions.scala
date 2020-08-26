package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextOptions extends js.Object {
  /**
    * The name of an analysis scheme for a text field.
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
    * Whether the field can be used to sort the search results.
    */
  var SortEnabled: js.UndefOr[Boolean] = js.native
  var SourceField: js.UndefOr[FieldName] = js.native
}

object TextOptions {
  @scala.inline
  def apply(): TextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextOptions]
  }
  @scala.inline
  implicit class TextOptionsOps[Self <: TextOptions] (val x: Self) extends AnyVal {
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
    def setAnalysisScheme(value: Word): Self = this.set("AnalysisScheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnalysisScheme: Self = this.set("AnalysisScheme", js.undefined)
    @scala.inline
    def setDefaultValue(value: FieldValue): Self = this.set("DefaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("DefaultValue", js.undefined)
    @scala.inline
    def setHighlightEnabled(value: Boolean): Self = this.set("HighlightEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightEnabled: Self = this.set("HighlightEnabled", js.undefined)
    @scala.inline
    def setReturnEnabled(value: Boolean): Self = this.set("ReturnEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnEnabled: Self = this.set("ReturnEnabled", js.undefined)
    @scala.inline
    def setSortEnabled(value: Boolean): Self = this.set("SortEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortEnabled: Self = this.set("SortEnabled", js.undefined)
    @scala.inline
    def setSourceField(value: FieldName): Self = this.set("SourceField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceField: Self = this.set("SourceField", js.undefined)
  }
  
}

