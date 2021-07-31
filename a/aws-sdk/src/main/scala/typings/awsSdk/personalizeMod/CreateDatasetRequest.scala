package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatasetRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset group to add the dataset to.
    */
  var datasetGroupArn: Arn
  
  /**
    * The type of dataset. One of the following (case insensitive) values:   Interactions   Items   Users  
    */
  var datasetType: DatasetType
  
  /**
    * The name for the dataset.
    */
  var name: Name
  
  /**
    * The ARN of the schema to associate with the dataset. The schema defines the dataset fields.
    */
  var schemaArn: Arn
}
object CreateDatasetRequest {
  
  @scala.inline
  def apply(datasetGroupArn: Arn, datasetType: DatasetType, name: Name, schemaArn: Arn): CreateDatasetRequest = {
    val __obj = js.Dynamic.literal(datasetGroupArn = datasetGroupArn.asInstanceOf[js.Any], datasetType = datasetType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schemaArn = schemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetRequest]
  }
  
  @scala.inline
  implicit class CreateDatasetRequestMutableBuilder[Self <: CreateDatasetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetGroupArn(value: Arn): Self = StObject.set(x, "datasetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetType(value: DatasetType): Self = StObject.set(x, "datasetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaArn(value: Arn): Self = StObject.set(x, "schemaArn", value.asInstanceOf[js.Any])
  }
}
