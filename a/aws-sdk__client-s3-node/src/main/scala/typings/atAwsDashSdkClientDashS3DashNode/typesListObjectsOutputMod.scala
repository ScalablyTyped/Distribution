package typings.atAwsDashSdkClientDashS3DashNode

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.url
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreCommonPrefixMod._UnmarshalledCommonPrefix
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreObjectMod._UnmarshalledObject
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/ListObjectsOutput", JSImport.Namespace)
@js.native
object typesListObjectsOutputMod extends js.Object {
  @js.native
  trait ListObjectsOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * _CommonPrefixList shape
      */
    var CommonPrefixes: js.UndefOr[js.Array[_UnmarshalledCommonPrefix]] = js.native
    /**
      * _ObjectList shape
      */
    var Contents: js.UndefOr[js.Array[_UnmarshalledObject]] = js.native
    /**
      * _Delimiter shape
      */
    var Delimiter: js.UndefOr[String] = js.native
    /**
      * <p>Encoding type used by Amazon S3 to encode object keys in the response.</p>
      */
    var EncodingType: js.UndefOr[url | String] = js.native
    /**
      * <p>A flag that indicates whether or not Amazon S3 returned all of the results that satisfied the search criteria.</p>
      */
    var IsTruncated: js.UndefOr[Boolean] = js.native
    /**
      * _Marker shape
      */
    var Marker: js.UndefOr[String] = js.native
    /**
      * _MaxKeys shape
      */
    var MaxKeys: js.UndefOr[Double] = js.native
    /**
      * _BucketName shape
      */
    var Name: js.UndefOr[String] = js.native
    /**
      * <p>When response is truncated (the IsTruncated element value in the response is true), you can use the key name in this field as marker in the subsequent request to get next set of objects. Amazon S3 lists objects in alphabetical order Note: This element is returned only if you have delimiter request parameter specified. If response does not include the NextMaker and it is truncated, you can use the value of the last Key in the response as the marker in the subsequent request to get the next set of object keys.</p>
      */
    var NextMarker: js.UndefOr[String] = js.native
    /**
      * _Prefix shape
      */
    var Prefix: js.UndefOr[String] = js.native
  }
  
}

