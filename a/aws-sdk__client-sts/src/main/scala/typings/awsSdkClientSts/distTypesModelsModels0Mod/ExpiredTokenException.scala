package typings.awsSdkClientSts.distTypesModelsModels0Mod

import typings.awsSdkClientSts.anon.ExceptionOptionTypeExpire
import typings.awsSdkClientSts.awsSdkClientStsStrings.client
import typings.awsSdkClientSts.distTypesModelsStsserviceexceptionMod.STSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sts/dist-types/models/models_0", "ExpiredTokenException")
@js.native
open class ExpiredTokenException protected () extends STSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeExpire) = this()
  
  @JSName("$fault")
  val $fault_ExpiredTokenException: client = js.native
  
  @JSName("name")
  val name_ExpiredTokenException: typings.awsSdkClientSts.awsSdkClientStsStrings.ExpiredTokenException = js.native
}
