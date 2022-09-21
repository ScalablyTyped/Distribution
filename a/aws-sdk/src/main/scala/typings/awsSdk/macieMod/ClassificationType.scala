package typings.awsSdk.macieMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassificationType extends StObject {
  
  /**
    * (Discontinued) A continuous classification of the objects that are added to a specified S3 bucket. Amazon Macie Classic begins performing continuous classification after a bucket is successfully associated with Macie Classic.
    */
  var continuous: S3ContinuousClassificationType
  
  /**
    * (Discontinued) A one-time classification of all of the existing objects in a specified S3 bucket. 
    */
  var oneTime: S3OneTimeClassificationType
}
object ClassificationType {
  
  inline def apply(continuous: S3ContinuousClassificationType, oneTime: S3OneTimeClassificationType): ClassificationType = {
    val __obj = js.Dynamic.literal(continuous = continuous.asInstanceOf[js.Any], oneTime = oneTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassificationType]
  }
  
  extension [Self <: ClassificationType](x: Self) {
    
    inline def setContinuous(value: S3ContinuousClassificationType): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
    
    inline def setOneTime(value: S3OneTimeClassificationType): Self = StObject.set(x, "oneTime", value.asInstanceOf[js.Any])
  }
}
