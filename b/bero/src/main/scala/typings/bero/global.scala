package typings.bero

import typings.bero.mod.Bemmed
import typings.bero.mod.Element
import typings.bero.mod.Joined
import typings.bero.mod.Joiner
import typings.bero.mod.Modifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object bem {
    
    inline def apply(): Bemmed = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Bemmed]
    inline def apply(block: String): String = ^.asInstanceOf[js.Dynamic].apply(block.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(block: String, element: String): Bemmed = (^.asInstanceOf[js.Dynamic].apply(block.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Bemmed]
    inline def apply(block: String, element: Element, modifier: Modifier): String = (^.asInstanceOf[js.Dynamic].apply(block.asInstanceOf[js.Any], element.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(block: String, element: Modifier): String = (^.asInstanceOf[js.Dynamic].apply(block.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(block: Unit, element: String): Bemmed = (^.asInstanceOf[js.Dynamic].apply(block.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Bemmed]
    
    @JSGlobal("bem")
    @js.native
    val ^ : js.Any = js.native
    
    inline def join(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param arguments because its type Joiner is not an array type */ arguments: Joiner
    ): Joined = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(arguments.asInstanceOf[js.Any]).asInstanceOf[Joined]
  }
}
