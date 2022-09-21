package typings.babelHelperValidatorIdentifier

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@babel/helper-validator-identifier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isIdentifierChar(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierChar")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIdentifierName(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierName")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIdentifierStart(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierStart")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isKeyword(word: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKeyword")(word.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isReservedWord(word: String, inModule: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReservedWord")(word.asInstanceOf[js.Any], inModule.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isStrictBindOnlyReservedWord(word: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStrictBindOnlyReservedWord")(word.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isStrictBindReservedWord(word: String, inModule: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStrictBindReservedWord")(word.asInstanceOf[js.Any], inModule.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isStrictReservedWord(word: String, inModule: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStrictReservedWord")(word.asInstanceOf[js.Any], inModule.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
