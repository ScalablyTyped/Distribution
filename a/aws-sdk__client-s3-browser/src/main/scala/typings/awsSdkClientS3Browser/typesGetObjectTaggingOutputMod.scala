package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesTagMod.UnmarshalledTag
import typings.awsSdkTypes.responseMod.MetadataBearer
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
    var TagSet: js.Array[UnmarshalledTag] = js.native
    /**
      * _ObjectVersionId shape
      */
    var VersionId: js.UndefOr[String] = js.native
  }
  
}

