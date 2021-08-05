package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Disabled
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Enabled
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Suspended
import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketVersioningOutputMod {
  
  trait GetBucketVersioningOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * <p>Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is only returned if the bucket has been configured with MFA delete. If the bucket has never been so configured, this element is not returned.</p>
      */
    var MFADelete: js.UndefOr[Enabled | Disabled | String] = js.undefined
    
    /**
      * <p>The versioning state of the bucket.</p>
      */
    var Status: js.UndefOr[Enabled | Suspended | String] = js.undefined
  }
  object GetBucketVersioningOutput {
    
    inline def apply($metadata: ResponseMetadata): GetBucketVersioningOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketVersioningOutput]
    }
    
    extension [Self <: GetBucketVersioningOutput](x: Self) {
      
      inline def setMFADelete(value: Enabled | Disabled | String): Self = StObject.set(x, "MFADelete", value.asInstanceOf[js.Any])
      
      inline def setMFADeleteUndefined: Self = StObject.set(x, "MFADelete", js.undefined)
      
      inline def setStatus(value: Enabled | Suspended | String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    }
  }
}
