package typings.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CKEDITOR.event")
@js.native
class event ()
  extends typings.ckeditor.CKEDITOR.event
object event {
  
  @JSGlobal("CKEDITOR.event")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("CKEDITOR.event.implementOn")
  @js.native
  def implementOn(targetObject: StringDictionary[js.Any]): Unit = js.native
  
  /* static member */
  @JSGlobal("CKEDITOR.event.useCapture")
  @js.native
  def useCapture: Boolean = js.native
  @scala.inline
  def useCapture_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useCapture")(x.asInstanceOf[js.Any])
}
