package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfileConfiguration extends StObject {
  
  /**
    * List of configurations for column evaluations. ColumnStatisticsConfigurations are used to select evaluations and override parameters of evaluations for particular columns. When ColumnStatisticsConfigurations is undefined, the profile job will profile all supported columns and run all supported evaluations. 
    */
  var ColumnStatisticsConfigurations: js.UndefOr[ColumnStatisticsConfigurationList] = js.undefined
  
  /**
    * Configuration for inter-column evaluations. Configuration can be used to select evaluations and override parameters of evaluations. When configuration is undefined, the profile job will run all supported inter-column evaluations. 
    */
  var DatasetStatisticsConfiguration: js.UndefOr[StatisticsConfiguration] = js.undefined
  
  /**
    * Configuration of entity detection for a profile job. When undefined, entity detection is disabled.
    */
  var EntityDetectorConfiguration: js.UndefOr[typings.awsSdk.databrewMod.EntityDetectorConfiguration] = js.undefined
  
  /**
    * List of column selectors. ProfileColumns can be used to select columns from the dataset. When ProfileColumns is undefined, the profile job will profile all supported columns. 
    */
  var ProfileColumns: js.UndefOr[ColumnSelectorList] = js.undefined
}
object ProfileConfiguration {
  
  inline def apply(): ProfileConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfileConfiguration]
  }
  
  extension [Self <: ProfileConfiguration](x: Self) {
    
    inline def setColumnStatisticsConfigurations(value: ColumnStatisticsConfigurationList): Self = StObject.set(x, "ColumnStatisticsConfigurations", value.asInstanceOf[js.Any])
    
    inline def setColumnStatisticsConfigurationsUndefined: Self = StObject.set(x, "ColumnStatisticsConfigurations", js.undefined)
    
    inline def setColumnStatisticsConfigurationsVarargs(value: ColumnStatisticsConfiguration*): Self = StObject.set(x, "ColumnStatisticsConfigurations", js.Array(value*))
    
    inline def setDatasetStatisticsConfiguration(value: StatisticsConfiguration): Self = StObject.set(x, "DatasetStatisticsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDatasetStatisticsConfigurationUndefined: Self = StObject.set(x, "DatasetStatisticsConfiguration", js.undefined)
    
    inline def setEntityDetectorConfiguration(value: EntityDetectorConfiguration): Self = StObject.set(x, "EntityDetectorConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEntityDetectorConfigurationUndefined: Self = StObject.set(x, "EntityDetectorConfiguration", js.undefined)
    
    inline def setProfileColumns(value: ColumnSelectorList): Self = StObject.set(x, "ProfileColumns", value.asInstanceOf[js.Any])
    
    inline def setProfileColumnsUndefined: Self = StObject.set(x, "ProfileColumns", js.undefined)
    
    inline def setProfileColumnsVarargs(value: ColumnSelector*): Self = StObject.set(x, "ProfileColumns", js.Array(value*))
  }
}
