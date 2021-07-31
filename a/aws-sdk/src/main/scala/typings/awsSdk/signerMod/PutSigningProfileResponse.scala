package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutSigningProfileResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the signing profile created.
    */
  var arn: js.UndefOr[java.lang.String] = js.undefined
}
object PutSigningProfileResponse {
  
  @scala.inline
  def apply(): PutSigningProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutSigningProfileResponse]
  }
  
  @scala.inline
  implicit class PutSigningProfileResponseMutableBuilder[Self <: PutSigningProfileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: java.lang.String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
  }
}
