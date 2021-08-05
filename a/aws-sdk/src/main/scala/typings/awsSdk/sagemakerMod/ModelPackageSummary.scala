package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelPackageSummary extends StObject {
  
  /**
    * A timestamp that shows when the model package was created.
    */
  var CreationTime: typings.awsSdk.sagemakerMod.CreationTime
  
  /**
    * The Amazon Resource Name (ARN) of the model package.
    */
  var ModelPackageArn: typings.awsSdk.sagemakerMod.ModelPackageArn
  
  /**
    * A brief description of the model package.
    */
  var ModelPackageDescription: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * The name of the model package.
    */
  var ModelPackageName: EntityName
  
  /**
    * The overall status of the model package.
    */
  var ModelPackageStatus: typings.awsSdk.sagemakerMod.ModelPackageStatus
}
object ModelPackageSummary {
  
  inline def apply(
    CreationTime: CreationTime,
    ModelPackageArn: ModelPackageArn,
    ModelPackageName: EntityName,
    ModelPackageStatus: ModelPackageStatus
  ): ModelPackageSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ModelPackageArn = ModelPackageArn.asInstanceOf[js.Any], ModelPackageName = ModelPackageName.asInstanceOf[js.Any], ModelPackageStatus = ModelPackageStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelPackageSummary]
  }
  
  extension [Self <: ModelPackageSummary](x: Self) {
    
    inline def setCreationTime(value: CreationTime): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setModelPackageArn(value: ModelPackageArn): Self = StObject.set(x, "ModelPackageArn", value.asInstanceOf[js.Any])
    
    inline def setModelPackageDescription(value: EntityDescription): Self = StObject.set(x, "ModelPackageDescription", value.asInstanceOf[js.Any])
    
    inline def setModelPackageDescriptionUndefined: Self = StObject.set(x, "ModelPackageDescription", js.undefined)
    
    inline def setModelPackageName(value: EntityName): Self = StObject.set(x, "ModelPackageName", value.asInstanceOf[js.Any])
    
    inline def setModelPackageStatus(value: ModelPackageStatus): Self = StObject.set(x, "ModelPackageStatus", value.asInstanceOf[js.Any])
  }
}
