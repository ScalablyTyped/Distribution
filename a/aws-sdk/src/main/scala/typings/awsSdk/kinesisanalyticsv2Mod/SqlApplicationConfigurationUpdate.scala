package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlApplicationConfigurationUpdate extends StObject {
  
  /**
    * The array of InputUpdate objects describing the new input streams used by the application.
    */
  var InputUpdates: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.InputUpdates] = js.undefined
  
  /**
    * The array of OutputUpdate objects describing the new destination streams used by the application.
    */
  var OutputUpdates: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.OutputUpdates] = js.undefined
  
  /**
    * The array of ReferenceDataSourceUpdate objects describing the new reference data sources used by the application.
    */
  var ReferenceDataSourceUpdates: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ReferenceDataSourceUpdates] = js.undefined
}
object SqlApplicationConfigurationUpdate {
  
  inline def apply(): SqlApplicationConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlApplicationConfigurationUpdate]
  }
  
  extension [Self <: SqlApplicationConfigurationUpdate](x: Self) {
    
    inline def setInputUpdates(value: InputUpdates): Self = StObject.set(x, "InputUpdates", value.asInstanceOf[js.Any])
    
    inline def setInputUpdatesUndefined: Self = StObject.set(x, "InputUpdates", js.undefined)
    
    inline def setInputUpdatesVarargs(value: InputUpdate*): Self = StObject.set(x, "InputUpdates", js.Array(value :_*))
    
    inline def setOutputUpdates(value: OutputUpdates): Self = StObject.set(x, "OutputUpdates", value.asInstanceOf[js.Any])
    
    inline def setOutputUpdatesUndefined: Self = StObject.set(x, "OutputUpdates", js.undefined)
    
    inline def setOutputUpdatesVarargs(value: OutputUpdate*): Self = StObject.set(x, "OutputUpdates", js.Array(value :_*))
    
    inline def setReferenceDataSourceUpdates(value: ReferenceDataSourceUpdates): Self = StObject.set(x, "ReferenceDataSourceUpdates", value.asInstanceOf[js.Any])
    
    inline def setReferenceDataSourceUpdatesUndefined: Self = StObject.set(x, "ReferenceDataSourceUpdates", js.undefined)
    
    inline def setReferenceDataSourceUpdatesVarargs(value: ReferenceDataSourceUpdate*): Self = StObject.set(x, "ReferenceDataSourceUpdates", js.Array(value :_*))
  }
}
