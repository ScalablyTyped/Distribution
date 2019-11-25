package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataStoreOptions extends js.Object {
  var localQueryComparisonOptions: js.UndefOr[LocalQueryComparisonOptions] = js.undefined
  var namingConvention: js.UndefOr[NamingConvention] = js.undefined
}

object MetadataStoreOptions {
  @scala.inline
  def apply(
    localQueryComparisonOptions: LocalQueryComparisonOptions = null,
    namingConvention: NamingConvention = null
  ): MetadataStoreOptions = {
    val __obj = js.Dynamic.literal()
    if (localQueryComparisonOptions != null) __obj.updateDynamic("localQueryComparisonOptions")(localQueryComparisonOptions.asInstanceOf[js.Any])
    if (namingConvention != null) __obj.updateDynamic("namingConvention")(namingConvention.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataStoreOptions]
  }
}

