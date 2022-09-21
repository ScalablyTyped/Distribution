package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3OutputLocation extends StObject {
  
  /**
    * The name of the S3 bucket.
    */
  var OutputS3BucketName: js.UndefOr[S3BucketName] = js.undefined
  
  /**
    * The S3 bucket subfolder.
    */
  var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
  
  /**
    * The Amazon Web Services Region of the S3 bucket.
    */
  var OutputS3Region: js.UndefOr[S3Region] = js.undefined
}
object S3OutputLocation {
  
  inline def apply(): S3OutputLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3OutputLocation]
  }
  
  extension [Self <: S3OutputLocation](x: Self) {
    
    inline def setOutputS3BucketName(value: S3BucketName): Self = StObject.set(x, "OutputS3BucketName", value.asInstanceOf[js.Any])
    
    inline def setOutputS3BucketNameUndefined: Self = StObject.set(x, "OutputS3BucketName", js.undefined)
    
    inline def setOutputS3KeyPrefix(value: S3KeyPrefix): Self = StObject.set(x, "OutputS3KeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setOutputS3KeyPrefixUndefined: Self = StObject.set(x, "OutputS3KeyPrefix", js.undefined)
    
    inline def setOutputS3Region(value: S3Region): Self = StObject.set(x, "OutputS3Region", value.asInstanceOf[js.Any])
    
    inline def setOutputS3RegionUndefined: Self = StObject.set(x, "OutputS3Region", js.undefined)
  }
}
