package typings.awsSdkClientKms.distTypesModelsModels0Mod

import typings.awsSdkClientKms.anon.ExceptionOptionTypeDisabl
import typings.awsSdkClientKms.awsSdkClientKmsStrings.client
import typings.awsSdkClientKms.distTypesModelsKmsserviceexceptionMod.KMSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/models/models_0", "DisabledException")
@js.native
open class DisabledException protected () extends KMSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeDisabl) = this()
  
  @JSName("$fault")
  val $fault_DisabledException: client = js.native
  
  @JSName("name")
  val name_DisabledException: typings.awsSdkClientKms.awsSdkClientKmsStrings.DisabledException = js.native
}
