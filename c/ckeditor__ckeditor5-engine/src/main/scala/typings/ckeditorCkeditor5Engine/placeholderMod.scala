package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.Element
import typings.ckeditorCkeditor5Engine.viewElementMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object placeholderMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/placeholder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def disablePlaceholder(
    view: /* Couldn't translate: 'key not found: IArray(TsIdentLibraryScoped(ckeditor,ckeditor5-engine), TsIdentModule(Some(ckeditor),List(ckeditor5-engine, src, view, view)))' */ Any,
    element: default
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("disablePlaceholder")(view.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def enablePlaceholder(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enablePlaceholder")().asInstanceOf[Unit]
  inline def enablePlaceholder(options: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enablePlaceholder")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def hidePlaceholder(
    writer: typings.ckeditorCkeditor5Engine.downcastwriterMod.default[typings.ckeditorCkeditor5Engine.viewDocumentMod.default],
    element: default
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hidePlaceholder")(writer.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def needsPlaceholder(element: default, keepOnFocus: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("needsPlaceholder")(element.asInstanceOf[js.Any], keepOnFocus.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def showPlaceholder(
    writer: typings.ckeditorCkeditor5Engine.downcastwriterMod.default[typings.ckeditorCkeditor5Engine.viewDocumentMod.default],
    element: default
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("showPlaceholder")(writer.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
