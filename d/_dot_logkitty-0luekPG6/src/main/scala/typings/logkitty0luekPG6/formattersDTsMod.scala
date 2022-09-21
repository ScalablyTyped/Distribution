package typings.logkitty0luekPG6

import typings.logkitty0luekPG6.errorsDTsMod.CodeError
import typings.logkitty0luekPG6.typesDTsMod.Entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formattersDTsMod {
  
  @JSImport(".logkitty-0luekPG6/build/formatters.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatEntry(entry: Entry): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatEntry")(entry.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatError(error: js.Error): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatError")(error.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatError(error: CodeError): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatError")(error.asInstanceOf[js.Any]).asInstanceOf[String]
}
