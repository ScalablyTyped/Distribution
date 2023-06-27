package typings.codemirrorLangWast

import typings.codemirrorLanguage.mod.LRLanguage
import typings.codemirrorLanguage.mod.LanguageSupport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@codemirror/lang-wast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wast(): LanguageSupport = ^.asInstanceOf[js.Dynamic].applyDynamic("wast")().asInstanceOf[LanguageSupport]
  
  @JSImport("@codemirror/lang-wast", "wastLanguage")
  @js.native
  val wastLanguage: LRLanguage = js.native
}
