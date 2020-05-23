package typings.awsSdkClientS3Browser.typesDeleteMod

import typings.awsSdkClientS3Browser.typesObjectIdentifierMod.UnmarshalledObjectIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledDelete extends Delete {
  /**
    * _ObjectIdentifierList shape
    */
  @JSName("Objects")
  var Objects_UnmarshalledDelete: js.Array[UnmarshalledObjectIdentifier]
}

object UnmarshalledDelete {
  @scala.inline
  def apply(Objects: js.Array[UnmarshalledObjectIdentifier], Quiet: js.UndefOr[Boolean] = js.undefined): UnmarshalledDelete = {
    val __obj = js.Dynamic.literal(Objects = Objects.asInstanceOf[js.Any])
    if (!js.isUndefined(Quiet)) __obj.updateDynamic("Quiet")(Quiet.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledDelete]
  }
}

