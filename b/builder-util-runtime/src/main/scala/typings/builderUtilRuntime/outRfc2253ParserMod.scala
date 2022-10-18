package typings.builderUtilRuntime

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outRfc2253ParserMod {
  
  @JSImport("builder-util-runtime/out/rfc2253Parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseDn(seq: String): Map[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDn")(seq.asInstanceOf[js.Any]).asInstanceOf[Map[String, String]]
}
