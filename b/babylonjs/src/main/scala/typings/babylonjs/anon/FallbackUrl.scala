package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FallbackUrl extends js.Object {
  
  /**
    * The url to the fallback JavaScript module.
    */
  var fallbackUrl: js.UndefOr[String] = js.native
  
  /**
    * The url to the WebAssembly binary.
    */
  var wasmBinaryUrl: js.UndefOr[String] = js.native
  
  /**
    * The url to the WebAssembly module.
    */
  var wasmUrl: js.UndefOr[String] = js.native
}
object FallbackUrl {
  
  @scala.inline
  def apply(): FallbackUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FallbackUrl]
  }
  
  @scala.inline
  implicit class FallbackUrlOps[Self <: FallbackUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFallbackUrl(value: String): Self = this.set("fallbackUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackUrl: Self = this.set("fallbackUrl", js.undefined)
    
    @scala.inline
    def setWasmBinaryUrl(value: String): Self = this.set("wasmBinaryUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWasmBinaryUrl: Self = this.set("wasmBinaryUrl", js.undefined)
    
    @scala.inline
    def setWasmUrl(value: String): Self = this.set("wasmUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWasmUrl: Self = this.set("wasmUrl", js.undefined)
  }
}
