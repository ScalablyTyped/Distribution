package typings.devextremeB5DqTZzf.mod.default

import typings.devextremeB5DqTZzf.anon.Container
import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.core.Template_
import typings.devextremeB5DqTZzf.mod.DevExpress.core.dxTemplateOptions
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object core {
  
  @JSImport(".devextreme-b5DqTZzf", "default.core.FunctionTemplate")
  @js.native
  open class FunctionTemplate ()
    extends StObject
       with typings.devextremeB5DqTZzf.mod.DevExpress.core.FunctionTemplate {
    
    /* CompleteClass */
    override def render(template: Container): DxElement_[HTMLElement] = js.native
  }
  
  @JSImport(".devextreme-b5DqTZzf", "default.core.Template")
  @js.native
  open class Template ()
    extends StObject
       with Template_ {
    def this(options: dxTemplateOptions) = this()
  }
  
  @JSImport(".devextreme-b5DqTZzf", "default.core.TemplateManager")
  @js.native
  open class TemplateManager ()
    extends StObject
       with typings.devextremeB5DqTZzf.mod.DevExpress.core.TemplateManager {
    
    /* CompleteClass */
    override def addDefaultTemplates(templates: Record[String, Any]): Unit = js.native
    
    /* CompleteClass */
    var anonymousTemplateName: String = js.native
  }
}
