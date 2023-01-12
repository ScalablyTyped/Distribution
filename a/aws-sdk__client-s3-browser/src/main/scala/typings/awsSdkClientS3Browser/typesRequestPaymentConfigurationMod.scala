package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.BucketOwner
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Requester
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRequestPaymentConfigurationMod {
  
  trait RequestPaymentConfiguration extends StObject {
    
    /**
      * <p>Specifies who pays for the download and request fees.</p>
      */
    var Payer: Requester | BucketOwner | String
  }
  object RequestPaymentConfiguration {
    
    inline def apply(Payer: Requester | BucketOwner | String): RequestPaymentConfiguration = {
      val __obj = js.Dynamic.literal(Payer = Payer.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestPaymentConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestPaymentConfiguration] (val x: Self) extends AnyVal {
      
      inline def setPayer(value: Requester | BucketOwner | String): Self = StObject.set(x, "Payer", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledRequestPaymentConfiguration = RequestPaymentConfiguration
}
