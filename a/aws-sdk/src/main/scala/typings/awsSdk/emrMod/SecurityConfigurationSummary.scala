package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityConfigurationSummary extends js.Object {
  /**
    * The date and time the security configuration was created.
    */
  var CreationDateTime: js.UndefOr[Date] = js.native
  /**
    * The name of the security configuration.
    */
  var Name: js.UndefOr[XmlString] = js.native
}

object SecurityConfigurationSummary {
  @scala.inline
  def apply(CreationDateTime: Date = null, Name: XmlString = null): SecurityConfigurationSummary = {
    val __obj = js.Dynamic.literal()
    if (CreationDateTime != null) __obj.updateDynamic("CreationDateTime")(CreationDateTime.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityConfigurationSummary]
  }
}

