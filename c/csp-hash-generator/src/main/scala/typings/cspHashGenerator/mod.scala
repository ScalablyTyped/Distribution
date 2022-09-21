package typings.cspHashGenerator

import typings.cspHashGenerator.anon.Algorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(inlineScriptOrStyle: String): String = ^.asInstanceOf[js.Dynamic].apply(inlineScriptOrStyle.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(inlineScriptOrStyle: String, options: Algorithm): String = (^.asInstanceOf[js.Dynamic].apply(inlineScriptOrStyle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("csp-hash-generator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
