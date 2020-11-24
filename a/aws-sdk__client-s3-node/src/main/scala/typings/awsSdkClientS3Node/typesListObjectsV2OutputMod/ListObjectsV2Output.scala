package typings.awsSdkClientS3Node.typesListObjectsV2OutputMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.url
import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Node.typesCommonPrefixMod.UnmarshalledCommonPrefix
import typings.awsSdkClientS3Node.typesObjectMod.UnmarshalledObject
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListObjectsV2Output
  extends MetadataBearer
     with _OutputTypesUnion {
  
  /**
    * <p>CommonPrefixes contains all (if there are any) keys between Prefix and the next occurrence of the string specified by delimiter</p>
    */
  var CommonPrefixes: js.UndefOr[js.Array[UnmarshalledCommonPrefix]] = js.native
  
  /**
    * <p>Metadata about each object returned.</p>
    */
  var Contents: js.UndefOr[js.Array[UnmarshalledObject]] = js.native
  
  /**
    * <p>ContinuationToken indicates Amazon S3 that the list is being continued on this bucket with a token. ContinuationToken is obfuscated and is not a real key</p>
    */
  var ContinuationToken: js.UndefOr[String] = js.native
  
  /**
    * <p>A delimiter is a character you use to group keys.</p>
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
    * <p>KeyCount is the number of keys returned with this request. KeyCount will always be less than equals to MaxKeys field. Say you ask for 50 keys, your result will include less than equals 50 keys </p>
    */
  var KeyCount: js.UndefOr[Double] = js.native
  
  /**
    * <p>Sets the maximum number of keys returned in the response. The response might contain fewer keys but will never contain more.</p>
    */
  var MaxKeys: js.UndefOr[Double] = js.native
  
  /**
    * <p>Name of the bucket to list.</p>
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * <p>NextContinuationToken is sent when isTruncated is true which means there are more keys in the bucket that can be listed. The next list requests to Amazon S3 can be continued with this NextContinuationToken. NextContinuationToken is obfuscated and is not a real key</p>
    */
  var NextContinuationToken: js.UndefOr[String] = js.native
  
  /**
    * <p>Limits the response to keys that begin with the specified prefix.</p>
    */
  var Prefix: js.UndefOr[String] = js.native
  
  /**
    * <p>StartAfter is where you want Amazon S3 to start listing from. Amazon S3 starts listing after this specified key. StartAfter can be any key in the bucket</p>
    */
  var StartAfter: js.UndefOr[String] = js.native
}
object ListObjectsV2Output {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): ListObjectsV2Output = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectsV2Output]
  }
  
  @scala.inline
  implicit class ListObjectsV2OutputOps[Self <: ListObjectsV2Output] (val x: Self) extends AnyVal {
    
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
    def setContinuationToken(value: String): Self = this.set("ContinuationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinuationToken: Self = this.set("ContinuationToken", js.undefined)
    
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
    def setKeyCount(value: Double): Self = this.set("KeyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyCount: Self = this.set("KeyCount", js.undefined)
    
    @scala.inline
    def setMaxKeys(value: Double): Self = this.set("MaxKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxKeys: Self = this.set("MaxKeys", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setNextContinuationToken(value: String): Self = this.set("NextContinuationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextContinuationToken: Self = this.set("NextContinuationToken", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
    
    @scala.inline
    def setStartAfter(value: String): Self = this.set("StartAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAfter: Self = this.set("StartAfter", js.undefined)
  }
}
