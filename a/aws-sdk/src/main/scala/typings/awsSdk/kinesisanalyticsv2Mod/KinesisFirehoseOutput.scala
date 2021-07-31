package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisFirehoseOutput extends StObject {
  
  /**
    * The ARN of the destination delivery stream to write to.
    */
  var ResourceARN: typings.awsSdk.kinesisanalyticsv2Mod.ResourceARN
}
object KinesisFirehoseOutput {
  
  @scala.inline
  def apply(ResourceARN: ResourceARN): KinesisFirehoseOutput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisFirehoseOutput]
  }
  
  @scala.inline
  implicit class KinesisFirehoseOutputMutableBuilder[Self <: KinesisFirehoseOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
  }
}
