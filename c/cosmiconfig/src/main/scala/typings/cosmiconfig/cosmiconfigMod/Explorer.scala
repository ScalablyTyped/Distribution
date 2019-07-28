package typings.cosmiconfig.cosmiconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Explorer extends js.Object {
  def clearCaches(): Unit = js.native
  def clearLoadCache(): Unit = js.native
  def clearSearchCache(): Unit = js.native
  def load(loadPath: String): js.Promise[CosmiconfigResult] = js.native
  def loadSync(loadPath: String): CosmiconfigResult = js.native
  def search(): js.Promise[Null | CosmiconfigResult] = js.native
  def search(searchFrom: String): js.Promise[Null | CosmiconfigResult] = js.native
  def searchSync(): Null | CosmiconfigResult = js.native
  def searchSync(searchFrom: String): Null | CosmiconfigResult = js.native
}

