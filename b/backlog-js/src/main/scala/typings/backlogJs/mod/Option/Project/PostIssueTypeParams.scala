package typings.backlogJs.mod.Option.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostIssueTypeParams extends StObject {
  
  var color: IssueTypeColor = js.native
  
  var name: String = js.native
}
object PostIssueTypeParams {
  
  @scala.inline
  def apply(color: IssueTypeColor, name: String): PostIssueTypeParams = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostIssueTypeParams]
  }
  
  @scala.inline
  implicit class PostIssueTypeParamsMutableBuilder[Self <: PostIssueTypeParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: IssueTypeColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
