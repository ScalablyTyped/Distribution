package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntOptions extends js.Object {
  /**
    * A value to use for the field if the field isn't specified for a document. This can be important if you are using the field in an expression and that field is not present in every document.
    */
  var DefaultValue: js.UndefOr[Long] = js.native
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
  /**
    * The name of the source field to map to the field. 
    */
  var SourceField: js.UndefOr[FieldName] = js.native
}

object IntOptions {
  @scala.inline
  def apply(
    DefaultValue: js.UndefOr[Long] = js.undefined,
    FacetEnabled: js.UndefOr[Boolean] = js.undefined,
    ReturnEnabled: js.UndefOr[Boolean] = js.undefined,
    SearchEnabled: js.UndefOr[Boolean] = js.undefined,
    SortEnabled: js.UndefOr[Boolean] = js.undefined,
    SourceField: FieldName = null
  ): IntOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DefaultValue)) __obj.updateDynamic("DefaultValue")(DefaultValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(FacetEnabled)) __obj.updateDynamic("FacetEnabled")(FacetEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ReturnEnabled)) __obj.updateDynamic("ReturnEnabled")(ReturnEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SearchEnabled)) __obj.updateDynamic("SearchEnabled")(SearchEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SortEnabled)) __obj.updateDynamic("SortEnabled")(SortEnabled.get.asInstanceOf[js.Any])
    if (SourceField != null) __obj.updateDynamic("SourceField")(SourceField.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntOptions]
  }
}

