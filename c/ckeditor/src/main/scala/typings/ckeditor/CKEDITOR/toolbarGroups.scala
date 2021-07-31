package typings.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait toolbarGroups extends StObject {
  
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object toolbarGroups {
  
  @scala.inline
  def apply(): toolbarGroups = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[toolbarGroups]
  }
  
  @scala.inline
  implicit class toolbarGroupsMutableBuilder[Self <: toolbarGroups] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
