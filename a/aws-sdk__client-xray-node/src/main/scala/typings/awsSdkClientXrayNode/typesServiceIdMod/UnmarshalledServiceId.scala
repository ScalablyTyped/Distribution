package typings.awsSdkClientXrayNode.typesServiceIdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledServiceId extends ServiceId {
  /**
    * <p/>
    */
  @JSName("Names")
  var Names_UnmarshalledServiceId: js.UndefOr[js.Array[String]] = js.undefined
}

object UnmarshalledServiceId {
  @scala.inline
  def apply(AccountId: String = null, Name: String = null, Names: js.Array[String] = null, Type: String = null): UnmarshalledServiceId = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Names != null) __obj.updateDynamic("Names")(Names.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledServiceId]
  }
}

