package typings.bitcoreDashLib.bitcoreDashLibMod.Networks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Network extends js.Object {
  val alias: String
  val name: String
}

object Network {
  @scala.inline
  def apply(alias: String, name: String): Network = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Network]
  }
}

