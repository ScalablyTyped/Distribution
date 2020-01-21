package typings.coinbase.mod

import typings.coinbase.coinbaseStrings.user
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("coinbase", "User")
@js.native
class User () extends Resource {
  /**
    * User’s avatar url
    */
  var avatar_url: String = js.native
  /**
    * (needs wallet:user:read permission)
    */
  var bitcoin_unit: js.UndefOr[String] = js.native
  /**
    * (needs wallet:user:read permission)
    */
  var country: js.UndefOr[Country] = js.native
  /**
    * ISO timestamp (sometimes needs additional permissions)
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * Email address (needs wallet:user:email permission)
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Resource ID
    */
  var id: String = js.native
  /**
    * User’s name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Native currency (needs wallet:user:read permission)
    */
  var native_currency: js.UndefOr[String] = js.native
  /**
    * Bio for user’s profile
    */
  var profile_bio: js.UndefOr[String] = js.native
  /**
    * Location for user’s profile
    */
  var profile_location: js.UndefOr[String] = js.native
  /**
    * profile location if user has one
    */
  var profile_url: js.UndefOr[String] = js.native
  /**
    * Resource type
    */
  /* CompleteClass */
  override var resource: ResourceType = js.native
  /**
    * Resource type, constant "user"
    */
  @JSName("resource")
  var resource_User: user = js.native
  /**
    * REST endpoint
    */
  var resource_path: String = js.native
  /**
    * Time zone (needs wallet:user:read permission)
    */
  var time_zone: js.UndefOr[String] = js.native
  /**
    * ISO timestamp (sometimes needs additional permissions)
    */
  var updated_at: js.UndefOr[String] = js.native
  /**
    * <undocumented>
    */
  var username: js.UndefOr[String] = js.native
  /**
    * Get current user’s authorization information including granted scopes and send limits when using OAuth2 authentication
    * No permission required
    */
  def showAuth(cb: js.Function2[/* error */ Error | Null, /* result */ Auth, Unit]): Unit = js.native
  /**
    * Change user properties
    * Scope: wallet:user:update
    */
  def update(opts: UpdateUserOpts, cb: js.Function2[/* error */ Error | Null, /* result */ this.type, Unit]): Unit = js.native
}

