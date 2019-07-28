package typings.chromeDashApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_3D extends js.Object {
  /**
    * The '3D' requirement denotes GPU hardware acceleration.
    *
    * The 'webgl' requirement refers to the WebGL API.
    * For more information on Chrome 3D graphics support,
    * see the help article on WebGL and 3D graphics.
    * You can list the 3D-related features your app requires,
    * as demonstrated in the following example:
    * @example
    * 'requirements': {
    *   '3D': {
    *     'features': ['webgl']
    *   }
    * }
    */
  var `3D`: js.UndefOr[Anon_Features] = js.undefined
  /**
    * The 'plugins' requirement indicates if an app requires NPAPI to run.
    *
    * This requirement is enabled by default when the manifest includes the 'plugins' field.
    * For apps that still work when plugins aren't available,
    * you can disable this requirement by setting NPAPI to false.
    * You can also enable this requirement manually,
    * by setting NPAPI to true as shown in this example:
    * @example
    * 'requirements': {
    *   'plugins': {
    *     'npapi': true
    *   }
    * }
    */
  var plugins: js.UndefOr[Anon_Npapi] = js.undefined
}

object Anon_3D {
  @scala.inline
  def apply(`3D`: Anon_Features = null, plugins: Anon_Npapi = null): Anon_3D = {
    val __obj = js.Dynamic.literal()
    if (`3D` != null) __obj.updateDynamic("3D")(`3D`)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    __obj.asInstanceOf[Anon_3D]
  }
}

