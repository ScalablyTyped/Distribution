package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.url
import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Node.typesCommonPrefixMod.UnmarshalledCommonPrefix
import typings.awsSdkClientS3Node.typesDeleteMarkerEntryMod.UnmarshalledDeleteMarkerEntry
import typings.awsSdkClientS3Node.typesObjectVersionMod.UnmarshalledObjectVersion
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/ListObjectVersionsOutput", JSImport.Namespace)
@js.native
object typesListObjectVersionsOutputMod extends js.Object {
  @js.native
  trait ListObjectVersionsOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * _CommonPrefixList shape
      */
    var CommonPrefixes: js.UndefOr[js.Array[UnmarshalledCommonPrefix]] = js.native
    /**
      * _DeleteMarkers shape
      */
    var DeleteMarkers: js.UndefOr[js.Array[UnmarshalledDeleteMarkerEntry]] = js.native
    /**
      * _Delimiter shape
      */
    var Delimiter: js.UndefOr[String] = js.native
    /**
      * <p>Encoding type used by Amazon S3 to encode object keys in the response.</p>
      */
    var EncodingType: js.UndefOr[url | String] = js.native
    /**
      * <p>A flag that indicates whether or not Amazon S3 returned all of the results that satisfied the search criteria. If your results were truncated, you can make a follow-up paginated request using the NextKeyMarker and NextVersionIdMarker response parameters as a starting place in another request to return the rest of the results.</p>
      */
    var IsTruncated: js.UndefOr[Boolean] = js.native
    /**
      * <p>Marks the last Key returned in a truncated response.</p>
      */
    var KeyMarker: js.UndefOr[String] = js.native
    /**
      * _MaxKeys shape
      */
    var MaxKeys: js.UndefOr[Double] = js.native
    /**
      * _BucketName shape
      */
    var Name: js.UndefOr[String] = js.native
    /**
      * <p>Use this value for the key marker request parameter in a subsequent request.</p>
      */
    var NextKeyMarker: js.UndefOr[String] = js.native
    /**
      * <p>Use this value for the next version id marker parameter in a subsequent request.</p>
      */
    var NextVersionIdMarker: js.UndefOr[String] = js.native
    /**
      * _Prefix shape
      */
    var Prefix: js.UndefOr[String] = js.native
    /**
      * _VersionIdMarker shape
      */
    var VersionIdMarker: js.UndefOr[String] = js.native
    /**
      * _ObjectVersionList shape
      */
    var Versions: js.UndefOr[js.Array[UnmarshalledObjectVersion]] = js.native
  }
  
}

