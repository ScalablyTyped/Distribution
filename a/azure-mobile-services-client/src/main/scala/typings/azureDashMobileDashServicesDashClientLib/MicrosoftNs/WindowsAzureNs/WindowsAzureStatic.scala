package typings
package azureDashMobileDashServicesDashClientLib.MicrosoftNs.WindowsAzureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsAzureStatic extends js.Object {
  var MobileServiceClient: MobileServiceClient
}

object WindowsAzureStatic {
  @scala.inline
  def apply(MobileServiceClient: MobileServiceClient): WindowsAzureStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MobileServiceClient")(MobileServiceClient)
    __obj.asInstanceOf[WindowsAzureStatic]
  }
}

