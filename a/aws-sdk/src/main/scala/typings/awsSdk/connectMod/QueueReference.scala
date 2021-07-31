package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueueReference extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the queue.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier of the queue.
    */
  var Id: js.UndefOr[QueueId] = js.undefined
}
object QueueReference {
  
  @scala.inline
  def apply(): QueueReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueReference]
  }
  
  @scala.inline
  implicit class QueueReferenceMutableBuilder[Self <: QueueReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setId(value: QueueId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
