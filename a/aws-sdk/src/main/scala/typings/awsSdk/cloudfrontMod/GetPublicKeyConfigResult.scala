package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPublicKeyConfigResult extends StObject {
  
  /**
    * The identifier for this version of the public key configuration.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * A public key configuration.
    */
  var PublicKeyConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.PublicKeyConfig] = js.undefined
}
object GetPublicKeyConfigResult {
  
  @scala.inline
  def apply(): GetPublicKeyConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPublicKeyConfigResult]
  }
  
  @scala.inline
  implicit class GetPublicKeyConfigResultMutableBuilder[Self <: GetPublicKeyConfigResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    @scala.inline
    def setPublicKeyConfig(value: PublicKeyConfig): Self = StObject.set(x, "PublicKeyConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyConfigUndefined: Self = StObject.set(x, "PublicKeyConfig", js.undefined)
  }
}
