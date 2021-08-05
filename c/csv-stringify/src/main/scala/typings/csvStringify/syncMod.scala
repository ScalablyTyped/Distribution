package typings.csvStringify

import typings.csvStringify.es5Mod.Input
import typings.csvStringify.es5Mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syncMod {
  
  inline def apply(input: Input): String = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(input: Input, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("csv-stringify/lib/es5/sync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
