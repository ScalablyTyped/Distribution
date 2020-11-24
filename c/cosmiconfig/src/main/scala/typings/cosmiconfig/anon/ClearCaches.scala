package typings.cosmiconfig.anon

import typings.cosmiconfig.typesMod.CosmiconfigResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearCaches extends js.Object {
  
  def clearCaches(): Unit = js.native
  
  def clearLoadCache(): Unit = js.native
  
  def clearSearchCache(): Unit = js.native
  
  def load(filepath: String): js.Promise[CosmiconfigResult] = js.native
  
  def search(): js.Promise[CosmiconfigResult] = js.native
  def search(searchFrom: String): js.Promise[CosmiconfigResult] = js.native
}
