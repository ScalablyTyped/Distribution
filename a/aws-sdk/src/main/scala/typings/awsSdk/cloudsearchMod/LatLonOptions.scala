package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LatLonOptions extends js.Object {
  /**
    * A value to use for the field if the field isn't specified for a document.
    */
  var DefaultValue: js.UndefOr[FieldValue] = js.native
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
    * Whether the field can be used to sort the search results.
    */
  var SortEnabled: js.UndefOr[Boolean] = js.native
  var SourceField: js.UndefOr[FieldName] = js.native
}

object LatLonOptions {
  @scala.inline
  def apply(
    DefaultValue: FieldValue = null,
    FacetEnabled: js.UndefOr[Boolean] = js.undefined,
    ReturnEnabled: js.UndefOr[Boolean] = js.undefined,
    SearchEnabled: js.UndefOr[Boolean] = js.undefined,
    SortEnabled: js.UndefOr[Boolean] = js.undefined,
    SourceField: FieldName = null
  ): LatLonOptions = {
    val __obj = js.Dynamic.literal()
    if (DefaultValue != null) __obj.updateDynamic("DefaultValue")(DefaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(FacetEnabled)) __obj.updateDynamic("FacetEnabled")(FacetEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ReturnEnabled)) __obj.updateDynamic("ReturnEnabled")(ReturnEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SearchEnabled)) __obj.updateDynamic("SearchEnabled")(SearchEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SortEnabled)) __obj.updateDynamic("SortEnabled")(SortEnabled.get.asInstanceOf[js.Any])
    if (SourceField != null) __obj.updateDynamic("SourceField")(SourceField.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatLonOptions]
  }
}

