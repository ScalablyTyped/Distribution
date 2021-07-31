package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDataSourceFromS3Output extends StObject {
  
  /**
    * A user-supplied ID that uniquely identifies the DataSource. This value should be identical to the value of the DataSourceID in the request. 
    */
  var DataSourceId: js.UndefOr[EntityId] = js.undefined
}
object CreateDataSourceFromS3Output {
  
  @scala.inline
  def apply(): CreateDataSourceFromS3Output = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDataSourceFromS3Output]
  }
  
  @scala.inline
  implicit class CreateDataSourceFromS3OutputMutableBuilder[Self <: CreateDataSourceFromS3Output] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSourceId(value: EntityId): Self = StObject.set(x, "DataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceIdUndefined: Self = StObject.set(x, "DataSourceId", js.undefined)
  }
}
