package typings.csstoolsMediaQueryListParser

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilComponentValueIsMod {
  
  @JSImport("@csstools/media-query-list-parser/dist/util/component-value-is", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isDimension(componentValue: ComponentValue): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDimension")(componentValue.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEnvironmentVariable(componentValue: ComponentValue): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnvironmentVariable")(componentValue.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIdent(componentValue: ComponentValue): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdent")(componentValue.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNumber(componentValue: ComponentValue): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(componentValue.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
