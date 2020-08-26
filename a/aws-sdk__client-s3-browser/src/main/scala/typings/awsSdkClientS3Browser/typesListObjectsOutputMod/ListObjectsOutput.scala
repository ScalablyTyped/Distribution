package typings.awsSdkClientS3Browser.typesListObjectsOutputMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.url
import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesCommonPrefixMod.UnmarshalledCommonPrefix
import typings.awsSdkClientS3Browser.typesObjectMod.UnmarshalledObject
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListObjectsOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _CommonPrefixList shape
    */
  var CommonPrefixes: js.UndefOr[js.Array[UnmarshalledCommonPrefix]] = js.native
  /**
    * _ObjectList shape
    */
  var Contents: js.UndefOr[js.Array[UnmarshalledObject]] = js.native
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

object ListObjectsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): ListObjectsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectsOutput]
  }
  @scala.inline
  implicit class ListObjectsOutputOps[Self <: ListObjectsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommonPrefixesVarargs(value: UnmarshalledCommonPrefix*): Self = this.set("CommonPrefixes", js.Array(value :_*))
    @scala.inline
    def setCommonPrefixes(value: js.Array[UnmarshalledCommonPrefix]): Self = this.set("CommonPrefixes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommonPrefixes: Self = this.set("CommonPrefixes", js.undefined)
    @scala.inline
    def setContentsVarargs(value: UnmarshalledObject*): Self = this.set("Contents", js.Array(value :_*))
    @scala.inline
    def setContents(value: js.Array[UnmarshalledObject]): Self = this.set("Contents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContents: Self = this.set("Contents", js.undefined)
    @scala.inline
    def setDelimiter(value: String): Self = this.set("Delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("Delimiter", js.undefined)
    @scala.inline
    def setEncodingType(value: url | String): Self = this.set("EncodingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncodingType: Self = this.set("EncodingType", js.undefined)
    @scala.inline
    def setIsTruncated(value: Boolean): Self = this.set("IsTruncated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTruncated: Self = this.set("IsTruncated", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setMaxKeys(value: Double): Self = this.set("MaxKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxKeys: Self = this.set("MaxKeys", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setNextMarker(value: String): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
  }
  
}

