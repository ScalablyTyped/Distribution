package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/types/PutObjectTaggingOutput", JSImport.Namespace)
@js.native
object typesPutObjectTaggingOutputMod extends js.Object {
  @js.native
  trait PutObjectTaggingOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * _ObjectVersionId shape
      */
    var VersionId: js.UndefOr[String] = js.native
  }
  
}

