package typings.ckeditor.global.CKEDITOR

import typings.ckeditor.CKEDITOR.style.customHandler
import typings.ckeditor.CKEDITOR.style.definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CKEDITOR.style")
@js.native
class style protected ()
  extends typings.ckeditor.CKEDITOR.style {
  def this(styleDefinition: definition, variableValues: js.Any) = this()
}
object style {
  
  @JSGlobal("CKEDITOR.style.addCustomHandler")
  @js.native
  def addCustomHandler(defintion: customHandler): typings.ckeditor.CKEDITOR.style = js.native
  
  object customHandlers {
    
    @JSGlobal("CKEDITOR.style.customHandlers.widget")
    @js.native
    class widget ()
      extends typings.ckeditor.CKEDITOR.style.customHandlers.widget
  }
  
  @JSGlobal("CKEDITOR.style.getStyleText")
  @js.native
  def getStyleText(style: definition): String = js.native
}
