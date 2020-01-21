package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNumberOfDomainControllersRequest extends js.Object {
  /**
    * The number of domain controllers desired in the directory.
    */
  var DesiredNumber: DesiredNumberOfDomainControllers = js.native
  /**
    * Identifier of the directory to which the domain controllers will be added or removed.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
}

object UpdateNumberOfDomainControllersRequest {
  @scala.inline
  def apply(DesiredNumber: DesiredNumberOfDomainControllers, DirectoryId: DirectoryId): UpdateNumberOfDomainControllersRequest = {
    val __obj = js.Dynamic.literal(DesiredNumber = DesiredNumber.asInstanceOf[js.Any], DirectoryId = DirectoryId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateNumberOfDomainControllersRequest]
  }
}

