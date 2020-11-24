package typings.browserImageCompression.mod

import typings.std.Blob
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browser-image-compression", "getExifOrientation")
@js.native
object getExifOrientation extends js.Object {
  
  def apply(file: Blob): js.Promise[Double] = js.native
  def apply(file: File): js.Promise[Double] = js.native
}
