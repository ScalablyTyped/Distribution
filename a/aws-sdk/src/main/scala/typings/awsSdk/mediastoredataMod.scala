package typings.awsSdk

import typings.awsSdk.awsSdkStrings.TEMPORAL
import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import typings.awsSdk.serviceMod.ServiceConfigurationOptions
import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.std.Date
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediastoredataMod {
  
  @JSImport("aws-sdk/clients/mediastoredata", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ^ () extends MediaStoreData {
    def this(options: ClientConfiguration) = this()
  }
  
  @js.native
  trait Blob extends StObject
  
  @js.native
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.mediastoredataMod.apiVersion] = js.native
  }
  object ClientApiVersions {
    
    @scala.inline
    def apply(): ClientApiVersions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientApiVersions]
    }
    
    @scala.inline
    implicit class ClientApiVersionsMutableBuilder[Self <: ClientApiVersions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: apiVersion): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    }
  }
  
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  
  type ContentRangePattern = String
  
  type ContentType = String
  
  @js.native
  trait DeleteObjectRequest extends StObject {
    
    /**
      * The path (including the file name) where the object is stored in the container. Format: &lt;folder name&gt;/&lt;folder name&gt;/&lt;file name&gt;
      */
    var Path: PathNaming = js.native
  }
  object DeleteObjectRequest {
    
    @scala.inline
    def apply(Path: PathNaming): DeleteObjectRequest = {
      val __obj = js.Dynamic.literal(Path = Path.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteObjectRequest]
    }
    
    @scala.inline
    implicit class DeleteObjectRequestMutableBuilder[Self <: DeleteObjectRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: PathNaming): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DeleteObjectResponse extends StObject
  
  @js.native
  trait DescribeObjectRequest extends StObject {
    
    /**
      * The path (including the file name) where the object is stored in the container. Format: &lt;folder name&gt;/&lt;folder name&gt;/&lt;file name&gt;
      */
    var Path: PathNaming = js.native
  }
  object DescribeObjectRequest {
    
    @scala.inline
    def apply(Path: PathNaming): DescribeObjectRequest = {
      val __obj = js.Dynamic.literal(Path = Path.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeObjectRequest]
    }
    
    @scala.inline
    implicit class DescribeObjectRequestMutableBuilder[Self <: DescribeObjectRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: PathNaming): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DescribeObjectResponse extends StObject {
    
    /**
      * An optional CacheControl header that allows the caller to control the object's cache behavior. Headers can be passed in as specified in the HTTP at https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9. Headers with a custom user-defined value are also accepted.
      */
    var CacheControl: js.UndefOr[StringPrimitive] = js.native
    
    /**
      * The length of the object in bytes.
      */
    var ContentLength: js.UndefOr[NonNegativeLong] = js.native
    
    /**
      * The content type of the object.
      */
    var ContentType: js.UndefOr[typings.awsSdk.mediastoredataMod.ContentType] = js.native
    
    /**
      * The ETag that represents a unique instance of the object.
      */
    var ETag: js.UndefOr[typings.awsSdk.mediastoredataMod.ETag] = js.native
    
    /**
      * The date and time that the object was last modified.
      */
    var LastModified: js.UndefOr[TimeStamp] = js.native
  }
  object DescribeObjectResponse {
    
    @scala.inline
    def apply(): DescribeObjectResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeObjectResponse]
    }
    
    @scala.inline
    implicit class DescribeObjectResponseMutableBuilder[Self <: DescribeObjectResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheControl(value: StringPrimitive): Self = StObject.set(x, "CacheControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheControlUndefined: Self = StObject.set(x, "CacheControl", js.undefined)
      
      @scala.inline
      def setContentLength(value: NonNegativeLong): Self = StObject.set(x, "ContentLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentLengthUndefined: Self = StObject.set(x, "ContentLength", js.undefined)
      
      @scala.inline
      def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
      
      @scala.inline
      def setETag(value: ETag): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
      
      @scala.inline
      def setLastModified(value: TimeStamp): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    }
  }
  
  type ETag = String
  
  @js.native
  trait GetObjectRequest extends StObject {
    
    /**
      * The path (including the file name) where the object is stored in the container. Format: &lt;folder name&gt;/&lt;folder name&gt;/&lt;file name&gt; For example, to upload the file mlaw.avi to the folder path premium\canada in the container movies, enter the path premium/canada/mlaw.avi. Do not include the container name in this path. If the path includes any folders that don't exist yet, the service creates them. For example, suppose you have an existing premium/usa subfolder. If you specify premium/canada, the service creates a canada subfolder in the premium folder. You then have two subfolders, usa and canada, in the premium folder.  There is no correlation between the path to the source and the path (folders) in the container in AWS Elemental MediaStore. For more information about folders and how they exist in a container, see the AWS Elemental MediaStore User Guide. The file name is the name that is assigned to the file that you upload. The file can have the same name inside and outside of AWS Elemental MediaStore, or it can have the same name. The file name can include or omit an extension. 
      */
    var Path: PathNaming = js.native
    
    /**
      * The range bytes of an object to retrieve. For more information about the Range header, see http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35. AWS Elemental MediaStore ignores this header for partially uploaded objects that have streaming upload availability.
      */
    var Range: js.UndefOr[RangePattern] = js.native
  }
  object GetObjectRequest {
    
    @scala.inline
    def apply(Path: PathNaming): GetObjectRequest = {
      val __obj = js.Dynamic.literal(Path = Path.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetObjectRequest]
    }
    
    @scala.inline
    implicit class GetObjectRequestMutableBuilder[Self <: GetObjectRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: PathNaming): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRange(value: RangePattern): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "Range", js.undefined)
    }
  }
  
  @js.native
  trait GetObjectResponse extends StObject {
    
    /**
      * The bytes of the object. 
      */
    var Body: js.UndefOr[PayloadBlob] = js.native
    
    /**
      * An optional CacheControl header that allows the caller to control the object's cache behavior. Headers can be passed in as specified in the HTTP spec at https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9. Headers with a custom user-defined value are also accepted.
      */
    var CacheControl: js.UndefOr[StringPrimitive] = js.native
    
    /**
      * The length of the object in bytes.
      */
    var ContentLength: js.UndefOr[NonNegativeLong] = js.native
    
    /**
      * The range of bytes to retrieve.
      */
    var ContentRange: js.UndefOr[ContentRangePattern] = js.native
    
    /**
      * The content type of the object.
      */
    var ContentType: js.UndefOr[typings.awsSdk.mediastoredataMod.ContentType] = js.native
    
    /**
      * The ETag that represents a unique instance of the object.
      */
    var ETag: js.UndefOr[typings.awsSdk.mediastoredataMod.ETag] = js.native
    
    /**
      * The date and time that the object was last modified.
      */
    var LastModified: js.UndefOr[TimeStamp] = js.native
    
    /**
      * The HTML status code of the request. Status codes ranging from 200 to 299 indicate success. All other status codes indicate the type of error that occurred.
      */
    var StatusCode: statusCode = js.native
  }
  object GetObjectResponse {
    
    @scala.inline
    def apply(StatusCode: statusCode): GetObjectResponse = {
      val __obj = js.Dynamic.literal(StatusCode = StatusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetObjectResponse]
    }
    
    @scala.inline
    implicit class GetObjectResponseMutableBuilder[Self <: GetObjectResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: PayloadBlob): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
      
      @scala.inline
      def setCacheControl(value: StringPrimitive): Self = StObject.set(x, "CacheControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheControlUndefined: Self = StObject.set(x, "CacheControl", js.undefined)
      
      @scala.inline
      def setContentLength(value: NonNegativeLong): Self = StObject.set(x, "ContentLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentLengthUndefined: Self = StObject.set(x, "ContentLength", js.undefined)
      
      @scala.inline
      def setContentRange(value: ContentRangePattern): Self = StObject.set(x, "ContentRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentRangeUndefined: Self = StObject.set(x, "ContentRange", js.undefined)
      
      @scala.inline
      def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
      
      @scala.inline
      def setETag(value: ETag): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
      
      @scala.inline
      def setLastModified(value: TimeStamp): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
      
      @scala.inline
      def setStatusCode(value: statusCode): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Item extends StObject {
    
    /**
      * The length of the item in bytes.
      */
    var ContentLength: js.UndefOr[NonNegativeLong] = js.native
    
    /**
      * The content type of the item.
      */
    var ContentType: js.UndefOr[typings.awsSdk.mediastoredataMod.ContentType] = js.native
    
    /**
      * The ETag that represents a unique instance of the item.
      */
    var ETag: js.UndefOr[typings.awsSdk.mediastoredataMod.ETag] = js.native
    
    /**
      * The date and time that the item was last modified.
      */
    var LastModified: js.UndefOr[TimeStamp] = js.native
    
    /**
      * The name of the item.
      */
    var Name: js.UndefOr[ItemName] = js.native
    
    /**
      * The item type (folder or object).
      */
    var Type: js.UndefOr[ItemType] = js.native
  }
  object Item {
    
    @scala.inline
    def apply(): Item = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentLength(value: NonNegativeLong): Self = StObject.set(x, "ContentLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentLengthUndefined: Self = StObject.set(x, "ContentLength", js.undefined)
      
      @scala.inline
      def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
      
      @scala.inline
      def setETag(value: ETag): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
      
      @scala.inline
      def setLastModified(value: TimeStamp): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
      
      @scala.inline
      def setName(value: ItemName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
      
      @scala.inline
      def setType(value: ItemType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
  
  type ItemList = js.Array[Item]
  
  type ItemName = String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.OBJECT
    - typings.awsSdk.awsSdkStrings.FOLDER
    - java.lang.String
  */
  type ItemType = _ItemType | String
  
  @js.native
  trait ListItemsRequest extends StObject {
    
    /**
      * The maximum number of results to return per API request. For example, you submit a ListItems request with MaxResults set at 500. Although 2,000 items match your request, the service returns no more than the first 500 items. (The service also returns a NextToken value that you can use to fetch the next batch of results.) The service might return fewer results than the MaxResults value. If MaxResults is not included in the request, the service defaults to pagination with a maximum of 1,000 results per page.
      */
    var MaxResults: js.UndefOr[ListLimit] = js.native
    
    /**
      * The token that identifies which batch of results that you want to see. For example, you submit a ListItems request with MaxResults set at 500. The service returns the first batch of results (up to 500) and a NextToken value. To see the next batch of results, you can submit the ListItems request a second time and specify the NextToken value. Tokens expire after 15 minutes.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.native
    
    /**
      * The path in the container from which to retrieve items. Format: &lt;folder name&gt;/&lt;folder name&gt;/&lt;file name&gt;
      */
    var Path: js.UndefOr[ListPathNaming] = js.native
  }
  object ListItemsRequest {
    
    @scala.inline
    def apply(): ListItemsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemsRequest]
    }
    
    @scala.inline
    implicit class ListItemsRequestMutableBuilder[Self <: ListItemsRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxResults(value: ListLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
      
      @scala.inline
      def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      @scala.inline
      def setPath(value: ListPathNaming): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
    }
  }
  
  @js.native
  trait ListItemsResponse extends StObject {
    
    /**
      * The metadata entries for the folders and objects at the requested path.
      */
    var Items: js.UndefOr[ItemList] = js.native
    
    /**
      * The token that can be used in a request to view the next set of results. For example, you submit a ListItems request that matches 2,000 items with MaxResults set at 500. The service returns the first batch of results (up to 500) and a NextToken value that can be used to fetch the next batch of results.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.native
  }
  object ListItemsResponse {
    
    @scala.inline
    def apply(): ListItemsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemsResponse]
    }
    
    @scala.inline
    implicit class ListItemsResponseMutableBuilder[Self <: ListItemsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: ItemList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: Item*): Self = StObject.set(x, "Items", js.Array(value :_*))
      
      @scala.inline
      def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  type ListLimit = Double
  
  type ListPathNaming = String
  
  @js.native
  trait MediaStoreData extends Service {
    
    @JSName("config")
    var config_MediaStoreData: ConfigBase with ClientConfiguration = js.native
    
    /**
      * Deletes an object at the specified path.
      */
    def deleteObject(): Request[DeleteObjectResponse, AWSError] = js.native
    def deleteObject(callback: js.Function2[/* err */ AWSError, /* data */ DeleteObjectResponse, Unit]): Request[DeleteObjectResponse, AWSError] = js.native
    /**
      * Deletes an object at the specified path.
      */
    def deleteObject(params: DeleteObjectRequest): Request[DeleteObjectResponse, AWSError] = js.native
    def deleteObject(
      params: DeleteObjectRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ DeleteObjectResponse, Unit]
    ): Request[DeleteObjectResponse, AWSError] = js.native
    
    /**
      * Gets the headers for an object at the specified path.
      */
    def describeObject(): Request[DescribeObjectResponse, AWSError] = js.native
    def describeObject(callback: js.Function2[/* err */ AWSError, /* data */ DescribeObjectResponse, Unit]): Request[DescribeObjectResponse, AWSError] = js.native
    /**
      * Gets the headers for an object at the specified path.
      */
    def describeObject(params: DescribeObjectRequest): Request[DescribeObjectResponse, AWSError] = js.native
    def describeObject(
      params: DescribeObjectRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ DescribeObjectResponse, Unit]
    ): Request[DescribeObjectResponse, AWSError] = js.native
    
    /**
      * Downloads the object at the specified path. If the object’s upload availability is set to streaming, AWS Elemental MediaStore downloads the object even if it’s still uploading the object.
      */
    def getObject(): Request[GetObjectResponse, AWSError] = js.native
    def getObject(callback: js.Function2[/* err */ AWSError, /* data */ GetObjectResponse, Unit]): Request[GetObjectResponse, AWSError] = js.native
    /**
      * Downloads the object at the specified path. If the object’s upload availability is set to streaming, AWS Elemental MediaStore downloads the object even if it’s still uploading the object.
      */
    def getObject(params: GetObjectRequest): Request[GetObjectResponse, AWSError] = js.native
    def getObject(
      params: GetObjectRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ GetObjectResponse, Unit]
    ): Request[GetObjectResponse, AWSError] = js.native
    
    /**
      * Provides a list of metadata entries about folders and objects in the specified folder.
      */
    def listItems(): Request[ListItemsResponse, AWSError] = js.native
    def listItems(callback: js.Function2[/* err */ AWSError, /* data */ ListItemsResponse, Unit]): Request[ListItemsResponse, AWSError] = js.native
    /**
      * Provides a list of metadata entries about folders and objects in the specified folder.
      */
    def listItems(params: ListItemsRequest): Request[ListItemsResponse, AWSError] = js.native
    def listItems(
      params: ListItemsRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ ListItemsResponse, Unit]
    ): Request[ListItemsResponse, AWSError] = js.native
    
    /**
      * Uploads an object to the specified path. Object sizes are limited to 25 MB for standard upload availability and 10 MB for streaming upload availability.
      */
    def putObject(): Request[PutObjectResponse, AWSError] = js.native
    def putObject(callback: js.Function2[/* err */ AWSError, /* data */ PutObjectResponse, Unit]): Request[PutObjectResponse, AWSError] = js.native
    /**
      * Uploads an object to the specified path. Object sizes are limited to 25 MB for standard upload availability and 10 MB for streaming upload availability.
      */
    def putObject(params: PutObjectRequest): Request[PutObjectResponse, AWSError] = js.native
    def putObject(
      params: PutObjectRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ PutObjectResponse, Unit]
    ): Request[PutObjectResponse, AWSError] = js.native
  }
  
  type NonNegativeLong = Double
  
  type PaginationToken = String
  
  type PathNaming = String
  
  type PayloadBlob = Buffer | Uint8Array | Blob | String | Readable
  
  @js.native
  trait PutObjectRequest extends StObject {
    
    /**
      * The bytes to be stored. 
      */
    var Body: PayloadBlob = js.native
    
    /**
      * An optional CacheControl header that allows the caller to control the object's cache behavior. Headers can be passed in as specified in the HTTP at https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9. Headers with a custom user-defined value are also accepted.
      */
    var CacheControl: js.UndefOr[StringPrimitive] = js.native
    
    /**
      * The content type of the object.
      */
    var ContentType: js.UndefOr[typings.awsSdk.mediastoredataMod.ContentType] = js.native
    
    /**
      * The path (including the file name) where the object is stored in the container. Format: &lt;folder name&gt;/&lt;folder name&gt;/&lt;file name&gt; For example, to upload the file mlaw.avi to the folder path premium\canada in the container movies, enter the path premium/canada/mlaw.avi. Do not include the container name in this path. If the path includes any folders that don't exist yet, the service creates them. For example, suppose you have an existing premium/usa subfolder. If you specify premium/canada, the service creates a canada subfolder in the premium folder. You then have two subfolders, usa and canada, in the premium folder.  There is no correlation between the path to the source and the path (folders) in the container in AWS Elemental MediaStore. For more information about folders and how they exist in a container, see the AWS Elemental MediaStore User Guide. The file name is the name that is assigned to the file that you upload. The file can have the same name inside and outside of AWS Elemental MediaStore, or it can have the same name. The file name can include or omit an extension. 
      */
    var Path: PathNaming = js.native
    
    /**
      * Indicates the storage class of a Put request. Defaults to high-performance temporal storage class, and objects are persisted into durable storage shortly after being received.
      */
    var StorageClass: js.UndefOr[typings.awsSdk.mediastoredataMod.StorageClass] = js.native
    
    /**
      * Indicates the availability of an object while it is still uploading. If the value is set to streaming, the object is available for downloading after some initial buffering but before the object is uploaded completely. If the value is set to standard, the object is available for downloading only when it is uploaded completely. The default value for this header is standard. To use this header, you must also set the HTTP Transfer-Encoding header to chunked.
      */
    var UploadAvailability: js.UndefOr[typings.awsSdk.mediastoredataMod.UploadAvailability] = js.native
  }
  object PutObjectRequest {
    
    @scala.inline
    def apply(Body: PayloadBlob, Path: PathNaming): PutObjectRequest = {
      val __obj = js.Dynamic.literal(Body = Body.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutObjectRequest]
    }
    
    @scala.inline
    implicit class PutObjectRequestMutableBuilder[Self <: PutObjectRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: PayloadBlob): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheControl(value: StringPrimitive): Self = StObject.set(x, "CacheControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheControlUndefined: Self = StObject.set(x, "CacheControl", js.undefined)
      
      @scala.inline
      def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
      
      @scala.inline
      def setPath(value: PathNaming): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageClass(value: StorageClass): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
      
      @scala.inline
      def setUploadAvailability(value: UploadAvailability): Self = StObject.set(x, "UploadAvailability", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadAvailabilityUndefined: Self = StObject.set(x, "UploadAvailability", js.undefined)
    }
  }
  
  @js.native
  trait PutObjectResponse extends StObject {
    
    /**
      * The SHA256 digest of the object that is persisted.
      */
    var ContentSHA256: js.UndefOr[SHA256Hash] = js.native
    
    /**
      * Unique identifier of the object in the container.
      */
    var ETag: js.UndefOr[typings.awsSdk.mediastoredataMod.ETag] = js.native
    
    /**
      * The storage class where the object was persisted. The class should be “Temporal”.
      */
    var StorageClass: js.UndefOr[typings.awsSdk.mediastoredataMod.StorageClass] = js.native
  }
  object PutObjectResponse {
    
    @scala.inline
    def apply(): PutObjectResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutObjectResponse]
    }
    
    @scala.inline
    implicit class PutObjectResponseMutableBuilder[Self <: PutObjectResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentSHA256(value: SHA256Hash): Self = StObject.set(x, "ContentSHA256", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentSHA256Undefined: Self = StObject.set(x, "ContentSHA256", js.undefined)
      
      @scala.inline
      def setETag(value: ETag): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
      
      @scala.inline
      def setStorageClass(value: StorageClass): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
    }
  }
  
  type RangePattern = String
  
  type SHA256Hash = String
  
  type StorageClass = TEMPORAL | String
  
  type StringPrimitive = String
  
  type TimeStamp = Date
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STANDARD
    - typings.awsSdk.awsSdkStrings.STREAMING
    - java.lang.String
  */
  type UploadAvailability = _UploadAvailability | String
  
  trait _ItemType extends StObject
  
  trait _UploadAvailability extends StObject
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-09-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
  
  type statusCode = Double
}
