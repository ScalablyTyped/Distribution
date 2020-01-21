package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.requester_
import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesDeletedObjectMod.UnmarshalledDeletedObject
import typings.awsSdkClientS3Browser.typesErrorMod.UnmarshalledError
import typings.awsSdkTypes.responseMod.MetadataBearer
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
    var Deleted: js.UndefOr[js.Array[UnmarshalledDeletedObject]] = js.native
    /**
      * _Errors shape
      */
    var Errors: js.UndefOr[js.Array[UnmarshalledError]] = js.native
    /**
      * <p>If present, indicates that the requester was successfully charged for the request.</p>
      */
    var RequestCharged: js.UndefOr[requester_ | String] = js.native
  }
  
}

