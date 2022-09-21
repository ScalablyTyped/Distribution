package typings.babylonjs.BABYLON

import typings.babylonjs.anon.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMeshoptCompressionConfiguration extends StObject {
  
  /**
    * Configuration for the decoder.
    */
  var decoder: Url
}
object IMeshoptCompressionConfiguration {
  
  inline def apply(decoder: Url): IMeshoptCompressionConfiguration = {
    val __obj = js.Dynamic.literal(decoder = decoder.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMeshoptCompressionConfiguration]
  }
  
  extension [Self <: IMeshoptCompressionConfiguration](x: Self) {
    
    inline def setDecoder(value: Url): Self = StObject.set(x, "decoder", value.asInstanceOf[js.Any])
  }
}
