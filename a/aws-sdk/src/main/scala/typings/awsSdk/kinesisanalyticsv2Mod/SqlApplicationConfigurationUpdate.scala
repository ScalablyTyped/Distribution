package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlApplicationConfigurationUpdate extends StObject {
  
  /**
    * The array of InputUpdate objects describing the new input streams used by the application.
    */
  var InputUpdates: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.InputUpdates] = js.native
  
  /**
    * The array of OutputUpdate objects describing the new destination streams used by the application.
    */
  var OutputUpdates: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.OutputUpdates] = js.native
  
  /**
    * The array of ReferenceDataSourceUpdate objects describing the new reference data sources used by the application.
    */
  var ReferenceDataSourceUpdates: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ReferenceDataSourceUpdates] = js.native
}
object SqlApplicationConfigurationUpdate {
  
  @scala.inline
  def apply(): SqlApplicationConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlApplicationConfigurationUpdate]
  }
  
  @scala.inline
  implicit class SqlApplicationConfigurationUpdateMutableBuilder[Self <: SqlApplicationConfigurationUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputUpdates(value: InputUpdates): Self = StObject.set(x, "InputUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUpdatesUndefined: Self = StObject.set(x, "InputUpdates", js.undefined)
    
    @scala.inline
    def setInputUpdatesVarargs(value: InputUpdate*): Self = StObject.set(x, "InputUpdates", js.Array(value :_*))
    
    @scala.inline
    def setOutputUpdates(value: OutputUpdates): Self = StObject.set(x, "OutputUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUpdatesUndefined: Self = StObject.set(x, "OutputUpdates", js.undefined)
    
    @scala.inline
    def setOutputUpdatesVarargs(value: OutputUpdate*): Self = StObject.set(x, "OutputUpdates", js.Array(value :_*))
    
    @scala.inline
    def setReferenceDataSourceUpdates(value: ReferenceDataSourceUpdates): Self = StObject.set(x, "ReferenceDataSourceUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceDataSourceUpdatesUndefined: Self = StObject.set(x, "ReferenceDataSourceUpdates", js.undefined)
    
    @scala.inline
    def setReferenceDataSourceUpdatesVarargs(value: ReferenceDataSourceUpdate*): Self = StObject.set(x, "ReferenceDataSourceUpdates", js.Array(value :_*))
  }
}
