package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionConfiguration extends js.Object {
  /**
    * The name of the tensor collection. The name must be unique relative to other rule configuration names.
    */
  var CollectionName: js.UndefOr[typings.awsSdk.sagemakerMod.CollectionName] = js.native
  /**
    * Parameter values for the tensor collection. The allowed parameters are "name", "include_regex", "reduction_config", "save_config", "tensor_names", and "save_histogram".
    */
  var CollectionParameters: js.UndefOr[typings.awsSdk.sagemakerMod.CollectionParameters] = js.native
}

object CollectionConfiguration {
  @scala.inline
  def apply(CollectionName: CollectionName = null, CollectionParameters: CollectionParameters = null): CollectionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (CollectionName != null) __obj.updateDynamic("CollectionName")(CollectionName.asInstanceOf[js.Any])
    if (CollectionParameters != null) __obj.updateDynamic("CollectionParameters")(CollectionParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionConfiguration]
  }
}

