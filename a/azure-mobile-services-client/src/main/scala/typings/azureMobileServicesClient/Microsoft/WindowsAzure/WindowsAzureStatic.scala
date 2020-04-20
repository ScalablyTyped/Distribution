package typings.azureMobileServicesClient.Microsoft.WindowsAzure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsAzureStatic extends js.Object {
  var MobileServiceClient: typings.azureMobileServicesClient.Microsoft.WindowsAzure.MobileServiceClient
}

object WindowsAzureStatic {
  @scala.inline
  def apply(MobileServiceClient: MobileServiceClient): WindowsAzureStatic = {
    val __obj = js.Dynamic.literal(MobileServiceClient = MobileServiceClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsAzureStatic]
  }
}

