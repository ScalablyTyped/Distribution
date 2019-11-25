package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreDeleteMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreObjectIdentifierMod._UnmarshalledObjectIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledDelete extends _Delete {
  /**
    * _ObjectIdentifierList shape
    */
  @JSName("Objects")
  var Objects__UnmarshalledDelete: js.Array[_UnmarshalledObjectIdentifier]
}

object _UnmarshalledDelete {
  @scala.inline
  def apply(Objects: js.Array[_UnmarshalledObjectIdentifier], Quiet: js.UndefOr[Boolean] = js.undefined): _UnmarshalledDelete = {
    val __obj = js.Dynamic.literal(Objects = Objects.asInstanceOf[js.Any])
    if (!js.isUndefined(Quiet)) __obj.updateDynamic("Quiet")(Quiet.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledDelete]
  }
}

