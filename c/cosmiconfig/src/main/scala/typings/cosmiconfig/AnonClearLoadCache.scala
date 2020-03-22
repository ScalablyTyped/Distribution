package typings.cosmiconfig

import typings.cosmiconfig.typesMod.CosmiconfigResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClearLoadCache extends js.Object {
  def clearCaches(): Unit = js.native
  def clearLoadCache(): Unit = js.native
  def clearSearchCache(): Unit = js.native
  def load(filepath: String): CosmiconfigResult = js.native
  def search(): CosmiconfigResult = js.native
  def search(searchFrom: String): CosmiconfigResult = js.native
}

