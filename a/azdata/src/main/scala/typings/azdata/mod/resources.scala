package typings.azdata.mod

import typings.vscode.mod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azdata", "resources")
@js.native
object resources extends js.Object {
  def registerResourceProvider(providerMetadata: ResourceProviderMetadata, provider: ResourceProvider): Disposable = js.native
}

