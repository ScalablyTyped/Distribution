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
  def apply(): CollectionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionConfiguration]
  }
  @scala.inline
  implicit class CollectionConfigurationOps[Self <: CollectionConfiguration] (val x: Self) extends AnyVal {
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
    def setCollectionName(value: CollectionName): Self = this.set("CollectionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollectionName: Self = this.set("CollectionName", js.undefined)
    @scala.inline
    def setCollectionParameters(value: CollectionParameters): Self = this.set("CollectionParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollectionParameters: Self = this.set("CollectionParameters", js.undefined)
  }
  
}

