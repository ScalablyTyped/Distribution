package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetVariableRequest extends StObject {
  
  /**
    * The list of variable names to get.
    */
  var names: NameList
}
object BatchGetVariableRequest {
  
  @scala.inline
  def apply(names: NameList): BatchGetVariableRequest = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetVariableRequest]
  }
  
  @scala.inline
  implicit class BatchGetVariableRequestMutableBuilder[Self <: BatchGetVariableRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNames(value: NameList): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
  }
}
