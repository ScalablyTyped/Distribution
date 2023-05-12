package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataModelConfiguration extends StObject {
  
  /**
    * 
    */
  var DataModel: js.UndefOr[typings.awsSdk.clientsTimestreamwriteMod.DataModel] = js.undefined
  
  /**
    * 
    */
  var DataModelS3Configuration: js.UndefOr[typings.awsSdk.clientsTimestreamwriteMod.DataModelS3Configuration] = js.undefined
}
object DataModelConfiguration {
  
  inline def apply(): DataModelConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataModelConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataModelConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDataModel(value: DataModel): Self = StObject.set(x, "DataModel", value.asInstanceOf[js.Any])
    
    inline def setDataModelS3Configuration(value: DataModelS3Configuration): Self = StObject.set(x, "DataModelS3Configuration", value.asInstanceOf[js.Any])
    
    inline def setDataModelS3ConfigurationUndefined: Self = StObject.set(x, "DataModelS3Configuration", js.undefined)
    
    inline def setDataModelUndefined: Self = StObject.set(x, "DataModel", js.undefined)
  }
}
