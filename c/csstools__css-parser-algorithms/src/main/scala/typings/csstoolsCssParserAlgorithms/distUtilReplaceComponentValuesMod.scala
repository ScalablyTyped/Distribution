package typings.csstoolsCssParserAlgorithms

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilReplaceComponentValuesMod {
  
  @JSImport("@csstools/css-parser-algorithms/dist/util/replace-component-values", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def replaceComponentValues(
    componentValuesList: js.Array[js.Array[ComponentValue]],
    replaceWith: js.Function1[/* componentValue */ ComponentValue, ComponentValue | Unit]
  ): js.Array[js.Array[ComponentValue]] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceComponentValues")(componentValuesList.asInstanceOf[js.Any], replaceWith.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[ComponentValue]]]
}
