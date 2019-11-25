package typings.chromeDashApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Managedschema extends js.Object {
  /**
    * The storage.managed_schema property indicates a file within the app that contains the policy schema.
    * @see ManagedSchema for schema content typings
    * @see[Docs and Schema Format]{@link https://developer.chrome.com/apps/manifest/storage}
    */
  var managed_schema: String
}

object Anon_Managedschema {
  @scala.inline
  def apply(managed_schema: String): Anon_Managedschema = {
    val __obj = js.Dynamic.literal(managed_schema = managed_schema.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Managedschema]
  }
}

