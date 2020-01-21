package typings.azureArmResource.lockModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagementLockObject
  extends typings.msRestAzure.mod.BaseResource {
  /**
    * The resource ID of the lock.
    */
  val id: js.UndefOr[String] = js.native
  /**
    * The level of the lock. Possible values are: NotSpecified, CanNotDelete, ReadOnly. CanNotDelete
    * means authorized users are able to read and modify the resources, but not delete. ReadOnly
    * means authorized users can only read from a resource, but they can't modify or delete it.
    * Possible values include: 'NotSpecified', 'CanNotDelete', 'ReadOnly'
    */
  var level: String = js.native
  /**
    * The name of the lock.
    */
  val name: js.UndefOr[String] = js.native
  /**
    * Notes about the lock. Maximum of 512 characters.
    */
  var notes: js.UndefOr[String] = js.native
  /**
    * The owners of the lock.
    */
  var owners: js.UndefOr[js.Array[ManagementLockOwner]] = js.native
  /**
    * The resource type of the lock - Microsoft.Authorization/locks.
    */
  val `type`: js.UndefOr[String] = js.native
}

