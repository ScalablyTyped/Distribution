package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateCertificateRequest extends StObject {
  
  /**
    * The ARN of the ACM certificate that you want to associate with your MediaConvert resource.
    */
  var Arn: string
}
object AssociateCertificateRequest {
  
  inline def apply(Arn: string): AssociateCertificateRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateCertificateRequest]
  }
  
  extension [Self <: AssociateCertificateRequest](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
