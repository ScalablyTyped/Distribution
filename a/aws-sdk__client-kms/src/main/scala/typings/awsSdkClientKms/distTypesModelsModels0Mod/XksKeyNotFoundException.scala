package typings.awsSdkClientKms.distTypesModelsModels0Mod

import typings.awsSdkClientKms.anon.ExceptionOptionTypeXksKey
import typings.awsSdkClientKms.awsSdkClientKmsStrings.client
import typings.awsSdkClientKms.distTypesModelsKmsserviceexceptionMod.KMSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/models/models_0", "XksKeyNotFoundException")
@js.native
open class XksKeyNotFoundException protected () extends KMSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeXksKey) = this()
  
  @JSName("$fault")
  val $fault_XksKeyNotFoundException: client = js.native
  
  @JSName("name")
  val name_XksKeyNotFoundException: typings.awsSdkClientKms.awsSdkClientKmsStrings.XksKeyNotFoundException = js.native
}
