package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisDataStream extends StObject {
  
  /**
    * ARN of the output Amazon Kinesis Data Streams stream.
    */
  var Arn: js.UndefOr[KinesisDataArn] = js.undefined
}
object KinesisDataStream {
  
  inline def apply(): KinesisDataStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinesisDataStream]
  }
  
  extension [Self <: KinesisDataStream](x: Self) {
    
    inline def setArn(value: KinesisDataArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
