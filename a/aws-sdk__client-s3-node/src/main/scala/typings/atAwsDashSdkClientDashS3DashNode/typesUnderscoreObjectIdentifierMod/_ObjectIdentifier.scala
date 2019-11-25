package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreObjectIdentifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ObjectIdentifier extends js.Object {
  /**
    * <p>Key name of the object to delete.</p>
    */
  var Key: String
  /**
    * <p>VersionId for the specific version of the object to delete.</p>
    */
  var VersionId: js.UndefOr[String] = js.undefined
}

object _ObjectIdentifier {
  @scala.inline
  def apply(Key: String, VersionId: String = null): _ObjectIdentifier = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ObjectIdentifier]
  }
}

