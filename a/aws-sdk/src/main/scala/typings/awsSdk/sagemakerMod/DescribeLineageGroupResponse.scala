package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLineageGroupResponse extends StObject {
  
  var CreatedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * The creation time of lineage group.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the lineage group.
    */
  var Description: js.UndefOr[ExperimentDescription] = js.undefined
  
  /**
    * The display name of the lineage group.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.undefined
  
  var LastModifiedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * The last modified time of the lineage group.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the lineage group.
    */
  var LineageGroupArn: js.UndefOr[typings.awsSdk.sagemakerMod.LineageGroupArn] = js.undefined
  
  /**
    * The name of the lineage group.
    */
  var LineageGroupName: js.UndefOr[ExperimentEntityName] = js.undefined
}
object DescribeLineageGroupResponse {
  
  inline def apply(): DescribeLineageGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLineageGroupResponse]
  }
  
  extension [Self <: DescribeLineageGroupResponse](x: Self) {
    
    inline def setCreatedBy(value: UserContext): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDescription(value: ExperimentDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisplayName(value: ExperimentEntityName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setLastModifiedBy(value: UserContext): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setLineageGroupArn(value: LineageGroupArn): Self = StObject.set(x, "LineageGroupArn", value.asInstanceOf[js.Any])
    
    inline def setLineageGroupArnUndefined: Self = StObject.set(x, "LineageGroupArn", js.undefined)
    
    inline def setLineageGroupName(value: ExperimentEntityName): Self = StObject.set(x, "LineageGroupName", value.asInstanceOf[js.Any])
    
    inline def setLineageGroupNameUndefined: Self = StObject.set(x, "LineageGroupName", js.undefined)
  }
}
