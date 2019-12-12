package typings.atAwsDashSdkClientDashS3DashBrowser

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/types/DeleteObjectTaggingOutput", JSImport.Namespace)
@js.native
object typesDeleteObjectTaggingOutputMod extends js.Object {
  @js.native
  trait DeleteObjectTaggingOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * <p>The versionId of the object the tag-set was removed from.</p>
      */
    var VersionId: js.UndefOr[String] = js.native
  }
  
}

