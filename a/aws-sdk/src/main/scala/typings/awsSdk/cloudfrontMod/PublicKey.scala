package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKey extends StObject {
  
  /**
    * The date and time when the public key was uploaded.
    */
  var CreatedTime: timestamp = js.native
  
  /**
    * The identifier of the public key.
    */
  var Id: String = js.native
  
  /**
    * Configuration information about a public key that you can use with signed URLs and signed cookies, or with field-level encryption.
    */
  var PublicKeyConfig: typings.awsSdk.cloudfrontMod.PublicKeyConfig = js.native
}
object PublicKey {
  
  @scala.inline
  def apply(CreatedTime: timestamp, Id: String, PublicKeyConfig: PublicKeyConfig): PublicKey = {
    val __obj = js.Dynamic.literal(CreatedTime = CreatedTime.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], PublicKeyConfig = PublicKeyConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKey]
  }
  
  @scala.inline
  implicit class PublicKeyMutableBuilder[Self <: PublicKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedTime(value: timestamp): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyConfig(value: PublicKeyConfig): Self = StObject.set(x, "PublicKeyConfig", value.asInstanceOf[js.Any])
  }
}
