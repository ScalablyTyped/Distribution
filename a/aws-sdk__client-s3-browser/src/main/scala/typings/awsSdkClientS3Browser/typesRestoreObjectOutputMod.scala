package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.requester_
import typings.awsSdkClientS3Browser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRestoreObjectOutputMod {
  
  trait RestoreObjectOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * <p>If present, indicates that the requester was successfully charged for the request.</p>
      */
    var RequestCharged: js.UndefOr[requester_ | String] = js.undefined
    
    /**
      * <p>Indicates the path in the provided S3 output location where Select results will be restored to.</p>
      */
    var RestoreOutputPath: js.UndefOr[String] = js.undefined
  }
  object RestoreObjectOutput {
    
    inline def apply($metadata: ResponseMetadata): RestoreObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestoreObjectOutput]
    }
    
    extension [Self <: RestoreObjectOutput](x: Self) {
      
      inline def setRequestCharged(value: requester_ | String): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
      
      inline def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
      
      inline def setRestoreOutputPath(value: String): Self = StObject.set(x, "RestoreOutputPath", value.asInstanceOf[js.Any])
      
      inline def setRestoreOutputPathUndefined: Self = StObject.set(x, "RestoreOutputPath", js.undefined)
    }
  }
}
