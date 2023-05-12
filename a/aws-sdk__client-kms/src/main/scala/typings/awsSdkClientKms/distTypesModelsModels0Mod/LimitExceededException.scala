package typings.awsSdkClientKms.distTypesModelsModels0Mod

import typings.awsSdkClientKms.anon.ExceptionOptionTypeLimitE
import typings.awsSdkClientKms.awsSdkClientKmsStrings.client
import typings.awsSdkClientKms.distTypesModelsKmsserviceexceptionMod.KMSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/models/models_0", "LimitExceededException")
@js.native
open class LimitExceededException protected () extends KMSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeLimitE) = this()
  
  @JSName("$fault")
  val $fault_LimitExceededException: client = js.native
  
  @JSName("name")
  val name_LimitExceededException: typings.awsSdkClientKms.awsSdkClientKmsStrings.LimitExceededException = js.native
}
