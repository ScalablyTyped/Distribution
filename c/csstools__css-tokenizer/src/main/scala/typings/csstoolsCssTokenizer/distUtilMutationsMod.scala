package typings.csstoolsCssTokenizer

import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenIdent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilMutationsMod {
  
  @JSImport("@csstools/css-tokenizer/dist/util/mutations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mutateIdent(ident: TokenIdent, newValue: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mutateIdent")(ident.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
