package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpAuthorization extends StObject {
  
  /**
    * Use Sig V4 authorization. For more information, see Signature Version 4 Signing Process.
    */
  var sigv4: js.UndefOr[SigV4Authorization] = js.native
}
object HttpAuthorization {
  
  @scala.inline
  def apply(): HttpAuthorization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpAuthorization]
  }
  
  @scala.inline
  implicit class HttpAuthorizationMutableBuilder[Self <: HttpAuthorization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSigv4(value: SigV4Authorization): Self = StObject.set(x, "sigv4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigv4Undefined: Self = StObject.set(x, "sigv4", js.undefined)
  }
}
