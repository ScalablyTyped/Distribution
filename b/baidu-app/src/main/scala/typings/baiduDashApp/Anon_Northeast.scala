package typings.baiduDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Northeast extends js.Object {
  var northeast: Anon_LatitudeLongitude
  var southwest: Anon_LatitudeLongitude
}

object Anon_Northeast {
  @scala.inline
  def apply(northeast: Anon_LatitudeLongitude, southwest: Anon_LatitudeLongitude): Anon_Northeast = {
    val __obj = js.Dynamic.literal(northeast = northeast, southwest = southwest)
  
    __obj.asInstanceOf[Anon_Northeast]
  }
}

