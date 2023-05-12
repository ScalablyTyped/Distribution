package typings.awsSdkClientKms.distTypesModelsModels0Mod

import typings.awsSdkClientKms.anon.ExceptionOptionTypeDepend
import typings.awsSdkClientKms.awsSdkClientKmsStrings.server
import typings.awsSdkClientKms.distTypesModelsKmsserviceexceptionMod.KMSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/models/models_0", "DependencyTimeoutException")
@js.native
open class DependencyTimeoutException protected () extends KMSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeDepend) = this()
  
  @JSName("$fault")
  val $fault_DependencyTimeoutException: server = js.native
  
  @JSName("name")
  val name_DependencyTimeoutException: typings.awsSdkClientKms.awsSdkClientKmsStrings.DependencyTimeoutException = js.native
}
