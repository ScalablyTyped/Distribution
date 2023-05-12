package typings.csstoolsCssCalc

import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenDimension
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenNumber
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenPercentage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilKindOfNumberMod {
  
  @JSImport("@csstools/css-calc/dist/util/kind-of-number", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayOfSameNumeric[T /* <: TokenDimension | TokenPercentage | TokenNumber */](x: js.Array[CSSToken]): /* is std.Array<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayOfSameNumeric")(x.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<T> */ Boolean]
  
  inline def isDimensionOrNumber(x: CSSToken): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDimensionOrNumber")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNumeric(x: CSSToken): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def twoOfSameNumeric[T /* <: TokenDimension | TokenPercentage | TokenNumber */](x: T, y: CSSToken): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("twoOfSameNumeric")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
}
