package typings.awsSdkClientSts.models0Mod

import typings.awsSdkClientSts.anon.ExceptionOptionTypeIDPRej
import typings.awsSdkClientSts.awsSdkClientStsStrings.client
import typings.awsSdkClientSts.stsserviceexceptionMod.STSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sts/dist-types/models/models_0", "IDPRejectedClaimException")
@js.native
open class IDPRejectedClaimException protected () extends STSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeIDPRej) = this()
  
  @JSName("$fault")
  val $fault_IDPRejectedClaimException: client = js.native
  
  @JSName("name")
  val name_IDPRejectedClaimException: typings.awsSdkClientSts.awsSdkClientStsStrings.IDPRejectedClaimException = js.native
}
