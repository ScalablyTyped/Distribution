package typings.cborg

import typings.cborg.typesCborgMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTaglibMod {
  
  @JSImport("cborg/types/taglib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bigIntDecoder(bytes: js.typedarray.Uint8Array): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("bigIntDecoder")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  
  inline def bigIntEncoder(obj: js.BigInt): js.Array[Token] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("bigIntEncoder")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[Token] | Null]
  
  inline def bigNegIntDecoder(bytes: js.typedarray.Uint8Array): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("bigNegIntDecoder")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
}
