package typings.cborg

import typings.cborg.tokenMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jumpMod {
  
  @JSImport("cborg/types/lib/jump", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cborg/types/lib/jump", "jump")
  @js.native
  val jump: js.Array[
    js.Function4[
      /* data */ js.typedarray.Uint8Array, 
      /* pos */ Double, 
      /* minor */ Double, 
      /* options */ js.UndefOr[DecodeOptions], 
      Any
    ]
  ] = js.native
  
  @JSImport("cborg/types/lib/jump", "quick")
  @js.native
  val quick: js.Array[Token] = js.native
  
  inline def quickEncodeToken(token: Token): js.UndefOr[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("quickEncodeToken")(token.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.typedarray.Uint8Array]]
  
  type DecodeOptions = typings.cborg.interfaceMod.DecodeOptions
}
