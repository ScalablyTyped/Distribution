package typings.awsSdk

import typings.awsSdk.anon.ConnectTimeout
import typings.awsSdk.credentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ec2MetadataCredentialsMod {
  
  @JSImport("aws-sdk/lib/credentials/ec2_metadata_credentials", "EC2MetadataCredentials")
  @js.native
  /**
  		 * Creates credentials from the metadata service on an EC2 instance.
  		 * @param {object} options - Override the default (1s) timeout period.
  		 */
  class EC2MetadataCredentials () extends Credentials {
    def this(options: EC2MetadataCredentialsOptions) = this()
  }
  
  trait EC2MetadataCredentialsOptions extends StObject {
    
    var httpOptions: js.UndefOr[ConnectTimeout] = js.undefined
    
    var maxRetries: js.UndefOr[Double] = js.undefined
  }
  object EC2MetadataCredentialsOptions {
    
    @scala.inline
    def apply(): EC2MetadataCredentialsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EC2MetadataCredentialsOptions]
    }
    
    @scala.inline
    implicit class EC2MetadataCredentialsOptionsMutableBuilder[Self <: EC2MetadataCredentialsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHttpOptions(value: ConnectTimeout): Self = StObject.set(x, "httpOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpOptionsUndefined: Self = StObject.set(x, "httpOptions", js.undefined)
      
      @scala.inline
      def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    }
  }
}
