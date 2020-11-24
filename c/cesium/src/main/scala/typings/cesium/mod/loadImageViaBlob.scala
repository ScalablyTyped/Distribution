package typings.cesium.mod

import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "loadImageViaBlob")
@js.native
object loadImageViaBlob extends js.Object {
  
  def apply(url: String): js.Promise[HTMLImageElement] = js.native
  def apply(url: js.Promise[String]): js.Promise[HTMLImageElement] = js.native
}
