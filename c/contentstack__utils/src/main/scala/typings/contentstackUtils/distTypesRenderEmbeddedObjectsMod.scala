package typings.contentstackUtils

import typings.contentstackUtils.anon.RenderOption
import typings.contentstackUtils.distTypesOptionsMod.Option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRenderEmbeddedObjectsMod {
  
  @JSImport("@contentstack/utils/dist/types/render-embedded-objects", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def render(option: RenderOption): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def renderContent(content: String, option: Option): String | js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderContent")(content.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[String]]
  inline def renderContent(content: js.Array[String], option: Option): String | js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderContent")(content.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[String]]
}
