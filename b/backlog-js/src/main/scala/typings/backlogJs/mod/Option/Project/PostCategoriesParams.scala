package typings.backlogJs.mod.Option.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostCategoriesParams extends StObject {
  
  var name: String = js.native
}
object PostCategoriesParams {
  
  @scala.inline
  def apply(name: String): PostCategoriesParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCategoriesParams]
  }
  
  @scala.inline
  implicit class PostCategoriesParamsMutableBuilder[Self <: PostCategoriesParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
