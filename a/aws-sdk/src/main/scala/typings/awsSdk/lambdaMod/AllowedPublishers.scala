package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowedPublishers extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for each of the signing profiles. A signing profile defines a trusted user who can sign a code package. 
    */
  var SigningProfileVersionArns: typings.awsSdk.lambdaMod.SigningProfileVersionArns
}
object AllowedPublishers {
  
  inline def apply(SigningProfileVersionArns: SigningProfileVersionArns): AllowedPublishers = {
    val __obj = js.Dynamic.literal(SigningProfileVersionArns = SigningProfileVersionArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedPublishers]
  }
  
  extension [Self <: AllowedPublishers](x: Self) {
    
    inline def setSigningProfileVersionArns(value: SigningProfileVersionArns): Self = StObject.set(x, "SigningProfileVersionArns", value.asInstanceOf[js.Any])
    
    inline def setSigningProfileVersionArnsVarargs(value: Arn*): Self = StObject.set(x, "SigningProfileVersionArns", js.Array(value*))
  }
}
