package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetTriggersRequest extends StObject {
  
  /**
    * A list of trigger names, which may be the names returned from the ListTriggers operation.
    */
  var TriggerNames: TriggerNameList = js.native
}
object BatchGetTriggersRequest {
  
  @scala.inline
  def apply(TriggerNames: TriggerNameList): BatchGetTriggersRequest = {
    val __obj = js.Dynamic.literal(TriggerNames = TriggerNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetTriggersRequest]
  }
  
  @scala.inline
  implicit class BatchGetTriggersRequestMutableBuilder[Self <: BatchGetTriggersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTriggerNames(value: TriggerNameList): Self = StObject.set(x, "TriggerNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerNamesVarargs(value: NameString*): Self = StObject.set(x, "TriggerNames", js.Array(value :_*))
  }
}
