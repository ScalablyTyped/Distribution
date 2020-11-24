package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListObjectsV2Output extends js.Object {
  
  /**
    * All of the keys rolled up into a common prefix count as a single return when calculating the number of returns. A response can contain CommonPrefixes only if you specify a delimiter.  CommonPrefixes contains all (if there are any) keys between Prefix and the next occurrence of the string specified by a delimiter.  CommonPrefixes lists keys that act like subdirectories in the directory specified by Prefix. For example, if the prefix is notes/ and the delimiter is a slash (/) as in notes/summer/july, the common prefix is notes/summer/. All of the keys that roll up into a common prefix count as a single return when calculating the number of returns. 
    */
  var CommonPrefixes: js.UndefOr[CommonPrefixList] = js.native
  
  /**
    * Metadata about each object returned.
    */
  var Contents: js.UndefOr[ObjectList] = js.native
  
  /**
    *  If ContinuationToken was sent with the request, it is included in the response.
    */
  var ContinuationToken: js.UndefOr[Token] = js.native
  
  /**
    * Causes keys that contain the same string between the prefix and the first occurrence of the delimiter to be rolled up into a single result element in the CommonPrefixes collection. These rolled-up keys are not returned elsewhere in the response. Each rolled-up result counts as only one return against the MaxKeys value.
    */
  var Delimiter: js.UndefOr[typings.awsSdk.s3Mod.Delimiter] = js.native
  
  /**
    * Encoding type used by Amazon S3 to encode object key names in the XML response. If you specify the encoding-type request parameter, Amazon S3 includes this element in the response, and returns encoded key name values in the following response elements:  Delimiter, Prefix, Key, and StartAfter.
    */
  var EncodingType: js.UndefOr[typings.awsSdk.s3Mod.EncodingType] = js.native
  
  /**
    * Set to false if all of the results were returned. Set to true if more keys are available to return. If the number of results exceeds that specified by MaxKeys, all of the results might not be returned.
    */
  var IsTruncated: js.UndefOr[typings.awsSdk.s3Mod.IsTruncated] = js.native
  
  /**
    * KeyCount is the number of keys returned with this request. KeyCount will always be less than equals to MaxKeys field. Say you ask for 50 keys, your result will include less than equals 50 keys 
    */
  var KeyCount: js.UndefOr[typings.awsSdk.s3Mod.KeyCount] = js.native
  
  /**
    * Sets the maximum number of keys returned in the response. By default the API returns up to 1,000 key names. The response might contain fewer keys but will never contain more.
    */
  var MaxKeys: js.UndefOr[typings.awsSdk.s3Mod.MaxKeys] = js.native
  
  /**
    * The bucket name. When using this API with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this operation with an access point through the AWS SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using Access Points in the Amazon Simple Storage Service Developer Guide. When using this API with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this operation using S3 on Outposts through the AWS SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see Using S3 on Outposts in the Amazon Simple Storage Service Developer Guide.
    */
  var Name: js.UndefOr[BucketName] = js.native
  
  /**
    *  NextContinuationToken is sent when isTruncated is true, which means there are more keys in the bucket that can be listed. The next list requests to Amazon S3 can be continued with this NextContinuationToken. NextContinuationToken is obfuscated and is not a real key
    */
  var NextContinuationToken: js.UndefOr[NextToken] = js.native
  
  /**
    *  Keys that begin with the indicated prefix.
    */
  var Prefix: js.UndefOr[typings.awsSdk.s3Mod.Prefix] = js.native
  
  /**
    * If StartAfter was sent with the request, it is included in the response.
    */
  var StartAfter: js.UndefOr[typings.awsSdk.s3Mod.StartAfter] = js.native
}
object ListObjectsV2Output {
  
  @scala.inline
  def apply(): ListObjectsV2Output = {
    val __obj = js.Dynamic.literal()
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
    def setCommonPrefixesVarargs(value: CommonPrefix*): Self = this.set("CommonPrefixes", js.Array(value :_*))
    
    @scala.inline
    def setCommonPrefixes(value: CommonPrefixList): Self = this.set("CommonPrefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonPrefixes: Self = this.set("CommonPrefixes", js.undefined)
    
    @scala.inline
    def setContentsVarargs(value: Object*): Self = this.set("Contents", js.Array(value :_*))
    
    @scala.inline
    def setContents(value: ObjectList): Self = this.set("Contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContents: Self = this.set("Contents", js.undefined)
    
    @scala.inline
    def setContinuationToken(value: Token): Self = this.set("ContinuationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinuationToken: Self = this.set("ContinuationToken", js.undefined)
    
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
    def setKeyCount(value: KeyCount): Self = this.set("KeyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyCount: Self = this.set("KeyCount", js.undefined)
    
    @scala.inline
    def setMaxKeys(value: MaxKeys): Self = this.set("MaxKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxKeys: Self = this.set("MaxKeys", js.undefined)
    
    @scala.inline
    def setName(value: BucketName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setNextContinuationToken(value: NextToken): Self = this.set("NextContinuationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextContinuationToken: Self = this.set("NextContinuationToken", js.undefined)
    
    @scala.inline
    def setPrefix(value: Prefix): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
    
    @scala.inline
    def setStartAfter(value: StartAfter): Self = this.set("StartAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAfter: Self = this.set("StartAfter", js.undefined)
  }
}
