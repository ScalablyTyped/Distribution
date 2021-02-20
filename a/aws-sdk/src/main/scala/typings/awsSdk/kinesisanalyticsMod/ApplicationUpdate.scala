package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationUpdate extends StObject {
  
  /**
    * Describes application code updates.
    */
  var ApplicationCodeUpdate: js.UndefOr[ApplicationCode] = js.native
  
  /**
    * Describes application CloudWatch logging option updates.
    */
  var CloudWatchLoggingOptionUpdates: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.CloudWatchLoggingOptionUpdates] = js.native
  
  /**
    * Describes application input configuration updates.
    */
  var InputUpdates: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.InputUpdates] = js.native
  
  /**
    * Describes application output configuration updates.
    */
  var OutputUpdates: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.OutputUpdates] = js.native
  
  /**
    * Describes application reference data source updates.
    */
  var ReferenceDataSourceUpdates: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.ReferenceDataSourceUpdates] = js.native
}
object ApplicationUpdate {
  
  @scala.inline
  def apply(): ApplicationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationUpdate]
  }
  
  @scala.inline
  implicit class ApplicationUpdateMutableBuilder[Self <: ApplicationUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationCodeUpdate(value: ApplicationCode): Self = StObject.set(x, "ApplicationCodeUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationCodeUpdateUndefined: Self = StObject.set(x, "ApplicationCodeUpdate", js.undefined)
    
    @scala.inline
    def setCloudWatchLoggingOptionUpdates(value: CloudWatchLoggingOptionUpdates): Self = StObject.set(x, "CloudWatchLoggingOptionUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLoggingOptionUpdatesUndefined: Self = StObject.set(x, "CloudWatchLoggingOptionUpdates", js.undefined)
    
    @scala.inline
    def setCloudWatchLoggingOptionUpdatesVarargs(value: CloudWatchLoggingOptionUpdate*): Self = StObject.set(x, "CloudWatchLoggingOptionUpdates", js.Array(value :_*))
    
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
