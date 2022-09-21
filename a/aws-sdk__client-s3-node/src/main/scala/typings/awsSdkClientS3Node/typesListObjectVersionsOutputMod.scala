package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.url
import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Node.typesCommonPrefixMod.UnmarshalledCommonPrefix
import typings.awsSdkClientS3Node.typesDeleteMarkerEntryMod.UnmarshalledDeleteMarkerEntry
import typings.awsSdkClientS3Node.typesObjectVersionMod.UnmarshalledObjectVersion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListObjectVersionsOutputMod {
  
  trait ListObjectVersionsOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * _CommonPrefixList shape
      */
    var CommonPrefixes: js.UndefOr[js.Array[UnmarshalledCommonPrefix]] = js.undefined
    
    /**
      * _DeleteMarkers shape
      */
    var DeleteMarkers: js.UndefOr[js.Array[UnmarshalledDeleteMarkerEntry]] = js.undefined
    
    /**
      * _Delimiter shape
      */
    var Delimiter: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Encoding type used by Amazon S3 to encode object keys in the response.</p>
      */
    var EncodingType: js.UndefOr[url | String] = js.undefined
    
    /**
      * <p>A flag that indicates whether or not Amazon S3 returned all of the results that satisfied the search criteria. If your results were truncated, you can make a follow-up paginated request using the NextKeyMarker and NextVersionIdMarker response parameters as a starting place in another request to return the rest of the results.</p>
      */
    var IsTruncated: js.UndefOr[Boolean] = js.undefined
    
    /**
      * <p>Marks the last Key returned in a truncated response.</p>
      */
    var KeyMarker: js.UndefOr[String] = js.undefined
    
    /**
      * _MaxKeys shape
      */
    var MaxKeys: js.UndefOr[Double] = js.undefined
    
    /**
      * _BucketName shape
      */
    var Name: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Use this value for the key marker request parameter in a subsequent request.</p>
      */
    var NextKeyMarker: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Use this value for the next version id marker parameter in a subsequent request.</p>
      */
    var NextVersionIdMarker: js.UndefOr[String] = js.undefined
    
    /**
      * _Prefix shape
      */
    var Prefix: js.UndefOr[String] = js.undefined
    
    /**
      * _VersionIdMarker shape
      */
    var VersionIdMarker: js.UndefOr[String] = js.undefined
    
    /**
      * _ObjectVersionList shape
      */
    var Versions: js.UndefOr[js.Array[UnmarshalledObjectVersion]] = js.undefined
  }
  object ListObjectVersionsOutput {
    
    inline def apply($metadata: ResponseMetadata): ListObjectVersionsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListObjectVersionsOutput]
    }
    
    extension [Self <: ListObjectVersionsOutput](x: Self) {
      
      inline def setCommonPrefixes(value: js.Array[UnmarshalledCommonPrefix]): Self = StObject.set(x, "CommonPrefixes", value.asInstanceOf[js.Any])
      
      inline def setCommonPrefixesUndefined: Self = StObject.set(x, "CommonPrefixes", js.undefined)
      
      inline def setCommonPrefixesVarargs(value: UnmarshalledCommonPrefix*): Self = StObject.set(x, "CommonPrefixes", js.Array(value*))
      
      inline def setDeleteMarkers(value: js.Array[UnmarshalledDeleteMarkerEntry]): Self = StObject.set(x, "DeleteMarkers", value.asInstanceOf[js.Any])
      
      inline def setDeleteMarkersUndefined: Self = StObject.set(x, "DeleteMarkers", js.undefined)
      
      inline def setDeleteMarkersVarargs(value: UnmarshalledDeleteMarkerEntry*): Self = StObject.set(x, "DeleteMarkers", js.Array(value*))
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "Delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "Delimiter", js.undefined)
      
      inline def setEncodingType(value: url | String): Self = StObject.set(x, "EncodingType", value.asInstanceOf[js.Any])
      
      inline def setEncodingTypeUndefined: Self = StObject.set(x, "EncodingType", js.undefined)
      
      inline def setIsTruncated(value: Boolean): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
      
      inline def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
      
      inline def setKeyMarker(value: String): Self = StObject.set(x, "KeyMarker", value.asInstanceOf[js.Any])
      
      inline def setKeyMarkerUndefined: Self = StObject.set(x, "KeyMarker", js.undefined)
      
      inline def setMaxKeys(value: Double): Self = StObject.set(x, "MaxKeys", value.asInstanceOf[js.Any])
      
      inline def setMaxKeysUndefined: Self = StObject.set(x, "MaxKeys", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
      
      inline def setNextKeyMarker(value: String): Self = StObject.set(x, "NextKeyMarker", value.asInstanceOf[js.Any])
      
      inline def setNextKeyMarkerUndefined: Self = StObject.set(x, "NextKeyMarker", js.undefined)
      
      inline def setNextVersionIdMarker(value: String): Self = StObject.set(x, "NextVersionIdMarker", value.asInstanceOf[js.Any])
      
      inline def setNextVersionIdMarkerUndefined: Self = StObject.set(x, "NextVersionIdMarker", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
      
      inline def setVersionIdMarker(value: String): Self = StObject.set(x, "VersionIdMarker", value.asInstanceOf[js.Any])
      
      inline def setVersionIdMarkerUndefined: Self = StObject.set(x, "VersionIdMarker", js.undefined)
      
      inline def setVersions(value: js.Array[UnmarshalledObjectVersion]): Self = StObject.set(x, "Versions", value.asInstanceOf[js.Any])
      
      inline def setVersionsUndefined: Self = StObject.set(x, "Versions", js.undefined)
      
      inline def setVersionsVarargs(value: UnmarshalledObjectVersion*): Self = StObject.set(x, "Versions", js.Array(value*))
    }
  }
}
