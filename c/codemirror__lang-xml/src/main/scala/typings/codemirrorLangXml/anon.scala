package typings.codemirrorLangXml

import typings.codemirrorAutocomplete.mod.CompletionSection
import typings.codemirrorView.mod.EditorView
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@codemirror/autocomplete.@codemirror/autocomplete.Completion> */
  trait PartialCompletion extends StObject {
    
    @JSName("apply")
    var apply: js.UndefOr[
        String | (js.Function4[
          /* view */ EditorView, 
          /* completion */ this.type, 
          /* from */ Double, 
          /* to */ Double, 
          Unit
        ])
      ] = js.undefined
    
    var boost: js.UndefOr[Double] = js.undefined
    
    var detail: js.UndefOr[String] = js.undefined
    
    var info: js.UndefOr[
        String | (js.Function1[/* completion */ this.type, Node | Null | (js.Promise[Node | Null])])
      ] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var section: js.UndefOr[String | CompletionSection] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object PartialCompletion {
    
    inline def apply(): PartialCompletion = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialCompletion]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialCompletion] (val x: Self) extends AnyVal {
      
      inline def setApply(
        value: String | (js.Function4[/* view */ EditorView, PartialCompletion, /* from */ Double, /* to */ Double, Unit])
      ): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
      
      inline def setApplyFunction4(value: (/* view */ EditorView, PartialCompletion, /* from */ Double, /* to */ Double) => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction4(value))
      
      inline def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
      
      inline def setBoost(value: Double): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
      
      inline def setBoostUndefined: Self = StObject.set(x, "boost", js.undefined)
      
      inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      inline def setInfo(value: String | (js.Function1[PartialCompletion, Node | Null | (js.Promise[Node | Null])])): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoFunction1(value: PartialCompletion => Node | Null | (js.Promise[Node | Null])): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setSection(value: String | CompletionSection): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      
      inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
