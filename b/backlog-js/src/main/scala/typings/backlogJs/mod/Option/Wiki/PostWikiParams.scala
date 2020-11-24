package typings.backlogJs.mod.Option.Wiki

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostWikiParams extends js.Object {
  
  var content: String = js.native
  
  var mailNotify: js.UndefOr[Boolean] = js.native
  
  var name: String = js.native
  
  var projectId: Double = js.native
}
object PostWikiParams {
  
  @scala.inline
  def apply(content: String, name: String, projectId: Double): PostWikiParams = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostWikiParams]
  }
  
  @scala.inline
  implicit class PostWikiParamsOps[Self <: PostWikiParams] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectId(value: Double): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailNotify(value: Boolean): Self = this.set("mailNotify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMailNotify: Self = this.set("mailNotify", js.undefined)
  }
}
