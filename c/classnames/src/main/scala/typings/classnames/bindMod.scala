package typings.classnames

import typings.classnames.mod.ArgumentArray
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindMod {
  
  inline def apply(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ArgumentArray is not an array type */ args: ArgumentArray
  ): String = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("classnames/bind", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Binding = Record[String, String]
}
