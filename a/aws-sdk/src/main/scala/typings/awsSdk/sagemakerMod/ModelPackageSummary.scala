package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelPackageSummary extends StObject {
  
  /**
    * A timestamp that shows when the model package was created.
    */
  var CreationTime: js.Date
  
  /**
    * The approval status of the model. This can be one of the following values.    APPROVED - The model is approved    REJECTED - The model is rejected.    PENDING_MANUAL_APPROVAL - The model is waiting for manual approval.  
    */
  var ModelApprovalStatus: js.UndefOr[typings.awsSdk.sagemakerMod.ModelApprovalStatus] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the model package.
    */
  var ModelPackageArn: typings.awsSdk.sagemakerMod.ModelPackageArn
  
  /**
    * A brief description of the model package.
    */
  var ModelPackageDescription: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * If the model package is a versioned model, the model group that the versioned model belongs to.
    */
  var ModelPackageGroupName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The name of the model package.
    */
  var ModelPackageName: EntityName
  
  /**
    * The overall status of the model package.
    */
  var ModelPackageStatus: typings.awsSdk.sagemakerMod.ModelPackageStatus
  
  /**
    * If the model package is a versioned model, the version of the model.
    */
  var ModelPackageVersion: js.UndefOr[typings.awsSdk.sagemakerMod.ModelPackageVersion] = js.undefined
}
object ModelPackageSummary {
  
  inline def apply(
    CreationTime: js.Date,
    ModelPackageArn: ModelPackageArn,
    ModelPackageName: EntityName,
    ModelPackageStatus: ModelPackageStatus
  ): ModelPackageSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ModelPackageArn = ModelPackageArn.asInstanceOf[js.Any], ModelPackageName = ModelPackageName.asInstanceOf[js.Any], ModelPackageStatus = ModelPackageStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelPackageSummary]
  }
  
  extension [Self <: ModelPackageSummary](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setModelApprovalStatus(value: ModelApprovalStatus): Self = StObject.set(x, "ModelApprovalStatus", value.asInstanceOf[js.Any])
    
    inline def setModelApprovalStatusUndefined: Self = StObject.set(x, "ModelApprovalStatus", js.undefined)
    
    inline def setModelPackageArn(value: ModelPackageArn): Self = StObject.set(x, "ModelPackageArn", value.asInstanceOf[js.Any])
    
    inline def setModelPackageDescription(value: EntityDescription): Self = StObject.set(x, "ModelPackageDescription", value.asInstanceOf[js.Any])
    
    inline def setModelPackageDescriptionUndefined: Self = StObject.set(x, "ModelPackageDescription", js.undefined)
    
    inline def setModelPackageGroupName(value: EntityName): Self = StObject.set(x, "ModelPackageGroupName", value.asInstanceOf[js.Any])
    
    inline def setModelPackageGroupNameUndefined: Self = StObject.set(x, "ModelPackageGroupName", js.undefined)
    
    inline def setModelPackageName(value: EntityName): Self = StObject.set(x, "ModelPackageName", value.asInstanceOf[js.Any])
    
    inline def setModelPackageStatus(value: ModelPackageStatus): Self = StObject.set(x, "ModelPackageStatus", value.asInstanceOf[js.Any])
    
    inline def setModelPackageVersion(value: ModelPackageVersion): Self = StObject.set(x, "ModelPackageVersion", value.asInstanceOf[js.Any])
    
    inline def setModelPackageVersionUndefined: Self = StObject.set(x, "ModelPackageVersion", js.undefined)
  }
}
