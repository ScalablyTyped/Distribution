package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitoringOutputConfig extends js.Object {
  
  /**
    * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest using Amazon S3 server-side encryption.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.sagemakerMod.KmsKeyId] = js.native
  
  /**
    * Monitoring outputs for monitoring jobs. This is where the output of the periodic monitoring jobs is uploaded.
    */
  var MonitoringOutputs: typings.awsSdk.sagemakerMod.MonitoringOutputs = js.native
}
object MonitoringOutputConfig {
  
  @scala.inline
  def apply(MonitoringOutputs: MonitoringOutputs): MonitoringOutputConfig = {
    val __obj = js.Dynamic.literal(MonitoringOutputs = MonitoringOutputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringOutputConfig]
  }
  
  @scala.inline
  implicit class MonitoringOutputConfigOps[Self <: MonitoringOutputConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMonitoringOutputsVarargs(value: MonitoringOutput*): Self = this.set("MonitoringOutputs", js.Array(value :_*))
    
    @scala.inline
    def setMonitoringOutputs(value: MonitoringOutputs): Self = this.set("MonitoringOutputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
  }
}
