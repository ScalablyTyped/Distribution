package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceStorageConfig extends StObject {
  
  /**
    * The existing association identifier that uniquely identifies the resource type and storage config for the given instance ID.
    */
  var AssociationId: js.UndefOr[typings.awsSdk.connectMod.AssociationId] = js.undefined
  
  /**
    * The configuration of the Kinesis Firehose delivery stream.
    */
  var KinesisFirehoseConfig: js.UndefOr[typings.awsSdk.connectMod.KinesisFirehoseConfig] = js.undefined
  
  /**
    * The configuration of the Kinesis data stream.
    */
  var KinesisStreamConfig: js.UndefOr[typings.awsSdk.connectMod.KinesisStreamConfig] = js.undefined
  
  /**
    * The configuration of the Kinesis video stream.
    */
  var KinesisVideoStreamConfig: js.UndefOr[typings.awsSdk.connectMod.KinesisVideoStreamConfig] = js.undefined
  
  /**
    * The S3 configuration.
    */
  var S3Config: js.UndefOr[typings.awsSdk.connectMod.S3Config] = js.undefined
  
  /**
    * A valid storage type.
    */
  var StorageType: typings.awsSdk.connectMod.StorageType
}
object InstanceStorageConfig {
  
  inline def apply(StorageType: StorageType): InstanceStorageConfig = {
    val __obj = js.Dynamic.literal(StorageType = StorageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceStorageConfig]
  }
  
  extension [Self <: InstanceStorageConfig](x: Self) {
    
    inline def setAssociationId(value: AssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    inline def setKinesisFirehoseConfig(value: KinesisFirehoseConfig): Self = StObject.set(x, "KinesisFirehoseConfig", value.asInstanceOf[js.Any])
    
    inline def setKinesisFirehoseConfigUndefined: Self = StObject.set(x, "KinesisFirehoseConfig", js.undefined)
    
    inline def setKinesisStreamConfig(value: KinesisStreamConfig): Self = StObject.set(x, "KinesisStreamConfig", value.asInstanceOf[js.Any])
    
    inline def setKinesisStreamConfigUndefined: Self = StObject.set(x, "KinesisStreamConfig", js.undefined)
    
    inline def setKinesisVideoStreamConfig(value: KinesisVideoStreamConfig): Self = StObject.set(x, "KinesisVideoStreamConfig", value.asInstanceOf[js.Any])
    
    inline def setKinesisVideoStreamConfigUndefined: Self = StObject.set(x, "KinesisVideoStreamConfig", js.undefined)
    
    inline def setS3Config(value: S3Config): Self = StObject.set(x, "S3Config", value.asInstanceOf[js.Any])
    
    inline def setS3ConfigUndefined: Self = StObject.set(x, "S3Config", js.undefined)
    
    inline def setStorageType(value: StorageType): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
  }
}
