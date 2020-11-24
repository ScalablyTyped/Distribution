package typings.awsSdkRoute53IdNormalizerMiddleware.mod

import typings.awsSdkRoute53IdNormalizerMiddleware.anon.Changes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeBatchBearer extends js.Object {
  
  var ChangeBatch: Changes = js.native
}
object ChangeBatchBearer {
  
  @scala.inline
  def apply(ChangeBatch: Changes): ChangeBatchBearer = {
    val __obj = js.Dynamic.literal(ChangeBatch = ChangeBatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeBatchBearer]
  }
  
  @scala.inline
  implicit class ChangeBatchBearerOps[Self <: ChangeBatchBearer] (val x: Self) extends AnyVal {
    
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
    def setChangeBatch(value: Changes): Self = this.set("ChangeBatch", value.asInstanceOf[js.Any])
  }
}
