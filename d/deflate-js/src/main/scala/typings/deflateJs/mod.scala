package typings.deflateJs

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("deflate-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def deflate(data: Uint8Array): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  @scala.inline
  def deflate(data: Uint8Array, compression: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any], compression.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  
  @scala.inline
  def inflate(data: Uint8Array): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(data.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
}
