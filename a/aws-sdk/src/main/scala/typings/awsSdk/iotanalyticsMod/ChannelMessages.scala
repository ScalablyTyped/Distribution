package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelMessages extends StObject {
  
  /**
    * Specifies one or more keys that identify the Amazon Simple Storage Service (Amazon S3) objects that save your channel messages. You must use the full path for the key. Example path: channel/mychannel/__dt=2020-02-29 00:00:00/1582940490000_1582940520000_123456789012_mychannel_0_2118.0.json.gz 
    */
  var s3Paths: js.UndefOr[S3PathChannelMessages] = js.undefined
}
object ChannelMessages {
  
  inline def apply(): ChannelMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMessages]
  }
  
  extension [Self <: ChannelMessages](x: Self) {
    
    inline def setS3Paths(value: S3PathChannelMessages): Self = StObject.set(x, "s3Paths", value.asInstanceOf[js.Any])
    
    inline def setS3PathsUndefined: Self = StObject.set(x, "s3Paths", js.undefined)
    
    inline def setS3PathsVarargs(value: S3PathChannelMessage*): Self = StObject.set(x, "s3Paths", js.Array(value*))
  }
}
