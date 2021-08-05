package typings.azdata

import typings.azdata.mod.Component
import typings.azdata.mod.FormItemLayout
import typings.vscode.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Azdatacellguid extends StObject {
    
    var azdata_cell_guid: js.UndefOr[String] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Azdatacellguid {
    
    inline def apply(): Azdatacellguid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Azdatacellguid]
    }
    
    extension [Self <: Azdatacellguid](x: Self) {
      
      inline def setAzdata_cell_guid(value: String): Self = StObject.set(x, "azdata_cell_guid", value.asInstanceOf[js.Any])
      
      inline def setAzdata_cell_guidUndefined: Self = StObject.set(x, "azdata_cell_guid", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
  
  trait AzdatachartOptions extends StObject {
    
    var azdata_chartOptions: js.UndefOr[js.Any] = js.undefined
  }
  object AzdatachartOptions {
    
    inline def apply(): AzdatachartOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AzdatachartOptions]
    }
    
    extension [Self <: AzdatachartOptions](x: Self) {
      
      inline def setAzdata_chartOptions(value: js.Any): Self = StObject.set(x, "azdata_chartOptions", value.asInstanceOf[js.Any])
      
      inline def setAzdata_chartOptionsUndefined: Self = StObject.set(x, "azdata_chartOptions", js.undefined)
    }
  }
  
  trait Dark extends StObject {
    
    var dark: String | Uri
    
    var light: String | Uri
  }
  object Dark {
    
    inline def apply(dark: String | Uri, light: String | Uri): Dark = {
      val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dark]
    }
    
    extension [Self <: Dark](x: Self) {
      
      inline def setDark(value: String | Uri): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
      
      inline def setLight(value: String | Uri): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined azdata.azdata.FormComponent & {  layout :azdata.azdata.FormItemLayout | undefined} */
  trait FormComponentlayoutFormIt extends StObject {
    
    var actions: js.UndefOr[js.Array[Component]] = js.undefined
    
    var component: Component
    
    var layout: js.UndefOr[FormItemLayout] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var title: String
  }
  object FormComponentlayoutFormIt {
    
    inline def apply(component: Component, title: String): FormComponentlayoutFormIt = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormComponentlayoutFormIt]
    }
    
    extension [Self <: FormComponentlayoutFormIt](x: Self) {
      
      inline def setActions(value: js.Array[Component]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: Component*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      inline def setComponent(value: Component): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: FormItemLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait Password extends StObject {
    
    var password: Boolean
    
    var prompt: String
  }
  object Password {
    
    inline def apply(password: Boolean, prompt: String): Password = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any])
      __obj.asInstanceOf[Password]
    }
    
    extension [Self <: Password](x: Self) {
      
      inline def setPassword(value: Boolean): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    }
  }
  
  trait Text extends StObject {
    
    var text: String
    
    var url: String
  }
  object Text {
    
    inline def apply(text: String, url: String): Text = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    extension [Self <: Text](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Token extends StObject {
    
    var token: String
    
    var tokenType: js.UndefOr[String] = js.undefined
  }
  object Token {
    
    inline def apply(token: String): Token = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    extension [Self <: Token](x: Self) {
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenType(value: String): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      inline def setTokenTypeUndefined: Self = StObject.set(x, "tokenType", js.undefined)
    }
  }
  
  trait UndoStopAfter extends StObject {
    
    var undoStopAfter: Boolean
    
    var undoStopBefore: Boolean
  }
  object UndoStopAfter {
    
    inline def apply(undoStopAfter: Boolean, undoStopBefore: Boolean): UndoStopAfter = {
      val __obj = js.Dynamic.literal(undoStopAfter = undoStopAfter.asInstanceOf[js.Any], undoStopBefore = undoStopBefore.asInstanceOf[js.Any])
      __obj.asInstanceOf[UndoStopAfter]
    }
    
    extension [Self <: UndoStopAfter](x: Self) {
      
      inline def setUndoStopAfter(value: Boolean): Self = StObject.set(x, "undoStopAfter", value.asInstanceOf[js.Any])
      
      inline def setUndoStopBefore(value: Boolean): Self = StObject.set(x, "undoStopBefore", value.asInstanceOf[js.Any])
    }
  }
}
