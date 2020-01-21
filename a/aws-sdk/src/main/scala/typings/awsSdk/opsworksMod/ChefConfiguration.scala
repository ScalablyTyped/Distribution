package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChefConfiguration extends js.Object {
  /**
    * The Berkshelf version.
    */
  var BerkshelfVersion: js.UndefOr[String] = js.native
  /**
    * Whether to enable Berkshelf.
    */
  var ManageBerkshelf: js.UndefOr[Boolean] = js.native
}

object ChefConfiguration {
  @scala.inline
  def apply(BerkshelfVersion: String = null, ManageBerkshelf: js.UndefOr[scala.Boolean] = js.undefined): ChefConfiguration = {
    val __obj = js.Dynamic.literal()
    if (BerkshelfVersion != null) __obj.updateDynamic("BerkshelfVersion")(BerkshelfVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(ManageBerkshelf)) __obj.updateDynamic("ManageBerkshelf")(ManageBerkshelf.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChefConfiguration]
  }
}

