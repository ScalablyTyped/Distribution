package typings.csstoolsCssCalc

import typings.csstoolsCssCalc.distOptionsMod.conversionOptions
import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@csstools/css-calc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calc(css: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("calc")(css.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def calc(css: String, options: conversionOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calc")(css.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def calcFromComponentValues(componentValuesList: js.Array[js.Array[ComponentValue]]): js.Array[js.Array[ComponentValue]] = ^.asInstanceOf[js.Dynamic].applyDynamic("calcFromComponentValues")(componentValuesList.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[ComponentValue]]]
  inline def calcFromComponentValues(componentValuesList: js.Array[js.Array[ComponentValue]], options: conversionOptions): js.Array[js.Array[ComponentValue]] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcFromComponentValues")(componentValuesList.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[ComponentValue]]]
  
  @JSImport("@csstools/css-calc", "mathFunctionNames")
  @js.native
  val mathFunctionNames: Set[String] = js.native
}
