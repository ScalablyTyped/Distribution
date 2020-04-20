package typings.chromeApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonManagedschema extends js.Object {
  /**
    * The storage.managed_schema property indicates a file within the app that contains the policy schema.
    * @see ManagedSchema for schema content typings
    * @see[Docs and Schema Format]{@link https://developer.chrome.com/apps/manifest/storage}
    */
  var managed_schema: String
}

object AnonManagedschema {
  @scala.inline
  def apply(managed_schema: String): AnonManagedschema = {
    val __obj = js.Dynamic.literal(managed_schema = managed_schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonManagedschema]
  }
}

