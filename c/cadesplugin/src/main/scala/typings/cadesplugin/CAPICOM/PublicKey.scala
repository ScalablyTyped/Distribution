package typings.cadesplugin.CAPICOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKey extends StObject {
  
  val Algorithm: OID
  
  val EncodedKey: EncodedData
  
  val EncodedParameters: EncodedData
  
  val Length: Double
}
object PublicKey {
  
  @scala.inline
  def apply(Algorithm: OID, EncodedKey: EncodedData, EncodedParameters: EncodedData, Length: Double): PublicKey = {
    val __obj = js.Dynamic.literal(Algorithm = Algorithm.asInstanceOf[js.Any], EncodedKey = EncodedKey.asInstanceOf[js.Any], EncodedParameters = EncodedParameters.asInstanceOf[js.Any], Length = Length.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKey]
  }
  
  @scala.inline
  implicit class PublicKeyMutableBuilder[Self <: PublicKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: OID): Self = StObject.set(x, "Algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodedKey(value: EncodedData): Self = StObject.set(x, "EncodedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodedParameters(value: EncodedData): Self = StObject.set(x, "EncodedParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "Length", value.asInstanceOf[js.Any])
  }
}
