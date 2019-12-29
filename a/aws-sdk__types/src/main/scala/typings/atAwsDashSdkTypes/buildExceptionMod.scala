package typings.atAwsDashSdkTypes

import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/types/build/exception", JSImport.Namespace)
@js.native
object buildExceptionMod extends js.Object {
  @js.native
  trait ServiceException[Details]
    extends Error
       with MetadataBearer {
    var details: Details = js.native
  }
  
  @js.native
  trait UnkownServiceException
    extends ServiceException[js.UndefOr[scala.Nothing]] {
    @JSName("name")
    var name_UnkownServiceException: typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.Error = js.native
  }
  
}

