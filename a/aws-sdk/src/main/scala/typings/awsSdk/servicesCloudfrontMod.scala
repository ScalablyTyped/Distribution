package typings.awsSdk

import org.scalablytyped.runtime.Instantiable2
import typings.awsSdk.cloudfrontSignerMod.Signer
import typings.awsSdk.serviceMod.Service
import typings.awsSdk.serviceMod.ServiceConfigurationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesCloudfrontMod {
  
  @JSImport("aws-sdk/lib/services/cloudfront", "CloudFrontCustomizations")
  @js.native
  /**
    * Creates a new service object with a configuration object.
    */
  open class CloudFrontCustomizations () extends Service {
    def this(config: ServiceConfigurationOptions) = this()
  }
  /* static members */
  object CloudFrontCustomizations {
    
    @JSImport("aws-sdk/lib/services/cloudfront", "CloudFrontCustomizations")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("aws-sdk/lib/services/cloudfront", "CloudFrontCustomizations.Signer")
    @js.native
    def Signer: Instantiable2[
        /* keyPairId */ String, 
        /* privateKey */ String, 
        typings.awsSdk.cloudfrontSignerMod.Signer
      ] = js.native
    inline def Signer_=(x: Instantiable2[/* keyPairId */ String, /* privateKey */ String, Signer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Signer")(x.asInstanceOf[js.Any])
  }
}
