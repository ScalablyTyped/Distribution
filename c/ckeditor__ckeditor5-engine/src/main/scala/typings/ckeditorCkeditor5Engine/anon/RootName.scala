package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootName extends StObject {
  
  var rootName: js.UndefOr[String] = js.undefined
}
object RootName {
  
  @scala.inline
  def apply(): RootName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RootName]
  }
  
  @scala.inline
  implicit class RootNameMutableBuilder[Self <: RootName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRootName(value: String): Self = StObject.set(x, "rootName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNameUndefined: Self = StObject.set(x, "rootName", js.undefined)
  }
}
