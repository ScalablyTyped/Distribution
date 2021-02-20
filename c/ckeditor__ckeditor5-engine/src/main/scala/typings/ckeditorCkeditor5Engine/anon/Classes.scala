package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Classes extends StObject {
  
  var attributes: js.UndefOr[StringDictionary[String | RegExp | Boolean]] = js.native
  
  var classes: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.native
  
  var name: js.UndefOr[String | RegExp] = js.native
  
  var styles: js.UndefOr[StringDictionary[String | RegExp]] = js.native
}
object Classes {
  
  @scala.inline
  def apply(): Classes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Classes]
  }
  
  @scala.inline
  implicit class ClassesMutableBuilder[Self <: Classes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: StringDictionary[String | RegExp | Boolean]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setClasses(value: String | RegExp | (js.Array[String | RegExp])): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setClassesVarargs(value: (String | RegExp)*): Self = StObject.set(x, "classes", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String | RegExp): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStyles(value: StringDictionary[String | RegExp]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
