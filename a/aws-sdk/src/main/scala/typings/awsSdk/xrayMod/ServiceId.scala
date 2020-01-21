package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceId extends js.Object {
  /**
    * 
    */
  var AccountId: js.UndefOr[String] = js.native
  /**
    * 
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * 
    */
  var Names: js.UndefOr[ServiceNames] = js.native
  /**
    * 
    */
  var Type: js.UndefOr[String] = js.native
}

object ServiceId {
  @scala.inline
  def apply(AccountId: String = null, Name: String = null, Names: ServiceNames = null, Type: String = null): ServiceId = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Names != null) __obj.updateDynamic("Names")(Names.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceId]
  }
}

