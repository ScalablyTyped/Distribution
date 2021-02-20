package typings.ckeditorCkeditor5Utils.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ckeditor/ckeditor5-utils", "CKEditorError")
@js.native
class CKEditorError protected () extends Error {
  def this(message: String) = this()
  def this(message: String, data: js.Object) = this()
  
  var data: js.UndefOr[js.Object] = js.native
}
/* static members */
object CKEditorError {
  
  @JSImport("@ckeditor/ckeditor5-utils", "CKEditorError.isCKEditorError")
  @js.native
  def isCKEditorError(error: Error): Boolean = js.native
}
