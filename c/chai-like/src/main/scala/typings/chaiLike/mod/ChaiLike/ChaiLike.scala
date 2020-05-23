package typings.chaiLike.mod.ChaiLike

import typings.chai.Chai.ChaiPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChaiLike extends ChaiPlugin {
  def clearPlugins(): Unit = js.native
  def extend(plugin: Plugin): Unit = js.native
}

