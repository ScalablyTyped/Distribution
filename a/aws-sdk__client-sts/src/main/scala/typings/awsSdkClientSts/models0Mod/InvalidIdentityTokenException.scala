package typings.awsSdkClientSts.models0Mod

import typings.awsSdkClientSts.anon.ExceptionOptionTypeInvali
import typings.awsSdkClientSts.awsSdkClientStsStrings.client
import typings.awsSdkClientSts.stsserviceexceptionMod.STSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sts/dist-types/models/models_0", "InvalidIdentityTokenException")
@js.native
open class InvalidIdentityTokenException protected () extends STSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeInvali) = this()
  
  @JSName("$fault")
  val $fault_InvalidIdentityTokenException: client = js.native
  
  @JSName("name")
  val name_InvalidIdentityTokenException: typings.awsSdkClientSts.awsSdkClientStsStrings.InvalidIdentityTokenException = js.native
}
