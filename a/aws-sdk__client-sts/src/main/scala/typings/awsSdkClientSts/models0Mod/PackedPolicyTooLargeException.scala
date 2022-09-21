package typings.awsSdkClientSts.models0Mod

import typings.awsSdkClientSts.anon.ExceptionOptionTypePacked
import typings.awsSdkClientSts.awsSdkClientStsStrings.client
import typings.awsSdkClientSts.stsserviceexceptionMod.STSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sts/dist-types/models/models_0", "PackedPolicyTooLargeException")
@js.native
open class PackedPolicyTooLargeException protected () extends STSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypePacked) = this()
  
  @JSName("$fault")
  val $fault_PackedPolicyTooLargeException: client = js.native
  
  @JSName("name")
  val name_PackedPolicyTooLargeException: typings.awsSdkClientSts.awsSdkClientStsStrings.PackedPolicyTooLargeException = js.native
}
