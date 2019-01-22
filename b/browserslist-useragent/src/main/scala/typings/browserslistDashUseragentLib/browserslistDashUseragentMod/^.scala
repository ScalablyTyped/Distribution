package typings
package browserslistDashUseragentLib.browserslistDashUseragentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserslist-useragent", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def matchesUA(uaString: java.lang.String): scala.Boolean = js.native
  def matchesUA(
    uaString: java.lang.String,
    opts: browserslistDashUseragentLib.browserslistDashUseragentMod.BrowserslistUseragentOptions
  ): scala.Boolean = js.native
  def normalizeQuery(query: java.lang.String): java.lang.String = js.native
  def resolveUserAgent(uaString: java.lang.String): browserslistDashUseragentLib.browserslistDashUseragentMod.ResolvedUserAgent = js.native
}

