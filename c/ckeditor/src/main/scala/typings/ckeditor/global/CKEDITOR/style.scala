package typings.ckeditor.global.CKEDITOR

import typings.ckeditor.CKEDITOR.style.customHandler
import typings.ckeditor.CKEDITOR.style.definition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.style")
@js.native
class style protected ()
  extends typings.ckeditor.CKEDITOR.style {
  def this(styleDefinition: definition, variableValues: js.Any) = this()
}

@JSGlobal("CKEDITOR.style")
@js.native
object style extends js.Object {
  def addCustomHandler(defintion: customHandler): typings.ckeditor.CKEDITOR.style = js.native
  def getStyleText(style: definition): String = js.native
  @js.native
  object customHandlers extends js.Object {
    @js.native
    class widget ()
      extends typings.ckeditor.CKEDITOR.style.customHandlers.widget
    
  }
  
}

