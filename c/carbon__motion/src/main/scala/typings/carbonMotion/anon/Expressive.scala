package typings.carbonMotion.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expressive extends js.Object {
  var expressive: String
  var productive: String
}

object Expressive {
  @scala.inline
  def apply(expressive: String, productive: String): Expressive = {
    val __obj = js.Dynamic.literal(expressive = expressive.asInstanceOf[js.Any], productive = productive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expressive]
  }
}

