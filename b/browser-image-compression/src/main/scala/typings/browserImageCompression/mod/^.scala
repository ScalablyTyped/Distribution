package typings.browserImageCompression.mod

import typings.std.Blob
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browser-image-compression", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(image: Blob, options: Options): js.Promise[File | Blob] = js.native
  def apply(image: File, options: Options): js.Promise[File | Blob] = js.native
}
