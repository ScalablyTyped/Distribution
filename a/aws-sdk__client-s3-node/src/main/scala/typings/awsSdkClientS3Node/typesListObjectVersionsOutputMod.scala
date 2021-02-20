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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListObjectVersionsOutputMod {
  
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
    implicit class ListObjectVersionsOutputMutableBuilder[Self <: ListObjectVersionsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommonPrefixes(value: js.Array[UnmarshalledCommonPrefix]): Self = StObject.set(x, "CommonPrefixes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommonPrefixesUndefined: Self = StObject.set(x, "CommonPrefixes", js.undefined)
      
      @scala.inline
      def setCommonPrefixesVarargs(value: UnmarshalledCommonPrefix*): Self = StObject.set(x, "CommonPrefixes", js.Array(value :_*))
      
      @scala.inline
      def setDeleteMarkers(value: js.Array[UnmarshalledDeleteMarkerEntry]): Self = StObject.set(x, "DeleteMarkers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteMarkersUndefined: Self = StObject.set(x, "DeleteMarkers", js.undefined)
      
      @scala.inline
      def setDeleteMarkersVarargs(value: UnmarshalledDeleteMarkerEntry*): Self = StObject.set(x, "DeleteMarkers", js.Array(value :_*))
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "Delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "Delimiter", js.undefined)
      
      @scala.inline
      def setEncodingType(value: url | String): Self = StObject.set(x, "EncodingType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingTypeUndefined: Self = StObject.set(x, "EncodingType", js.undefined)
      
      @scala.inline
      def setIsTruncated(value: Boolean): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
      
      @scala.inline
      def setKeyMarker(value: String): Self = StObject.set(x, "KeyMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyMarkerUndefined: Self = StObject.set(x, "KeyMarker", js.undefined)
      
      @scala.inline
      def setMaxKeys(value: Double): Self = StObject.set(x, "MaxKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxKeysUndefined: Self = StObject.set(x, "MaxKeys", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
      
      @scala.inline
      def setNextKeyMarker(value: String): Self = StObject.set(x, "NextKeyMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextKeyMarkerUndefined: Self = StObject.set(x, "NextKeyMarker", js.undefined)
      
      @scala.inline
      def setNextVersionIdMarker(value: String): Self = StObject.set(x, "NextVersionIdMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextVersionIdMarkerUndefined: Self = StObject.set(x, "NextVersionIdMarker", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
      
      @scala.inline
      def setVersionIdMarker(value: String): Self = StObject.set(x, "VersionIdMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionIdMarkerUndefined: Self = StObject.set(x, "VersionIdMarker", js.undefined)
      
      @scala.inline
      def setVersions(value: js.Array[UnmarshalledObjectVersion]): Self = StObject.set(x, "Versions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionsUndefined: Self = StObject.set(x, "Versions", js.undefined)
      
      @scala.inline
      def setVersionsVarargs(value: UnmarshalledObjectVersion*): Self = StObject.set(x, "Versions", js.Array(value :_*))
    }
  }
}
