package typings.browserslistDashUseragent.browserslistDashUseragentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedUserAgent extends js.Object {
  var family: String
  var version: String
}

object ResolvedUserAgent {
  @scala.inline
  def apply(family: String, version: String): ResolvedUserAgent = {
    val __obj = js.Dynamic.literal(family = family, version = version)
  
    __obj.asInstanceOf[ResolvedUserAgent]
  }
}

