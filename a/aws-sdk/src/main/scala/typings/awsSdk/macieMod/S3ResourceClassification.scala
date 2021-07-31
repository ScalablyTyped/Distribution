package typings.awsSdk.macieMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ResourceClassification extends StObject {
  
  /**
    * The name of the S3 bucket that you want to associate with Amazon Macie Classic.
    */
  var bucketName: BucketName
  
  /**
    * The classification type that you want to specify for the resource associated with Amazon Macie Classic. 
    */
  var classificationType: ClassificationType
  
  /**
    * The prefix of the S3 bucket that you want to associate with Amazon Macie Classic.
    */
  var prefix: js.UndefOr[Prefix] = js.undefined
}
object S3ResourceClassification {
  
  @scala.inline
  def apply(bucketName: BucketName, classificationType: ClassificationType): S3ResourceClassification = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], classificationType = classificationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ResourceClassification]
  }
  
  @scala.inline
  implicit class S3ResourceClassificationMutableBuilder[Self <: S3ResourceClassification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassificationType(value: ClassificationType): Self = StObject.set(x, "classificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: Prefix): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
