package typings.awsSdk.macieMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassificationType extends StObject {
  
  /**
    * A continuous classification of the objects that are added to a specified S3 bucket. Amazon Macie Classic begins performing continuous classification after a bucket is successfully associated with Amazon Macie Classic. 
    */
  var continuous: S3ContinuousClassificationType = js.native
  
  /**
    * A one-time classification of all of the existing objects in a specified S3 bucket. 
    */
  var oneTime: S3OneTimeClassificationType = js.native
}
object ClassificationType {
  
  @scala.inline
  def apply(continuous: S3ContinuousClassificationType, oneTime: S3OneTimeClassificationType): ClassificationType = {
    val __obj = js.Dynamic.literal(continuous = continuous.asInstanceOf[js.Any], oneTime = oneTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassificationType]
  }
  
  @scala.inline
  implicit class ClassificationTypeMutableBuilder[Self <: ClassificationType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContinuous(value: S3ContinuousClassificationType): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneTime(value: S3OneTimeClassificationType): Self = StObject.set(x, "oneTime", value.asInstanceOf[js.Any])
  }
}
