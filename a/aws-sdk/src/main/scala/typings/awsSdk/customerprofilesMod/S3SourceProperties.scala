package typings.awsSdk.customerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3SourceProperties extends StObject {
  
  /**
    * The Amazon S3 bucket name where the source files are stored.
    */
  var BucketName: typings.awsSdk.customerprofilesMod.BucketName
  
  /**
    * The object key for the Amazon S3 bucket in which the source files are stored.
    */
  var BucketPrefix: js.UndefOr[typings.awsSdk.customerprofilesMod.BucketPrefix] = js.undefined
}
object S3SourceProperties {
  
  inline def apply(BucketName: BucketName): S3SourceProperties = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3SourceProperties]
  }
  
  extension [Self <: S3SourceProperties](x: Self) {
    
    inline def setBucketName(value: BucketName): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketPrefix(value: BucketPrefix): Self = StObject.set(x, "BucketPrefix", value.asInstanceOf[js.Any])
    
    inline def setBucketPrefixUndefined: Self = StObject.set(x, "BucketPrefix", js.undefined)
  }
}
