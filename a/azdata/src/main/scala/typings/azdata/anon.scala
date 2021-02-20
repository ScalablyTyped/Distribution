package typings.azdata

import typings.azdata.mod.Component
import typings.azdata.mod.FormItemLayout
import typings.vscode.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Azdatacellguid extends StObject {
    
    var azdata_cell_guid: js.UndefOr[String] = js.native
    
    var language: js.UndefOr[String] = js.native
    
    var tags: js.UndefOr[js.Array[String]] = js.native
  }
  object Azdatacellguid {
    
    @scala.inline
    def apply(): Azdatacellguid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Azdatacellguid]
    }
    
    @scala.inline
    implicit class AzdatacellguidMutableBuilder[Self <: Azdatacellguid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAzdata_cell_guid(value: String): Self = StObject.set(x, "azdata_cell_guid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAzdata_cell_guidUndefined: Self = StObject.set(x, "azdata_cell_guid", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
  
  @js.native
  trait AzdatachartOptions extends StObject {
    
    var azdata_chartOptions: js.UndefOr[js.Any] = js.native
  }
  object AzdatachartOptions {
    
    @scala.inline
    def apply(): AzdatachartOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AzdatachartOptions]
    }
    
    @scala.inline
    implicit class AzdatachartOptionsMutableBuilder[Self <: AzdatachartOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAzdata_chartOptions(value: js.Any): Self = StObject.set(x, "azdata_chartOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAzdata_chartOptionsUndefined: Self = StObject.set(x, "azdata_chartOptions", js.undefined)
    }
  }
  
  @js.native
  trait Dark extends StObject {
    
    var dark: String | Uri = js.native
    
    var light: String | Uri = js.native
  }
  object Dark {
    
    @scala.inline
    def apply(dark: String | Uri, light: String | Uri): Dark = {
      val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dark]
    }
    
    @scala.inline
    implicit class DarkMutableBuilder[Self <: Dark] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDark(value: String | Uri): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLight(value: String | Uri): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined azdata.azdata.FormComponent & {  layout :azdata.azdata.FormItemLayout | undefined} */
  @js.native
  trait FormComponentlayoutFormIt extends StObject {
    
    var actions: js.UndefOr[js.Array[Component]] = js.native
    
    var component: Component = js.native
    
    var layout: js.UndefOr[FormItemLayout] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    var title: String = js.native
  }
  object FormComponentlayoutFormIt {
    
    @scala.inline
    def apply(component: Component, title: String): FormComponentlayoutFormIt = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormComponentlayoutFormIt]
    }
    
    @scala.inline
    implicit class FormComponentlayoutFormItMutableBuilder[Self <: FormComponentlayoutFormIt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: js.Array[Component]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setActionsVarargs(value: Component*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      @scala.inline
      def setComponent(value: Component): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayout(value: FormItemLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Password extends StObject {
    
    var password: Boolean = js.native
    
    var prompt: String = js.native
  }
  object Password {
    
    @scala.inline
    def apply(password: Boolean, prompt: String): Password = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any])
      __obj.asInstanceOf[Password]
    }
    
    @scala.inline
    implicit class PasswordMutableBuilder[Self <: Password] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassword(value: Boolean): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Text extends StObject {
    
    var text: String = js.native
    
    var url: String = js.native
  }
  object Text {
    
    @scala.inline
    def apply(text: String, url: String): Text = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Token extends StObject {
    
    var token: String = js.native
    
    var tokenType: js.UndefOr[String] = js.native
  }
  object Token {
    
    @scala.inline
    def apply(token: String): Token = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit class TokenMutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenType(value: String): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenTypeUndefined: Self = StObject.set(x, "tokenType", js.undefined)
    }
  }
  
  @js.native
  trait UndoStopAfter extends StObject {
    
    var undoStopAfter: Boolean = js.native
    
    var undoStopBefore: Boolean = js.native
  }
  object UndoStopAfter {
    
    @scala.inline
    def apply(undoStopAfter: Boolean, undoStopBefore: Boolean): UndoStopAfter = {
      val __obj = js.Dynamic.literal(undoStopAfter = undoStopAfter.asInstanceOf[js.Any], undoStopBefore = undoStopBefore.asInstanceOf[js.Any])
      __obj.asInstanceOf[UndoStopAfter]
    }
    
    @scala.inline
    implicit class UndoStopAfterMutableBuilder[Self <: UndoStopAfter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUndoStopAfter(value: Boolean): Self = StObject.set(x, "undoStopAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUndoStopBefore(value: Boolean): Self = StObject.set(x, "undoStopBefore", value.asInstanceOf[js.Any])
    }
  }
}
