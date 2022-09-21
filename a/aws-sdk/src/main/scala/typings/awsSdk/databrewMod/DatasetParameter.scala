package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetParameter extends StObject {
  
  /**
    * Optional boolean value that defines whether the captured value of this parameter should be used to create a new column in a dataset.
    */
  var CreateColumn: js.UndefOr[typings.awsSdk.databrewMod.CreateColumn] = js.undefined
  
  /**
    * Additional parameter options such as a format and a timezone. Required for datetime parameters.
    */
  var DatetimeOptions: js.UndefOr[typings.awsSdk.databrewMod.DatetimeOptions] = js.undefined
  
  /**
    * The optional filter expression structure to apply additional matching criteria to the parameter.
    */
  var Filter: js.UndefOr[FilterExpression] = js.undefined
  
  /**
    * The name of the parameter that is used in the dataset's Amazon S3 path.
    */
  var Name: PathParameterName
  
  /**
    * The type of the dataset parameter, can be one of a 'String', 'Number' or 'Datetime'.
    */
  var Type: ParameterType
}
object DatasetParameter {
  
  inline def apply(Name: PathParameterName, Type: ParameterType): DatasetParameter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetParameter]
  }
  
  extension [Self <: DatasetParameter](x: Self) {
    
    inline def setCreateColumn(value: CreateColumn): Self = StObject.set(x, "CreateColumn", value.asInstanceOf[js.Any])
    
    inline def setCreateColumnUndefined: Self = StObject.set(x, "CreateColumn", js.undefined)
    
    inline def setDatetimeOptions(value: DatetimeOptions): Self = StObject.set(x, "DatetimeOptions", value.asInstanceOf[js.Any])
    
    inline def setDatetimeOptionsUndefined: Self = StObject.set(x, "DatetimeOptions", js.undefined)
    
    inline def setFilter(value: FilterExpression): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setName(value: PathParameterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setType(value: ParameterType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
