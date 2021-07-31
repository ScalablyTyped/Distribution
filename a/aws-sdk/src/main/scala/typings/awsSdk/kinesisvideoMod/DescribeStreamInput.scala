package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStreamInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the stream.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * The name of the stream.
    */
  var StreamName: js.UndefOr[typings.awsSdk.kinesisvideoMod.StreamName] = js.undefined
}
object DescribeStreamInput {
  
  @scala.inline
  def apply(): DescribeStreamInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStreamInput]
  }
  
  @scala.inline
  implicit class DescribeStreamInputMutableBuilder[Self <: DescribeStreamInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStreamARN(value: ResourceARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
    
    @scala.inline
    def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
  }
}
