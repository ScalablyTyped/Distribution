package typings.awsSdkClientSts.models0Mod

import typings.awsSdkClientSts.anon.ExceptionOptionTypeIDPCom
import typings.awsSdkClientSts.awsSdkClientStsStrings.client
import typings.awsSdkClientSts.stsserviceexceptionMod.STSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sts/dist-types/models/models_0", "IDPCommunicationErrorException")
@js.native
open class IDPCommunicationErrorException protected () extends STSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeIDPCom) = this()
  
  @JSName("$fault")
  val $fault_IDPCommunicationErrorException: client = js.native
  
  @JSName("name")
  val name_IDPCommunicationErrorException: typings.awsSdkClientSts.awsSdkClientStsStrings.IDPCommunicationErrorException = js.native
}
