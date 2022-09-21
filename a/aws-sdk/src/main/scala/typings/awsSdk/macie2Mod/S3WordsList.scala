package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3WordsList extends StObject {
  
  /**
    * The full name of the S3 bucket that contains the object.
    */
  var bucketName: stringMin3Max255PatternAZaZ093255
  
  /**
    * The full name (key) of the object.
    */
  var objectKey: stringMin1Max1024PatternSS
}
object S3WordsList {
  
  inline def apply(bucketName: stringMin3Max255PatternAZaZ093255, objectKey: stringMin1Max1024PatternSS): S3WordsList = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], objectKey = objectKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3WordsList]
  }
  
  extension [Self <: S3WordsList](x: Self) {
    
    inline def setBucketName(value: stringMin3Max255PatternAZaZ093255): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setObjectKey(value: stringMin1Max1024PatternSS): Self = StObject.set(x, "objectKey", value.asInstanceOf[js.Any])
  }
}
