package typings.awsSdk.mod

import typings.awsSdk.clientsCloudfrontMod.ClientConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk", "CloudFront")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
open class CloudFront ()
  extends typings.awsSdk.clientsAllMod.CloudFront {
  def this(options: ClientConfiguration) = this()
}
object CloudFront {
  
  @JSImport("aws-sdk", "CloudFront.Signer")
  @js.native
  open class Signer protected ()
    extends typings.awsSdk.clientsAllMod.CloudFront.Signer {
    /**
      * A signer object can be used to generate signed URLs and cookies for granting access to content on restricted CloudFront distributions.
      * 
      * @param {string} keyPairId - The ID of the CloudFront key pair being used.
      * @param {string} privateKey - A private key in RSA format.
      */
    def this(keyPairId: String, privateKey: String) = this()
  }
}
