package typings.awsSdk.lookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDatasetRequest extends StObject {
  
  /**
    * The type of the dataset to describe. Specify train to describe the training dataset. Specify test to describe the test dataset. If you have a single dataset project, specify train 
    */
  var DatasetType: typings.awsSdk.lookoutvisionMod.DatasetType
  
  /**
    * The name of the project that contains the dataset that you want to describe.
    */
  var ProjectName: typings.awsSdk.lookoutvisionMod.ProjectName
}
object DescribeDatasetRequest {
  
  inline def apply(DatasetType: DatasetType, ProjectName: ProjectName): DescribeDatasetRequest = {
    val __obj = js.Dynamic.literal(DatasetType = DatasetType.asInstanceOf[js.Any], ProjectName = ProjectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDatasetRequest]
  }
  
  extension [Self <: DescribeDatasetRequest](x: Self) {
    
    inline def setDatasetType(value: DatasetType): Self = StObject.set(x, "DatasetType", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: ProjectName): Self = StObject.set(x, "ProjectName", value.asInstanceOf[js.Any])
  }
}
