package typings.bugsnagDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: String
  var url: String
  var version: String
}

object Anon_Name {
  @scala.inline
  def apply(name: String, url: String, version: String): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name, url = url, version = version)
  
    __obj.asInstanceOf[Anon_Name]
  }
}

