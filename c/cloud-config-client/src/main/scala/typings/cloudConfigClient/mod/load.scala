package typings.cloudConfigClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cloud-config-client", "load")
@js.native
object load extends js.Object {
  
  def apply(options: Options): js.Promise[Config] = js.native
  def apply(options: Options, callback: LoadCallback): js.Promise[Config] = js.native
}
