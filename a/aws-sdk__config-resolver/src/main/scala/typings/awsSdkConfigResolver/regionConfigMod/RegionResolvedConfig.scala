package typings.awsSdkConfigResolver.regionConfigMod

import typings.awsSdkTypes.utilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionResolvedConfig extends js.Object {
  
  def region(): js.Promise[String] = js.native
  @JSName("region")
  var region_Original: Provider[String] = js.native
}
