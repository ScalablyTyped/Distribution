package typings.codemirrorLangJava

import typings.codemirrorLanguage.mod.LRLanguage
import typings.codemirrorLanguage.mod.LanguageSupport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@codemirror/lang-java", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  A language provider based on the [Lezer Java
  parser](https://github.com/lezer-parser/java), extended with
  highlighting and indentation information.
  */
  @JSImport("@codemirror/lang-java", "javaLanguage")
  @js.native
  val javaLanguage: LRLanguage = js.native
  
  /**
  Java language support.
  */
  inline def java_(): LanguageSupport = ^.asInstanceOf[js.Dynamic].applyDynamic("java")().asInstanceOf[LanguageSupport]
}
