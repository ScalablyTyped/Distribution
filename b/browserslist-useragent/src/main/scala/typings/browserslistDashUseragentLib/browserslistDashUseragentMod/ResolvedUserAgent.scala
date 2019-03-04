package typings
package browserslistDashUseragentLib.browserslistDashUseragentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedUserAgent extends js.Object {
  var family: java.lang.String
  var version: java.lang.String
}

object ResolvedUserAgent {
  @scala.inline
  def apply(family: java.lang.String, version: java.lang.String): ResolvedUserAgent = {
    val __obj = js.Dynamic.literal(family = family, version = version)
  
    __obj.asInstanceOf[ResolvedUserAgent]
  }
}

