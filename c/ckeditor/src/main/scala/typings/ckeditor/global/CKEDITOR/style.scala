package typings.ckeditor.global.CKEDITOR

import typings.ckeditor.CKEDITOR.style.customHandler
import typings.ckeditor.CKEDITOR.style.definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CKEDITOR.style")
@js.native
class style protected ()
  extends StObject
     with typings.ckeditor.CKEDITOR.style {
  def this(styleDefinition: definition, variableValues: js.Any) = this()
}
object style {
  
  @JSGlobal("CKEDITOR.style")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addCustomHandler(defintion: customHandler): typings.ckeditor.CKEDITOR.style = ^.asInstanceOf[js.Dynamic].applyDynamic("addCustomHandler")(defintion.asInstanceOf[js.Any]).asInstanceOf[typings.ckeditor.CKEDITOR.style]
  
  object customHandlers {
    
    @JSGlobal("CKEDITOR.style.customHandlers.widget")
    @js.native
    class widget ()
      extends StObject
         with typings.ckeditor.CKEDITOR.style.customHandlers.widget
  }
  
  @scala.inline
  def getStyleText(style: definition): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyleText")(style.asInstanceOf[js.Any]).asInstanceOf[String]
}
