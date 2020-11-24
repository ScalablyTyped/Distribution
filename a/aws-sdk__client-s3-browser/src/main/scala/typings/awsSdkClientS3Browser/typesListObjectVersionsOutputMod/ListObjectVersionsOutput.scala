package typings.awsSdkClientS3Browser.typesListObjectVersionsOutputMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.url
import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesCommonPrefixMod.UnmarshalledCommonPrefix
import typings.awsSdkClientS3Browser.typesDeleteMarkerEntryMod.UnmarshalledDeleteMarkerEntry
import typings.awsSdkClientS3Browser.typesObjectVersionMod.UnmarshalledObjectVersion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object ListObjectVersionsOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): ListObjectVersionsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
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
    def setCommonPrefixesVarargs(value: UnmarshalledCommonPrefix*): Self = this.set("CommonPrefixes", js.Array(value :_*))
    
    @scala.inline
    def setCommonPrefixes(value: js.Array[UnmarshalledCommonPrefix]): Self = this.set("CommonPrefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonPrefixes: Self = this.set("CommonPrefixes", js.undefined)
    
    @scala.inline
    def setDeleteMarkersVarargs(value: UnmarshalledDeleteMarkerEntry*): Self = this.set("DeleteMarkers", js.Array(value :_*))
    
    @scala.inline
    def setDeleteMarkers(value: js.Array[UnmarshalledDeleteMarkerEntry]): Self = this.set("DeleteMarkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteMarkers: Self = this.set("DeleteMarkers", js.undefined)
    
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
    def setKeyMarker(value: String): Self = this.set("KeyMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyMarker: Self = this.set("KeyMarker", js.undefined)
    
    @scala.inline
    def setMaxKeys(value: Double): Self = this.set("MaxKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxKeys: Self = this.set("MaxKeys", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setNextKeyMarker(value: String): Self = this.set("NextKeyMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextKeyMarker: Self = this.set("NextKeyMarker", js.undefined)
    
    @scala.inline
    def setNextVersionIdMarker(value: String): Self = this.set("NextVersionIdMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextVersionIdMarker: Self = this.set("NextVersionIdMarker", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
    
    @scala.inline
    def setVersionIdMarker(value: String): Self = this.set("VersionIdMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionIdMarker: Self = this.set("VersionIdMarker", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: UnmarshalledObjectVersion*): Self = this.set("Versions", js.Array(value :_*))
    
    @scala.inline
    def setVersions(value: js.Array[UnmarshalledObjectVersion]): Self = this.set("Versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersions: Self = this.set("Versions", js.undefined)
  }
}
