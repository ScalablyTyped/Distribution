package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListObjectVersionsOutput extends StObject {
  
  /**
    * All of the keys rolled up into a common prefix count as a single return when calculating the number of returns.
    */
  var CommonPrefixes: js.UndefOr[CommonPrefixList] = js.undefined
  
  /**
    * Container for an object that is a delete marker.
    */
  var DeleteMarkers: js.UndefOr[typings.awsSdk.s3Mod.DeleteMarkers] = js.undefined
  
  /**
    * The delimiter grouping the included keys. A delimiter is a character that you specify to group keys. All keys that contain the same string between the prefix and the first occurrence of the delimiter are grouped under a single result element in CommonPrefixes. These groups are counted as one result against the max-keys limitation. These keys are not returned elsewhere in the response.
    */
  var Delimiter: js.UndefOr[typings.awsSdk.s3Mod.Delimiter] = js.undefined
  
  /**
    *  Encoding type used by Amazon S3 to encode object key names in the XML response. If you specify encoding-type request parameter, Amazon S3 includes this element in the response, and returns encoded key name values in the following response elements:  KeyMarker, NextKeyMarker, Prefix, Key, and Delimiter.
    */
  var EncodingType: js.UndefOr[typings.awsSdk.s3Mod.EncodingType] = js.undefined
  
  /**
    * A flag that indicates whether Amazon S3 returned all of the results that satisfied the search criteria. If your results were truncated, you can make a follow-up paginated request using the NextKeyMarker and NextVersionIdMarker response parameters as a starting place in another request to return the rest of the results.
    */
  var IsTruncated: js.UndefOr[typings.awsSdk.s3Mod.IsTruncated] = js.undefined
  
  /**
    * Marks the last key returned in a truncated response.
    */
  var KeyMarker: js.UndefOr[typings.awsSdk.s3Mod.KeyMarker] = js.undefined
  
  /**
    * Specifies the maximum number of objects to return.
    */
  var MaxKeys: js.UndefOr[typings.awsSdk.s3Mod.MaxKeys] = js.undefined
  
  /**
    * The bucket name.
    */
  var Name: js.UndefOr[BucketName] = js.undefined
  
  /**
    * When the number of responses exceeds the value of MaxKeys, NextKeyMarker specifies the first key not returned that satisfies the search criteria. Use this value for the key-marker request parameter in a subsequent request.
    */
  var NextKeyMarker: js.UndefOr[typings.awsSdk.s3Mod.NextKeyMarker] = js.undefined
  
  /**
    * When the number of responses exceeds the value of MaxKeys, NextVersionIdMarker specifies the first object version not returned that satisfies the search criteria. Use this value for the version-id-marker request parameter in a subsequent request.
    */
  var NextVersionIdMarker: js.UndefOr[typings.awsSdk.s3Mod.NextVersionIdMarker] = js.undefined
  
  /**
    * Selects objects that start with the value supplied by this parameter.
    */
  var Prefix: js.UndefOr[typings.awsSdk.s3Mod.Prefix] = js.undefined
  
  /**
    * Marks the last version of the key returned in a truncated response.
    */
  var VersionIdMarker: js.UndefOr[typings.awsSdk.s3Mod.VersionIdMarker] = js.undefined
  
  /**
    * Container for version information.
    */
  var Versions: js.UndefOr[ObjectVersionList] = js.undefined
}
object ListObjectVersionsOutput {
  
  inline def apply(): ListObjectVersionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListObjectVersionsOutput]
  }
  
  extension [Self <: ListObjectVersionsOutput](x: Self) {
    
    inline def setCommonPrefixes(value: CommonPrefixList): Self = StObject.set(x, "CommonPrefixes", value.asInstanceOf[js.Any])
    
    inline def setCommonPrefixesUndefined: Self = StObject.set(x, "CommonPrefixes", js.undefined)
    
    inline def setCommonPrefixesVarargs(value: CommonPrefix*): Self = StObject.set(x, "CommonPrefixes", js.Array(value :_*))
    
    inline def setDeleteMarkers(value: DeleteMarkers): Self = StObject.set(x, "DeleteMarkers", value.asInstanceOf[js.Any])
    
    inline def setDeleteMarkersUndefined: Self = StObject.set(x, "DeleteMarkers", js.undefined)
    
    inline def setDeleteMarkersVarargs(value: DeleteMarkerEntry*): Self = StObject.set(x, "DeleteMarkers", js.Array(value :_*))
    
    inline def setDelimiter(value: Delimiter): Self = StObject.set(x, "Delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "Delimiter", js.undefined)
    
    inline def setEncodingType(value: EncodingType): Self = StObject.set(x, "EncodingType", value.asInstanceOf[js.Any])
    
    inline def setEncodingTypeUndefined: Self = StObject.set(x, "EncodingType", js.undefined)
    
    inline def setIsTruncated(value: IsTruncated): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    inline def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
    
    inline def setKeyMarker(value: KeyMarker): Self = StObject.set(x, "KeyMarker", value.asInstanceOf[js.Any])
    
    inline def setKeyMarkerUndefined: Self = StObject.set(x, "KeyMarker", js.undefined)
    
    inline def setMaxKeys(value: MaxKeys): Self = StObject.set(x, "MaxKeys", value.asInstanceOf[js.Any])
    
    inline def setMaxKeysUndefined: Self = StObject.set(x, "MaxKeys", js.undefined)
    
    inline def setName(value: BucketName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNextKeyMarker(value: NextKeyMarker): Self = StObject.set(x, "NextKeyMarker", value.asInstanceOf[js.Any])
    
    inline def setNextKeyMarkerUndefined: Self = StObject.set(x, "NextKeyMarker", js.undefined)
    
    inline def setNextVersionIdMarker(value: NextVersionIdMarker): Self = StObject.set(x, "NextVersionIdMarker", value.asInstanceOf[js.Any])
    
    inline def setNextVersionIdMarkerUndefined: Self = StObject.set(x, "NextVersionIdMarker", js.undefined)
    
    inline def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    inline def setVersionIdMarker(value: VersionIdMarker): Self = StObject.set(x, "VersionIdMarker", value.asInstanceOf[js.Any])
    
    inline def setVersionIdMarkerUndefined: Self = StObject.set(x, "VersionIdMarker", js.undefined)
    
    inline def setVersions(value: ObjectVersionList): Self = StObject.set(x, "Versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "Versions", js.undefined)
    
    inline def setVersionsVarargs(value: ObjectVersion*): Self = StObject.set(x, "Versions", js.Array(value :_*))
  }
}
