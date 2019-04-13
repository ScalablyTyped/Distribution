package typings
package cqrsDashDomainLib.cqrsDashDomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregateVersion extends js.Object {
  var version: scala.Double
}

object AggregateVersion {
  @scala.inline
  def apply(version: scala.Double): AggregateVersion = {
    val __obj = js.Dynamic.literal(version = version)
  
    __obj.asInstanceOf[AggregateVersion]
  }
}

