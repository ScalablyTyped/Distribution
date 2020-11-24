package typings.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3ResourceClassification extends js.Object {
  
  /**
    * The name of the S3 bucket that you want to associate with Amazon Macie Classic.
    */
  var bucketName: BucketName = js.native
  
  /**
    * The classification type that you want to specify for the resource associated with Amazon Macie Classic. 
    */
  var classificationType: ClassificationType = js.native
  
  /**
    * The prefix of the S3 bucket that you want to associate with Amazon Macie Classic.
    */
  var prefix: js.UndefOr[Prefix] = js.native
}
object S3ResourceClassification {
  
  @scala.inline
  def apply(bucketName: BucketName, classificationType: ClassificationType): S3ResourceClassification = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], classificationType = classificationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ResourceClassification]
  }
  
  @scala.inline
  implicit class S3ResourceClassificationOps[Self <: S3ResourceClassification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBucketName(value: BucketName): Self = this.set("bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassificationType(value: ClassificationType): Self = this.set("classificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: Prefix): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
}
