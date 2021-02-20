package typings.braftEditor.anon

import typings.braftEditor.mod.BuiltInControlType
import typings.braftEditor.mod.ControlType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Key extends ControlType {
  
  var key: BuiltInControlType = js.native
  
  var text: js.UndefOr[String | ReactNode] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object Key {
  
  @scala.inline
  def apply(key: BuiltInControlType): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  @scala.inline
  implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: BuiltInControlType): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String | ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
