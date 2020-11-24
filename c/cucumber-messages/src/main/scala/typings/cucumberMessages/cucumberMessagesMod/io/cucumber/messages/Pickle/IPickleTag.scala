package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a PickleTag. */
@js.native
trait IPickleTag extends js.Object {
  
  /** PickleTag astNodeId */
  var astNodeId: js.UndefOr[String | Null] = js.native
  
  /** PickleTag name */
  var name: js.UndefOr[String | Null] = js.native
}
object IPickleTag {
  
  @scala.inline
  def apply(): IPickleTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPickleTag]
  }
  
  @scala.inline
  implicit class IPickleTagOps[Self <: IPickleTag] (val x: Self) extends AnyVal {
    
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
    def setAstNodeId(value: String): Self = this.set("astNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAstNodeId: Self = this.set("astNodeId", js.undefined)
    
    @scala.inline
    def setAstNodeIdNull: Self = this.set("astNodeId", null)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
  }
}
