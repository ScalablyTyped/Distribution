package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationUpdate extends js.Object {
  
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
  implicit class ApplicationUpdateOps[Self <: ApplicationUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplicationCodeUpdate(value: ApplicationCode): Self = this.set("ApplicationCodeUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationCodeUpdate: Self = this.set("ApplicationCodeUpdate", js.undefined)
    
    @scala.inline
    def setCloudWatchLoggingOptionUpdatesVarargs(value: CloudWatchLoggingOptionUpdate*): Self = this.set("CloudWatchLoggingOptionUpdates", js.Array(value :_*))
    
    @scala.inline
    def setCloudWatchLoggingOptionUpdates(value: CloudWatchLoggingOptionUpdates): Self = this.set("CloudWatchLoggingOptionUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudWatchLoggingOptionUpdates: Self = this.set("CloudWatchLoggingOptionUpdates", js.undefined)
    
    @scala.inline
    def setInputUpdatesVarargs(value: InputUpdate*): Self = this.set("InputUpdates", js.Array(value :_*))
    
    @scala.inline
    def setInputUpdates(value: InputUpdates): Self = this.set("InputUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputUpdates: Self = this.set("InputUpdates", js.undefined)
    
    @scala.inline
    def setOutputUpdatesVarargs(value: OutputUpdate*): Self = this.set("OutputUpdates", js.Array(value :_*))
    
    @scala.inline
    def setOutputUpdates(value: OutputUpdates): Self = this.set("OutputUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputUpdates: Self = this.set("OutputUpdates", js.undefined)
    
    @scala.inline
    def setReferenceDataSourceUpdatesVarargs(value: ReferenceDataSourceUpdate*): Self = this.set("ReferenceDataSourceUpdates", js.Array(value :_*))
    
    @scala.inline
    def setReferenceDataSourceUpdates(value: ReferenceDataSourceUpdates): Self = this.set("ReferenceDataSourceUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceDataSourceUpdates: Self = this.set("ReferenceDataSourceUpdates", js.undefined)
  }
}
