package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProviderMetadata extends js.Object {
  var objectMetadata: js.Array[ObjectMetadata] = js.native
}

object ProviderMetadata {
  @scala.inline
  def apply(objectMetadata: js.Array[ObjectMetadata]): ProviderMetadata = {
    val __obj = js.Dynamic.literal(objectMetadata = objectMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderMetadata]
  }
  @scala.inline
  implicit class ProviderMetadataOps[Self <: ProviderMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setObjectMetadataVarargs(value: ObjectMetadata*): Self = this.set("objectMetadata", js.Array(value :_*))
    @scala.inline
    def setObjectMetadata(value: js.Array[ObjectMetadata]): Self = this.set("objectMetadata", value.asInstanceOf[js.Any])
  }
  
}

