package typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreServiceIdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledServiceId extends _ServiceId {
  /**
    * <p/>
    */
  @JSName("Names")
  var Names__UnmarshalledServiceId: js.UndefOr[js.Array[String]] = js.undefined
}

object _UnmarshalledServiceId {
  @scala.inline
  def apply(AccountId: String = null, Name: String = null, Names: js.Array[String] = null, Type: String = null): _UnmarshalledServiceId = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Names != null) __obj.updateDynamic("Names")(Names.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledServiceId]
  }
}

