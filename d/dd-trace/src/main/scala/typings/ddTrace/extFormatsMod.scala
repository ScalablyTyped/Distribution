package typings.ddTrace

import typings.ddTrace.ddTraceStrings.log
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extFormatsMod {
  
  @JSImport("dd-trace/ext/formats", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dd-trace/ext/formats", "BINARY")
  @js.native
  def BINARY: /* "binary" */ String = js.native
  inline def BINARY_=(x: /* "binary" */ String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BINARY")(x.asInstanceOf[js.Any])
  
  @JSImport("dd-trace/ext/formats", "HTTP_HEADERS")
  @js.native
  def HTTP_HEADERS: /* "http_headers" */ String = js.native
  inline def HTTP_HEADERS_=(x: /* "http_headers" */ String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTP_HEADERS")(x.asInstanceOf[js.Any])
  
  @JSImport("dd-trace/ext/formats", "LOG")
  @js.native
  def LOG: log = js.native
  inline def LOG_=(x: log): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOG")(x.asInstanceOf[js.Any])
  
  @JSImport("dd-trace/ext/formats", "TEXT_MAP")
  @js.native
  def TEXT_MAP: /* "text_map" */ String = js.native
  inline def TEXT_MAP_=(x: /* "text_map" */ String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_MAP")(x.asInstanceOf[js.Any])
}
