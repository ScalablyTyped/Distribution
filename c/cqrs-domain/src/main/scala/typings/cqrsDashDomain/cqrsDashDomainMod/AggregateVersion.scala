package typings.cqrsDashDomain.cqrsDashDomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregateVersion extends js.Object {
  var version: Double
}

object AggregateVersion {
  @scala.inline
  def apply(version: Double): AggregateVersion = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AggregateVersion]
  }
}

