package typings.bizcharts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: Double | String
  var name: String
}

object Anon_Id {
  @scala.inline
  def apply(id: Double | String, name: String): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Id]
  }
}

