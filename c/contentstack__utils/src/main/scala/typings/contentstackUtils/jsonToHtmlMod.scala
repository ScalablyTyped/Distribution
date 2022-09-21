package typings.contentstackUtils

import typings.contentstackUtils.anon.RenderOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonToHtmlMod {
  
  @JSImport("@contentstack/utils/dist/types/json-to-html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def jsonToHTML(option: RenderOption): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonToHTML")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.contentstackUtils.textNodeMod.default
    - typings.contentstackUtils.nodeMod.default
  */
  trait AnyNode extends StObject
}
