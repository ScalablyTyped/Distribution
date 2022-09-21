package typings.deflateJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("deflate-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deflate(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def deflate(data: js.typedarray.Uint8Array, compression: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any], compression.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def inflate(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
}
