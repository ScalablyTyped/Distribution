package typings.bbcodeToReact

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Linkify extends StObject {
    
    var linkify: Boolean
  }
  object Linkify {
    
    inline def apply(linkify: Boolean): Linkify = {
      val __obj = js.Dynamic.literal(linkify = linkify.asInstanceOf[js.Any])
      __obj.asInstanceOf[Linkify]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Linkify] (val x: Self) extends AnyVal {
      
      inline def setLinkify(value: Boolean): Self = StObject.set(x, "linkify", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<std.Omit<bbcode-to-react.bbcode-to-react.TagType, 'children'>> */
  trait PartialOmitTagTypechildre extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var params: js.UndefOr[js.Object] = js.undefined
    
    var parent: js.UndefOr[ReactNode] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object PartialOmitTagTypechildre {
    
    inline def apply(): PartialOmitTagTypechildre = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOmitTagTypechildre]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialOmitTagTypechildre] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setParent(value: ReactNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
