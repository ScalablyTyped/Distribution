package typings.atAwsDashSdkClientDashS3DashBrowser

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreTagMod._UnmarshalledTag
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/types/GetObjectTaggingOutput", JSImport.Namespace)
@js.native
object typesGetObjectTaggingOutputMod extends js.Object {
  @js.native
  trait GetObjectTaggingOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * _TagSet shape
      */
    var TagSet: js.Array[_UnmarshalledTag] = js.native
    /**
      * _ObjectVersionId shape
      */
    var VersionId: js.UndefOr[String] = js.native
  }
  
}

