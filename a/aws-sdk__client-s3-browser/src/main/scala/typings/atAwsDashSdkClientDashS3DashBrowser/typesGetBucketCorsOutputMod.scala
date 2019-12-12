package typings.atAwsDashSdkClientDashS3DashBrowser

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreCORSRuleMod._UnmarshalledCORSRule
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/types/GetBucketCorsOutput", JSImport.Namespace)
@js.native
object typesGetBucketCorsOutputMod extends js.Object {
  @js.native
  trait GetBucketCorsOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * _CORSRules shape
      */
    var CORSRules: js.UndefOr[js.Array[_UnmarshalledCORSRule]] = js.native
  }
  
}

