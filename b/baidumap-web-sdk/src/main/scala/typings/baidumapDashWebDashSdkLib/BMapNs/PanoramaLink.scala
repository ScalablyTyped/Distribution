package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanoramaLink extends js.Object {
  var description: java.lang.String
  var heading: java.lang.String
  var id: java.lang.String
}

object PanoramaLink {
  @scala.inline
  def apply(description: java.lang.String, heading: java.lang.String, id: java.lang.String): PanoramaLink = {
    val __obj = js.Dynamic.literal(description = description, heading = heading, id = id)
  
    __obj.asInstanceOf[PanoramaLink]
  }
}

