package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UiTemplate extends StObject {
  
  /**
    * The content of the Liquid template for the worker user interface.
    */
  var Content: TemplateContent
}
object UiTemplate {
  
  @scala.inline
  def apply(Content: TemplateContent): UiTemplate = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any])
    __obj.asInstanceOf[UiTemplate]
  }
  
  @scala.inline
  implicit class UiTemplateMutableBuilder[Self <: UiTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: TemplateContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
  }
}
