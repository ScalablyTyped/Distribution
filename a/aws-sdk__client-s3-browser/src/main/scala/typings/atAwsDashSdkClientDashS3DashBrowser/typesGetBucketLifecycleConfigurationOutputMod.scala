package typings.atAwsDashSdkClientDashS3DashBrowser

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreLifecycleRuleMod._UnmarshalledLifecycleRule
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/types/GetBucketLifecycleConfigurationOutput", JSImport.Namespace)
@js.native
object typesGetBucketLifecycleConfigurationOutputMod extends js.Object {
  @js.native
  trait GetBucketLifecycleConfigurationOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * _LifecycleRules shape
      */
    var Rules: js.UndefOr[js.Array[_UnmarshalledLifecycleRule]] = js.native
  }
  
}

