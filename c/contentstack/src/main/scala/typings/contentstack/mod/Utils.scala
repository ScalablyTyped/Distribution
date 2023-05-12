package typings.contentstack.mod

import typings.contentstack.anon.Paths
import typings.contentstackUtils.distTypesOptionsMod.Option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentstack", "Utils")
@js.native
open class Utils () extends StObject
/* static members */
object Utils {
  
  @JSImport("contentstack", "Utils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def jsonToHTML(option: Paths): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonToHTML")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def render(option: typings.contentstack.anon.Entry): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def renderContent(content: String, option: Option): String | js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderContent")(content.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[String]]
  inline def renderContent(content: js.Array[String], option: Option): String | js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderContent")(content.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[String]]
}
