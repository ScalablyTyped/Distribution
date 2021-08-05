package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisVideoStreamConfig extends StObject {
  
  /**
    * The encryption configuration.
    */
  var EncryptionConfig: typings.awsSdk.connectMod.EncryptionConfig
  
  /**
    * The prefix of the video stream.
    */
  var Prefix: typings.awsSdk.connectMod.Prefix
  
  /**
    * The number of hours data is retained in the stream. Kinesis Video Streams retains the data in a data store that is associated with the stream. The default value is 0, indicating that the stream does not persist data.
    */
  var RetentionPeriodHours: Hours
}
object KinesisVideoStreamConfig {
  
  inline def apply(EncryptionConfig: EncryptionConfig, Prefix: Prefix, RetentionPeriodHours: Hours): KinesisVideoStreamConfig = {
    val __obj = js.Dynamic.literal(EncryptionConfig = EncryptionConfig.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any], RetentionPeriodHours = RetentionPeriodHours.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisVideoStreamConfig]
  }
  
  extension [Self <: KinesisVideoStreamConfig](x: Self) {
    
    inline def setEncryptionConfig(value: EncryptionConfig): Self = StObject.set(x, "EncryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriodHours(value: Hours): Self = StObject.set(x, "RetentionPeriodHours", value.asInstanceOf[js.Any])
  }
}
