package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextObject extends StObject {
  
  var exclude: js.UndefOr[js.Array[js.Array[String] | String]] = js.undefined
  
  var include: js.UndefOr[js.Array[js.Array[String] | String]] = js.undefined
}
object ContextObject {
  
  @scala.inline
  def apply(): ContextObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextObject]
  }
  
  @scala.inline
  implicit class ContextObjectMutableBuilder[Self <: ContextObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclude(value: js.Array[js.Array[String] | String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: js.Array[js.Array[String] | String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "include", js.Array(value :_*))
  }
}
