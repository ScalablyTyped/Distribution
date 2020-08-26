package typings.ddTrace.mod.plugins

import typings.ddTrace.mod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This plugin automatically instruments the
  * [net](https://nodejs.org/api/net.html) module.
  */
@js.native
trait net
  extends Integration
     with Analyzable

object net {
  @scala.inline
  def apply(): net = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[net]
  }
}

