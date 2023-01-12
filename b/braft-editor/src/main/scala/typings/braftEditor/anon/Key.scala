package typings.braftEditor.anon

import typings.braftEditor.mod.BuiltInControlType
import typings.braftEditor.mod.ControlType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key
  extends StObject
     with ControlType {
  
  var key: BuiltInControlType
  
  var text: js.UndefOr[String | ReactNode] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object Key {
  
  inline def apply(key: BuiltInControlType): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
    
    inline def setKey(value: BuiltInControlType): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setText(value: String | ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
