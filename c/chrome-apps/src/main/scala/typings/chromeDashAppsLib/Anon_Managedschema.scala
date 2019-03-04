package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Managedschema extends js.Object {
  /**
    * The storage.managed_schema property indicates a file within the app that contains the policy schema.
    * @see ManagedSchema for schema content typings
    * @see[Docs and Schema Format]{@link https://developer.chrome.com/apps/manifest/storage}
    */
  var managed_schema: java.lang.String
}

object Anon_Managedschema {
  @scala.inline
  def apply(managed_schema: java.lang.String): Anon_Managedschema = {
    val __obj = js.Dynamic.literal(managed_schema = managed_schema)
  
    __obj.asInstanceOf[Anon_Managedschema]
  }
}

