package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelPackageSummary extends js.Object {
  
  /**
    * A timestamp that shows when the model package was created.
    */
  var CreationTime: typings.awsSdk.sagemakerMod.CreationTime = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the model package.
    */
  var ModelPackageArn: typings.awsSdk.sagemakerMod.ModelPackageArn = js.native
  
  /**
    * A brief description of the model package.
    */
  var ModelPackageDescription: js.UndefOr[EntityDescription] = js.native
  
  /**
    * The name of the model package.
    */
  var ModelPackageName: EntityName = js.native
  
  /**
    * The overall status of the model package.
    */
  var ModelPackageStatus: typings.awsSdk.sagemakerMod.ModelPackageStatus = js.native
}
object ModelPackageSummary {
  
  @scala.inline
  def apply(
    CreationTime: CreationTime,
    ModelPackageArn: ModelPackageArn,
    ModelPackageName: EntityName,
    ModelPackageStatus: ModelPackageStatus
  ): ModelPackageSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ModelPackageArn = ModelPackageArn.asInstanceOf[js.Any], ModelPackageName = ModelPackageName.asInstanceOf[js.Any], ModelPackageStatus = ModelPackageStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelPackageSummary]
  }
  
  @scala.inline
  implicit class ModelPackageSummaryOps[Self <: ModelPackageSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreationTime(value: CreationTime): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelPackageArn(value: ModelPackageArn): Self = this.set("ModelPackageArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelPackageName(value: EntityName): Self = this.set("ModelPackageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelPackageStatus(value: ModelPackageStatus): Self = this.set("ModelPackageStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelPackageDescription(value: EntityDescription): Self = this.set("ModelPackageDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelPackageDescription: Self = this.set("ModelPackageDescription", js.undefined)
  }
}
