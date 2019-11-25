package typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreServiceIdMod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ServiceId extends js.Object {
  /**
    * <p/>
    */
  var AccountId: js.UndefOr[String] = js.undefined
  /**
    * <p/>
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * <p/>
    */
  var Names: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
  /**
    * <p/>
    */
  var Type: js.UndefOr[String] = js.undefined
}

object _ServiceId {
  @scala.inline
  def apply(
    AccountId: String = null,
    Name: String = null,
    Names: js.Array[String] | Iterable[String] = null,
    Type: String = null
  ): _ServiceId = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Names != null) __obj.updateDynamic("Names")(Names.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ServiceId]
  }
}

