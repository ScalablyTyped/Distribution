package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceStorageConfig extends js.Object {
  
  /**
    * The existing association identifier that uniquely identifies the resource type and storage config for the given instance ID.
    */
  var AssociationId: js.UndefOr[typings.awsSdk.connectMod.AssociationId] = js.native
  
  /**
    * The configuration of the Kinesis Firehose delivery stream.
    */
  var KinesisFirehoseConfig: js.UndefOr[typings.awsSdk.connectMod.KinesisFirehoseConfig] = js.native
  
  /**
    * The configuration of the Kinesis data stream.
    */
  var KinesisStreamConfig: js.UndefOr[typings.awsSdk.connectMod.KinesisStreamConfig] = js.native
  
  /**
    * The configuration of the Kinesis video stream.
    */
  var KinesisVideoStreamConfig: js.UndefOr[typings.awsSdk.connectMod.KinesisVideoStreamConfig] = js.native
  
  /**
    * The S3 configuration.
    */
  var S3Config: js.UndefOr[typings.awsSdk.connectMod.S3Config] = js.native
  
  /**
    * A valid storage type.
    */
  var StorageType: typings.awsSdk.connectMod.StorageType = js.native
}
object InstanceStorageConfig {
  
  @scala.inline
  def apply(StorageType: StorageType): InstanceStorageConfig = {
    val __obj = js.Dynamic.literal(StorageType = StorageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceStorageConfig]
  }
  
  @scala.inline
  implicit class InstanceStorageConfigOps[Self <: InstanceStorageConfig] (val x: Self) extends AnyVal {
    
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
    def setStorageType(value: StorageType): Self = this.set("StorageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationId(value: AssociationId): Self = this.set("AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociationId: Self = this.set("AssociationId", js.undefined)
    
    @scala.inline
    def setKinesisFirehoseConfig(value: KinesisFirehoseConfig): Self = this.set("KinesisFirehoseConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisFirehoseConfig: Self = this.set("KinesisFirehoseConfig", js.undefined)
    
    @scala.inline
    def setKinesisStreamConfig(value: KinesisStreamConfig): Self = this.set("KinesisStreamConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisStreamConfig: Self = this.set("KinesisStreamConfig", js.undefined)
    
    @scala.inline
    def setKinesisVideoStreamConfig(value: KinesisVideoStreamConfig): Self = this.set("KinesisVideoStreamConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisVideoStreamConfig: Self = this.set("KinesisVideoStreamConfig", js.undefined)
    
    @scala.inline
    def setS3Config(value: S3Config): Self = this.set("S3Config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Config: Self = this.set("S3Config", js.undefined)
  }
}
