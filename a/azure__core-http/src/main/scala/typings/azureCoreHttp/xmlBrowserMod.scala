package typings.azureCoreHttp

import typings.azureCoreHttp.serializerCommonMod.SerializerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlBrowserMod {
  
  @JSImport("@azure/core-http/types/latest/src/util/xml.browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseXML(str: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseXML")(str.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def parseXML(str: String, opts: SerializerOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseXML")(str.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def stringifyXML(content: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyXML")(content.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringifyXML(content: Any, opts: SerializerOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyXML")(content.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
}
