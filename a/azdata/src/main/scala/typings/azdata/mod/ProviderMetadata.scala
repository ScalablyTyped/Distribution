package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderMetadata extends js.Object {
  var objectMetadata: js.Array[ObjectMetadata]
}

object ProviderMetadata {
  @scala.inline
  def apply(objectMetadata: js.Array[ObjectMetadata]): ProviderMetadata = {
    val __obj = js.Dynamic.literal(objectMetadata = objectMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderMetadata]
  }
}

