package typings.cadesplugin.CAPICOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKey extends js.Object {
  
  val Algorithm: OID = js.native
  
  val EncodedKey: EncodedData = js.native
  
  val EncodedParameters: EncodedData = js.native
  
  val Length: Double = js.native
}
object PublicKey {
  
  @scala.inline
  def apply(Algorithm: OID, EncodedKey: EncodedData, EncodedParameters: EncodedData, Length: Double): PublicKey = {
    val __obj = js.Dynamic.literal(Algorithm = Algorithm.asInstanceOf[js.Any], EncodedKey = EncodedKey.asInstanceOf[js.Any], EncodedParameters = EncodedParameters.asInstanceOf[js.Any], Length = Length.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKey]
  }
  
  @scala.inline
  implicit class PublicKeyOps[Self <: PublicKey] (val x: Self) extends AnyVal {
    
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
    def setAlgorithm(value: OID): Self = this.set("Algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodedKey(value: EncodedData): Self = this.set("EncodedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodedParameters(value: EncodedData): Self = this.set("EncodedParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("Length", value.asInstanceOf[js.Any])
  }
}
