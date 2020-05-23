package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Renderer extends js.Object {
  var renderer: String
  var vendor: String
  var version: String
}

object Renderer {
  @scala.inline
  def apply(renderer: String, vendor: String, version: String): Renderer = {
    val __obj = js.Dynamic.literal(renderer = renderer.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Renderer]
  }
}

