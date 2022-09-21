package typings.bero

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Bemmed = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Bemmed]
  inline def apply(block: String): String = ^.asInstanceOf[js.Dynamic].apply(block.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(block: String, element: String): Bemmed = (^.asInstanceOf[js.Dynamic].apply(block.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Bemmed]
  inline def apply(block: String, element: Element, modifier: Modifier): String = (^.asInstanceOf[js.Dynamic].apply(block.asInstanceOf[js.Any], element.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(block: String, element: Modifier): String = (^.asInstanceOf[js.Dynamic].apply(block.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(block: Unit, element: String): Bemmed = (^.asInstanceOf[js.Dynamic].apply(block.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Bemmed]
  
  @JSImport("bero", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def join(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param arguments because its type Joiner is not an array type */ arguments: Joiner
  ): Joined = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(arguments.asInstanceOf[js.Any]).asInstanceOf[Joined]
  
  type Bemmed = js.Function2[
    /* arg1 */ js.UndefOr[Element | Modifier], 
    /* arg2 */ js.UndefOr[Modifier], 
    js.UndefOr[String]
  ]
  
  type Block = String
  
  type Element = String | StringDictionary[Any] | (js.Array[js.UndefOr[String | Boolean]])
  
  type Joined = String
  
  type Joiner = js.Array[js.UndefOr[String | Boolean]]
  
  type Modifier = StringDictionary[Any] | (js.Array[js.UndefOr[String | Boolean]])
}
