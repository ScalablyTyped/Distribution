package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Hook. */
@js.native
trait IHook extends js.Object {
  
  /** Hook id */
  var id: js.UndefOr[String | Null] = js.native
  
  /** Hook sourceReference */
  var sourceReference: js.UndefOr[ISourceReference | Null] = js.native
  
  /** Hook tagExpression */
  var tagExpression: js.UndefOr[String | Null] = js.native
}
object IHook {
  
  @scala.inline
  def apply(): IHook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHook]
  }
  
  @scala.inline
  implicit class IHookOps[Self <: IHook] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    
    @scala.inline
    def setSourceReference(value: ISourceReference): Self = this.set("sourceReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceReference: Self = this.set("sourceReference", js.undefined)
    
    @scala.inline
    def setSourceReferenceNull: Self = this.set("sourceReference", null)
    
    @scala.inline
    def setTagExpression(value: String): Self = this.set("tagExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagExpression: Self = this.set("tagExpression", js.undefined)
    
    @scala.inline
    def setTagExpressionNull: Self = this.set("tagExpression", null)
  }
}
