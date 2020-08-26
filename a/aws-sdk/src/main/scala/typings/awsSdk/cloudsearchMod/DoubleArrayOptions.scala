package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DoubleArrayOptions extends js.Object {
  /**
    * A value to use for the field if the field isn't specified for a document.
    */
  var DefaultValue: js.UndefOr[Double] = js.native
  /**
    * Whether facet information can be returned for the field.
    */
  var FacetEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the contents of the field can be returned in the search results.
    */
  var ReturnEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the contents of the field are searchable.
    */
  var SearchEnabled: js.UndefOr[Boolean] = js.native
  /**
    * A list of source fields to map to the field. 
    */
  var SourceFields: js.UndefOr[FieldNameCommaList] = js.native
}

object DoubleArrayOptions {
  @scala.inline
  def apply(): DoubleArrayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleArrayOptions]
  }
  @scala.inline
  implicit class DoubleArrayOptionsOps[Self <: DoubleArrayOptions] (val x: Self) extends AnyVal {
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
    def setDefaultValue(value: Double): Self = this.set("DefaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("DefaultValue", js.undefined)
    @scala.inline
    def setFacetEnabled(value: Boolean): Self = this.set("FacetEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFacetEnabled: Self = this.set("FacetEnabled", js.undefined)
    @scala.inline
    def setReturnEnabled(value: Boolean): Self = this.set("ReturnEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnEnabled: Self = this.set("ReturnEnabled", js.undefined)
    @scala.inline
    def setSearchEnabled(value: Boolean): Self = this.set("SearchEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchEnabled: Self = this.set("SearchEnabled", js.undefined)
    @scala.inline
    def setSourceFields(value: FieldNameCommaList): Self = this.set("SourceFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceFields: Self = this.set("SourceFields", js.undefined)
  }
  
}

