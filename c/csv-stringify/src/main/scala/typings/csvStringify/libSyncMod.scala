package typings.csvStringify

import typings.csvStringify.mod.Input
import typings.csvStringify.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSyncMod {
  
  inline def apply(input: Input): String = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(input: Input, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("csv-stringify/lib/sync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
