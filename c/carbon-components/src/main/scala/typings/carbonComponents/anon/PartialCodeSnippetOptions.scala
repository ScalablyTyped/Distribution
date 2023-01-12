package typings.carbonComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<carbon-components.carbon-components/components/code-snippet/code-snippet.CodeSnippetOptions> */
trait PartialCodeSnippetOptions extends StObject {
  
  var attribShowLessText: js.UndefOr[String] = js.undefined
  
  var attribShowMoreText: js.UndefOr[String] = js.undefined
  
  var classExpandBtn: js.UndefOr[String] = js.undefined
  
  var classExpandText: js.UndefOr[String] = js.undefined
  
  var classExpanded: js.UndefOr[String] = js.undefined
  
  var classHideExpand: js.UndefOr[String] = js.undefined
  
  var minHeight: js.UndefOr[Double] = js.undefined
  
  var selectorInit: js.UndefOr[String] = js.undefined
}
object PartialCodeSnippetOptions {
  
  inline def apply(): PartialCodeSnippetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCodeSnippetOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialCodeSnippetOptions] (val x: Self) extends AnyVal {
    
    inline def setAttribShowLessText(value: String): Self = StObject.set(x, "attribShowLessText", value.asInstanceOf[js.Any])
    
    inline def setAttribShowLessTextUndefined: Self = StObject.set(x, "attribShowLessText", js.undefined)
    
    inline def setAttribShowMoreText(value: String): Self = StObject.set(x, "attribShowMoreText", value.asInstanceOf[js.Any])
    
    inline def setAttribShowMoreTextUndefined: Self = StObject.set(x, "attribShowMoreText", js.undefined)
    
    inline def setClassExpandBtn(value: String): Self = StObject.set(x, "classExpandBtn", value.asInstanceOf[js.Any])
    
    inline def setClassExpandBtnUndefined: Self = StObject.set(x, "classExpandBtn", js.undefined)
    
    inline def setClassExpandText(value: String): Self = StObject.set(x, "classExpandText", value.asInstanceOf[js.Any])
    
    inline def setClassExpandTextUndefined: Self = StObject.set(x, "classExpandText", js.undefined)
    
    inline def setClassExpanded(value: String): Self = StObject.set(x, "classExpanded", value.asInstanceOf[js.Any])
    
    inline def setClassExpandedUndefined: Self = StObject.set(x, "classExpanded", js.undefined)
    
    inline def setClassHideExpand(value: String): Self = StObject.set(x, "classHideExpand", value.asInstanceOf[js.Any])
    
    inline def setClassHideExpandUndefined: Self = StObject.set(x, "classHideExpand", js.undefined)
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
    
    inline def setSelectorInitUndefined: Self = StObject.set(x, "selectorInit", js.undefined)
  }
}
