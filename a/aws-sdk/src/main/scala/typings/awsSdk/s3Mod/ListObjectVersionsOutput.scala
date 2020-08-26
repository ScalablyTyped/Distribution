package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListObjectVersionsOutput extends js.Object {
  /**
    * All of the keys rolled up into a common prefix count as a single return when calculating the number of returns.
    */
  var CommonPrefixes: js.UndefOr[CommonPrefixList] = js.native
  /**
    * Container for an object that is a delete marker.
    */
  var DeleteMarkers: js.UndefOr[typings.awsSdk.s3Mod.DeleteMarkers] = js.native
  /**
    * The delimiter grouping the included keys. A delimiter is a character that you specify to group keys. All keys that contain the same string between the prefix and the first occurrence of the delimiter are grouped under a single result element in CommonPrefixes. These groups are counted as one result against the max-keys limitation. These keys are not returned elsewhere in the response.
    */
  var Delimiter: js.UndefOr[typings.awsSdk.s3Mod.Delimiter] = js.native
  /**
    *  Encoding type used by Amazon S3 to encode object key names in the XML response. If you specify encoding-type request parameter, Amazon S3 includes this element in the response, and returns encoded key name values in the following response elements:  KeyMarker, NextKeyMarker, Prefix, Key, and Delimiter.
    */
  var EncodingType: js.UndefOr[typings.awsSdk.s3Mod.EncodingType] = js.native
  /**
    * A flag that indicates whether Amazon S3 returned all of the results that satisfied the search criteria. If your results were truncated, you can make a follow-up paginated request using the NextKeyMarker and NextVersionIdMarker response parameters as a starting place in another request to return the rest of the results.
    */
  var IsTruncated: js.UndefOr[typings.awsSdk.s3Mod.IsTruncated] = js.native
  /**
    * Marks the last key returned in a truncated response.
    */
  var KeyMarker: js.UndefOr[typings.awsSdk.s3Mod.KeyMarker] = js.native
  /**
    * Specifies the maximum number of objects to return.
    */
  var MaxKeys: js.UndefOr[typings.awsSdk.s3Mod.MaxKeys] = js.native
  /**
    * Bucket name.
    */
  var Name: js.UndefOr[BucketName] = js.native
  /**
    * When the number of responses exceeds the value of MaxKeys, NextKeyMarker specifies the first key not returned that satisfies the search criteria. Use this value for the key-marker request parameter in a subsequent request.
    */
  var NextKeyMarker: js.UndefOr[typings.awsSdk.s3Mod.NextKeyMarker] = js.native
  /**
    * When the number of responses exceeds the value of MaxKeys, NextVersionIdMarker specifies the first object version not returned that satisfies the search criteria. Use this value for the version-id-marker request parameter in a subsequent request.
    */
  var NextVersionIdMarker: js.UndefOr[typings.awsSdk.s3Mod.NextVersionIdMarker] = js.native
  /**
    * Selects objects that start with the value supplied by this parameter.
    */
  var Prefix: js.UndefOr[typings.awsSdk.s3Mod.Prefix] = js.native
  /**
    * Marks the last version of the key returned in a truncated response.
    */
  var VersionIdMarker: js.UndefOr[typings.awsSdk.s3Mod.VersionIdMarker] = js.native
  /**
    * Container for version information.
    */
  var Versions: js.UndefOr[ObjectVersionList] = js.native
}

object ListObjectVersionsOutput {
  @scala.inline
  def apply(): ListObjectVersionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListObjectVersionsOutput]
  }
  @scala.inline
  implicit class ListObjectVersionsOutputOps[Self <: ListObjectVersionsOutput] (val x: Self) extends AnyVal {
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
    def setCommonPrefixesVarargs(value: CommonPrefix*): Self = this.set("CommonPrefixes", js.Array(value :_*))
    @scala.inline
    def setCommonPrefixes(value: CommonPrefixList): Self = this.set("CommonPrefixes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommonPrefixes: Self = this.set("CommonPrefixes", js.undefined)
    @scala.inline
    def setDeleteMarkersVarargs(value: DeleteMarkerEntry*): Self = this.set("DeleteMarkers", js.Array(value :_*))
    @scala.inline
    def setDeleteMarkers(value: DeleteMarkers): Self = this.set("DeleteMarkers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteMarkers: Self = this.set("DeleteMarkers", js.undefined)
    @scala.inline
    def setDelimiter(value: Delimiter): Self = this.set("Delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("Delimiter", js.undefined)
    @scala.inline
    def setEncodingType(value: EncodingType): Self = this.set("EncodingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncodingType: Self = this.set("EncodingType", js.undefined)
    @scala.inline
    def setIsTruncated(value: IsTruncated): Self = this.set("IsTruncated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTruncated: Self = this.set("IsTruncated", js.undefined)
    @scala.inline
    def setKeyMarker(value: KeyMarker): Self = this.set("KeyMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyMarker: Self = this.set("KeyMarker", js.undefined)
    @scala.inline
    def setMaxKeys(value: MaxKeys): Self = this.set("MaxKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxKeys: Self = this.set("MaxKeys", js.undefined)
    @scala.inline
    def setName(value: BucketName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setNextKeyMarker(value: NextKeyMarker): Self = this.set("NextKeyMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextKeyMarker: Self = this.set("NextKeyMarker", js.undefined)
    @scala.inline
    def setNextVersionIdMarker(value: NextVersionIdMarker): Self = this.set("NextVersionIdMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextVersionIdMarker: Self = this.set("NextVersionIdMarker", js.undefined)
    @scala.inline
    def setPrefix(value: Prefix): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
    @scala.inline
    def setVersionIdMarker(value: VersionIdMarker): Self = this.set("VersionIdMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionIdMarker: Self = this.set("VersionIdMarker", js.undefined)
    @scala.inline
    def setVersionsVarargs(value: ObjectVersion*): Self = this.set("Versions", js.Array(value :_*))
    @scala.inline
    def setVersions(value: ObjectVersionList): Self = this.set("Versions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersions: Self = this.set("Versions", js.undefined)
  }
  
}

