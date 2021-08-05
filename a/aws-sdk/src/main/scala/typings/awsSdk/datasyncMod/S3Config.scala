package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Config extends StObject {
  
  /**
    * The Amazon S3 bucket to access. This bucket is used as a parameter in the CreateLocationS3 operation. 
    */
  var BucketAccessRoleArn: IamRoleArn
}
object S3Config {
  
  inline def apply(BucketAccessRoleArn: IamRoleArn): S3Config = {
    val __obj = js.Dynamic.literal(BucketAccessRoleArn = BucketAccessRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Config]
  }
  
  extension [Self <: S3Config](x: Self) {
    
    inline def setBucketAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "BucketAccessRoleArn", value.asInstanceOf[js.Any])
  }
}
