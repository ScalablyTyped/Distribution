package typings.ckeditor.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Removed extends StObject {
  
  var removed: js.Array[String]
  
  var set: StringDictionary[String]
}
object Removed {
  
  @scala.inline
  def apply(removed: js.Array[String], set: StringDictionary[String]): Removed = {
    val __obj = js.Dynamic.literal(removed = removed.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[Removed]
  }
  
  @scala.inline
  implicit class RemovedMutableBuilder[Self <: Removed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoved(value: js.Array[String]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedVarargs(value: String*): Self = StObject.set(x, "removed", js.Array(value :_*))
    
    @scala.inline
    def setSet(value: StringDictionary[String]): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
  }
}
