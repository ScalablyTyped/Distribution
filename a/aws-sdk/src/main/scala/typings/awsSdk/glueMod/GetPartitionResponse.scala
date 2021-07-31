package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPartitionResponse extends StObject {
  
  /**
    * The requested information, in the form of a Partition object.
    */
  var Partition: js.UndefOr[typings.awsSdk.glueMod.Partition] = js.undefined
}
object GetPartitionResponse {
  
  @scala.inline
  def apply(): GetPartitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPartitionResponse]
  }
  
  @scala.inline
  implicit class GetPartitionResponseMutableBuilder[Self <: GetPartitionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPartition(value: Partition): Self = StObject.set(x, "Partition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionUndefined: Self = StObject.set(x, "Partition", js.undefined)
  }
}
