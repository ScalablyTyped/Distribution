package typings.atAwsDashSdkClientDashS3DashBrowser

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.requester_
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreDeletedObjectMod._UnmarshalledDeletedObject
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreErrorMod._UnmarshalledError
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/types/DeleteObjectsOutput", JSImport.Namespace)
@js.native
object typesDeleteObjectsOutputMod extends js.Object {
  @js.native
  trait DeleteObjectsOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * _DeletedObjects shape
      */
    var Deleted: js.UndefOr[js.Array[_UnmarshalledDeletedObject]] = js.native
    /**
      * _Errors shape
      */
    var Errors: js.UndefOr[js.Array[_UnmarshalledError]] = js.native
    /**
      * <p>If present, indicates that the requester was successfully charged for the request.</p>
      */
    var RequestCharged: js.UndefOr[requester_ | String] = js.native
  }
  
}

