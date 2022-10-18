package typings.awsSdkClientSts.distTypesModelsModels0Mod

import typings.awsSdkClientSts.anon.ExceptionOptionTypeRegion
import typings.awsSdkClientSts.awsSdkClientStsStrings.client
import typings.awsSdkClientSts.distTypesModelsStsserviceexceptionMod.STSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sts/dist-types/models/models_0", "RegionDisabledException")
@js.native
open class RegionDisabledException protected () extends STSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeRegion) = this()
  
  @JSName("$fault")
  val $fault_RegionDisabledException: client = js.native
  
  @JSName("name")
  val name_RegionDisabledException: typings.awsSdkClientSts.awsSdkClientStsStrings.RegionDisabledException = js.native
}
