package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeModelPackageGroupOutput extends StObject {
  
  var CreatedBy: UserContext
  
  /**
    * The time that the model group was created.
    */
  var CreationTime: js.Date
  
  /**
    * The Amazon Resource Name (ARN) of the model group.
    */
  var ModelPackageGroupArn: typings.awsSdk.sagemakerMod.ModelPackageGroupArn
  
  /**
    * A description of the model group.
    */
  var ModelPackageGroupDescription: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * The name of the model group.
    */
  var ModelPackageGroupName: EntityName
  
  /**
    * The status of the model group.
    */
  var ModelPackageGroupStatus: typings.awsSdk.sagemakerMod.ModelPackageGroupStatus
}
object DescribeModelPackageGroupOutput {
  
  inline def apply(
    CreatedBy: UserContext,
    CreationTime: js.Date,
    ModelPackageGroupArn: ModelPackageGroupArn,
    ModelPackageGroupName: EntityName,
    ModelPackageGroupStatus: ModelPackageGroupStatus
  ): DescribeModelPackageGroupOutput = {
    val __obj = js.Dynamic.literal(CreatedBy = CreatedBy.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], ModelPackageGroupArn = ModelPackageGroupArn.asInstanceOf[js.Any], ModelPackageGroupName = ModelPackageGroupName.asInstanceOf[js.Any], ModelPackageGroupStatus = ModelPackageGroupStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeModelPackageGroupOutput]
  }
  
  extension [Self <: DescribeModelPackageGroupOutput](x: Self) {
    
    inline def setCreatedBy(value: UserContext): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setModelPackageGroupArn(value: ModelPackageGroupArn): Self = StObject.set(x, "ModelPackageGroupArn", value.asInstanceOf[js.Any])
    
    inline def setModelPackageGroupDescription(value: EntityDescription): Self = StObject.set(x, "ModelPackageGroupDescription", value.asInstanceOf[js.Any])
    
    inline def setModelPackageGroupDescriptionUndefined: Self = StObject.set(x, "ModelPackageGroupDescription", js.undefined)
    
    inline def setModelPackageGroupName(value: EntityName): Self = StObject.set(x, "ModelPackageGroupName", value.asInstanceOf[js.Any])
    
    inline def setModelPackageGroupStatus(value: ModelPackageGroupStatus): Self = StObject.set(x, "ModelPackageGroupStatus", value.asInstanceOf[js.Any])
  }
}
