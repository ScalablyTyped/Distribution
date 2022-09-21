package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateConfiguration extends StObject {
  
  /**
    * The template schema used for the data source. The following links to the template schema for data sources where templates are supported:    Zendesk template schema   
    */
  var Template: js.UndefOr[typings.awsSdk.kendraMod.Template] = js.undefined
}
object TemplateConfiguration {
  
  inline def apply(): TemplateConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateConfiguration]
  }
  
  extension [Self <: TemplateConfiguration](x: Self) {
    
    inline def setTemplate(value: Template): Self = StObject.set(x, "Template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "Template", js.undefined)
  }
}
