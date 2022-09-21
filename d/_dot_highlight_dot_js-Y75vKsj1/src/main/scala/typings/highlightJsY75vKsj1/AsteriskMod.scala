package typings.highlightJsY75vKsj1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AsteriskMod {
  
  @JSImport("highlight.js/lib/languages/*", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): LanguageDetail = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[LanguageDetail]
  inline def default(hljs: HLJSApi): LanguageDetail = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hljs.asInstanceOf[js.Any]).asInstanceOf[LanguageDetail]
}
