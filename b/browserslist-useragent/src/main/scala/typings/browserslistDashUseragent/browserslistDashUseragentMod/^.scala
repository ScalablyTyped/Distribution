package typings.browserslistDashUseragent.browserslistDashUseragentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserslist-useragent", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def matchesUA(uaString: String): Boolean = js.native
  def matchesUA(uaString: String, opts: BrowserslistUseragentOptions): Boolean = js.native
  def normalizeQuery(query: String): String = js.native
  def resolveUserAgent(uaString: String): ResolvedUserAgent = js.native
}

