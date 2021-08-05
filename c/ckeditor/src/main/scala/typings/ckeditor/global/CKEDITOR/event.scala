package typings.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CKEDITOR.event")
@js.native
class event ()
  extends StObject
     with typings.ckeditor.CKEDITOR.event
object event {
  
  @JSGlobal("CKEDITOR.event")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def implementOn(targetObject: StringDictionary[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("implementOn")(targetObject.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  @JSGlobal("CKEDITOR.event.useCapture")
  @js.native
  def useCapture: Boolean = js.native
  inline def useCapture_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useCapture")(x.asInstanceOf[js.Any])
}
