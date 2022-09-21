package typings.contentstackUtils

import typings.contentstackUtils.embeddedObjectMod.EntryEmbedable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findRenderContentMod {
  
  @JSImport("@contentstack/utils/dist/types/helper/find-render-content", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findRenderContent[Type](
    keyPaths: String,
    entry: EntryEmbedable,
    render: js.Function1[/* content */ Type, String | js.Array[String]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findRenderContent")(keyPaths.asInstanceOf[js.Any], entry.asInstanceOf[js.Any], render.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getContent[Type](
    keys: js.Array[String],
    `object`: Any,
    render: js.Function1[/* content */ Type, String | js.Array[String]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getContent")(keys.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], render.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
