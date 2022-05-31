package typings.babylonjs.BABYLON

import typings.babylonjs.anon.FallbackUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDracoCompressionConfiguration extends StObject {
  
  /**
    * Configuration for the decoder.
    */
  var decoder: FallbackUrl
}
object IDracoCompressionConfiguration {
  
  inline def apply(decoder: FallbackUrl): IDracoCompressionConfiguration = {
    val __obj = js.Dynamic.literal(decoder = decoder.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDracoCompressionConfiguration]
  }
  
  extension [Self <: IDracoCompressionConfiguration](x: Self) {
    
    inline def setDecoder(value: FallbackUrl): Self = StObject.set(x, "decoder", value.asInstanceOf[js.Any])
  }
}
