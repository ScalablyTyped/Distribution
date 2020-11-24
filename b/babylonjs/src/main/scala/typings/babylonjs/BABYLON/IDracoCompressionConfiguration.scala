package typings.babylonjs.BABYLON

import typings.babylonjs.anon.FallbackUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDracoCompressionConfiguration extends js.Object {
  
  /**
    * Configuration for the decoder.
    */
  var decoder: FallbackUrl = js.native
}
object IDracoCompressionConfiguration {
  
  @scala.inline
  def apply(decoder: FallbackUrl): IDracoCompressionConfiguration = {
    val __obj = js.Dynamic.literal(decoder = decoder.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDracoCompressionConfiguration]
  }
  
  @scala.inline
  implicit class IDracoCompressionConfigurationOps[Self <: IDracoCompressionConfiguration] (val x: Self) extends AnyVal {
    
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
    def setDecoder(value: FallbackUrl): Self = this.set("decoder", value.asInstanceOf[js.Any])
  }
}
