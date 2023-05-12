package typings.csstoolsCssTokenizer

import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStringifyMod {
  
  @JSImport("@csstools/css-tokenizer/dist/stringify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringify(tokens: CSSToken*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(tokens.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
}
