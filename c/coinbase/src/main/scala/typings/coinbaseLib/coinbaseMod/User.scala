package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("coinbase", "User")
@js.native
class User () extends Resource {
  /**
       * User’s avatar url
       */
  var avatar_url: java.lang.String = js.native
  /**
       * (needs wallet:user:read permission)
       */
  var bitcoin_unit: js.UndefOr[java.lang.String] = js.native
  /**
       * (needs wallet:user:read permission)
       */
  var country: js.UndefOr[Country] = js.native
  /**
       * ISO timestamp (sometimes needs additional permissions)
       */
  var created_at: js.UndefOr[java.lang.String] = js.native
  /**
       * Email address (needs wallet:user:email permission)
       */
  var email: js.UndefOr[java.lang.String] = js.native
  /**
       * Resource ID
       */
  var id: java.lang.String = js.native
  /**
       * User’s name
       */
  var name: js.UndefOr[java.lang.String] = js.native
  /**
       * Native currency (needs wallet:user:read permission)
       */
  var native_currency: js.UndefOr[java.lang.String] = js.native
  /**
       * Bio for user’s profile
       */
  var profile_bio: js.UndefOr[java.lang.String] = js.native
  /**
       * Location for user’s profile
       */
  var profile_location: js.UndefOr[java.lang.String] = js.native
  /**
       * profile location if user has one
       */
  var profile_url: js.UndefOr[java.lang.String] = js.native
  /**
       * Resource type
       */
  /* CompleteClass */
  override var resource: ResourceType = js.native
  /**
       * Resource type, constant "user"
       */
  @JSName("resource")
  var resource_User: coinbaseLib.coinbaseLibStrings.user = js.native
  /**
       * REST endpoint
       */
  var resource_path: java.lang.String = js.native
  /**
       * Time zone (needs wallet:user:read permission)
       */
  var time_zone: js.UndefOr[java.lang.String] = js.native
  /**
       * ISO timestamp (sometimes needs additional permissions)
       */
  var updated_at: js.UndefOr[java.lang.String] = js.native
  /**
       * <undocumented>
       */
  var username: js.UndefOr[java.lang.String] = js.native
  /**
       * Get current user’s authorization information including granted scopes and send limits when using OAuth2 authentication
       * No permission required
       */
  def showAuth(cb: js.Function2[/* error */ stdLib.Error, /* result */ Auth, scala.Unit]): scala.Unit = js.native
  /**
       * Change user properties
       * Scope: wallet:user:update
       */
  def update(
    opts: UpdateUserOpts,
    cb: js.Function2[/* error */ stdLib.Error, /* result */ this.type, scala.Unit]
  ): scala.Unit = js.native
}

