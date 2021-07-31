package typings.backlogJs.mod.Option.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchCategoriesParams extends StObject {
  
  var name: String
}
object PatchCategoriesParams {
  
  @scala.inline
  def apply(name: String): PatchCategoriesParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchCategoriesParams]
  }
  
  @scala.inline
  implicit class PatchCategoriesParamsMutableBuilder[Self <: PatchCategoriesParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
