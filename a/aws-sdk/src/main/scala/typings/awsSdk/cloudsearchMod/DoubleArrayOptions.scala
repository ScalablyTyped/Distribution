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
  def apply(
    DefaultValue: js.UndefOr[Double] = js.undefined,
    FacetEnabled: js.UndefOr[Boolean] = js.undefined,
    ReturnEnabled: js.UndefOr[Boolean] = js.undefined,
    SearchEnabled: js.UndefOr[Boolean] = js.undefined,
    SourceFields: FieldNameCommaList = null
  ): DoubleArrayOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DefaultValue)) __obj.updateDynamic("DefaultValue")(DefaultValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(FacetEnabled)) __obj.updateDynamic("FacetEnabled")(FacetEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ReturnEnabled)) __obj.updateDynamic("ReturnEnabled")(ReturnEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SearchEnabled)) __obj.updateDynamic("SearchEnabled")(SearchEnabled.get.asInstanceOf[js.Any])
    if (SourceFields != null) __obj.updateDynamic("SourceFields")(SourceFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoubleArrayOptions]
  }
}

