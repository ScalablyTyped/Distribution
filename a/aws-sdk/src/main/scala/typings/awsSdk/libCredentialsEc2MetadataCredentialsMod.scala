package typings.awsSdk

import typings.awsSdk.anon.ConnectTimeout
import typings.awsSdk.libConfigBaseMod.Logger
import typings.awsSdk.libCredentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCredentialsEc2MetadataCredentialsMod {
  
  @JSImport("aws-sdk/lib/credentials/ec2_metadata_credentials", "EC2MetadataCredentials")
  @js.native
  /**
    * Creates credentials from the metadata service on an EC2 instance.
    * @param {object} options - Override the default (1s) timeout period.
    */
  open class EC2MetadataCredentials () extends Credentials {
    def this(options: EC2MetadataCredentialsOptions) = this()
    
    /**
      * The original expiration of the current credential. In case of AWS
      * outage, the EC2 metadata will extend expiration of the existing
      * credential.
      */
    var originalExpiration: js.UndefOr[js.Date] = js.native
  }
  
  trait EC2MetadataCredentialsOptions extends StObject {
    
    var httpOptions: js.UndefOr[ConnectTimeout] = js.undefined
    
    var logger: js.UndefOr[Logger] = js.undefined
    
    var maxRetries: js.UndefOr[Double] = js.undefined
  }
  object EC2MetadataCredentialsOptions {
    
    inline def apply(): EC2MetadataCredentialsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EC2MetadataCredentialsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EC2MetadataCredentialsOptions] (val x: Self) extends AnyVal {
      
      inline def setHttpOptions(value: ConnectTimeout): Self = StObject.set(x, "httpOptions", value.asInstanceOf[js.Any])
      
      inline def setHttpOptionsUndefined: Self = StObject.set(x, "httpOptions", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    }
  }
}
