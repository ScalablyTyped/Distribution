package typings.azdata

import typings.azdata.mod.Component
import typings.azdata.mod.FormItemLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Content extends StObject {
    
    var content: js.UndefOr[String] = js.undefined
  }
  object Content {
    
    inline def apply(): Content = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Content]
    }
    
    extension [Self <: Content](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    }
  }
  
  trait EncryptorName extends StObject {
    
    var encryptorName: String
    
    var encryptorType: Double
  }
  object EncryptorName {
    
    inline def apply(encryptorName: String, encryptorType: Double): EncryptorName = {
      val __obj = js.Dynamic.literal(encryptorName = encryptorName.asInstanceOf[js.Any], encryptorType = encryptorType.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncryptorName]
    }
    
    extension [Self <: EncryptorName](x: Self) {
      
      inline def setEncryptorName(value: String): Self = StObject.set(x, "encryptorName", value.asInstanceOf[js.Any])
      
      inline def setEncryptorType(value: Double): Self = StObject.set(x, "encryptorType", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined azdata.azdata.FormComponent<azdata.azdata.Component> & {  layout :azdata.azdata.FormItemLayout | undefined} */
  trait FormComponentComponentlay extends StObject {
    
    var actions: js.UndefOr[js.Array[Component]] = js.undefined
    
    var component: Component
    
    var layout: js.UndefOr[FormItemLayout] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object FormComponentComponentlay {
    
    inline def apply(component: Component): FormComponentComponentlay = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormComponentComponentlay]
    }
    
    extension [Self <: FormComponentComponentlay](x: Self) {
      
      inline def setActions(value: js.Array[Component]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: Component*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setComponent(value: Component): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: FormItemLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
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
