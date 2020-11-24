package typings.cassandraDriver.concurrentMod.concurrent

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultSetGroup extends js.Object {
  
  var errors: js.Array[Error] = js.native
  
  var resultItems: js.Array[_] = js.native
  
  var totalExecuted: Double = js.native
}
object ResultSetGroup {
  
  @scala.inline
  def apply(errors: js.Array[Error], resultItems: js.Array[_], totalExecuted: Double): ResultSetGroup = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], resultItems = resultItems.asInstanceOf[js.Any], totalExecuted = totalExecuted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSetGroup]
  }
  
  @scala.inline
  implicit class ResultSetGroupOps[Self <: ResultSetGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrorsVarargs(value: Error*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[Error]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultItemsVarargs(value: js.Any*): Self = this.set("resultItems", js.Array(value :_*))
    
    @scala.inline
    def setResultItems(value: js.Array[_]): Self = this.set("resultItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalExecuted(value: Double): Self = this.set("totalExecuted", value.asInstanceOf[js.Any])
  }
}
