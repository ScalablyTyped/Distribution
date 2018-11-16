package typings
package cosmiconfigLib.cosmiconfigMod.cosmiconfigNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Explorer extends js.Object {
  def clearCaches(): scala.Unit = js.native
  def clearLoadCache(): scala.Unit = js.native
  def clearSearchCache(): scala.Unit = js.native
  def load(loadPath: java.lang.String): stdLib.Promise[CosmiconfigResult] = js.native
  def loadSync(loadPath: java.lang.String): CosmiconfigResult = js.native
  def search(): stdLib.Promise[scala.Null | CosmiconfigResult] = js.native
  def search(searchFrom: java.lang.String): stdLib.Promise[scala.Null | CosmiconfigResult] = js.native
  def searchSync(): scala.Null | CosmiconfigResult = js.native
  def searchSync(searchFrom: java.lang.String): scala.Null | CosmiconfigResult = js.native
}

