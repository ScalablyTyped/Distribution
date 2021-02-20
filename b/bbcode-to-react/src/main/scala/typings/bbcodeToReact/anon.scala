package typings.bbcodeToReact

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Linkify extends StObject {
    
    var linkify: Boolean = js.native
  }
  object Linkify {
    
    @scala.inline
    def apply(linkify: Boolean): Linkify = {
      val __obj = js.Dynamic.literal(linkify = linkify.asInstanceOf[js.Any])
      __obj.asInstanceOf[Linkify]
    }
    
    @scala.inline
    implicit class LinkifyMutableBuilder[Self <: Linkify] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLinkify(value: Boolean): Self = StObject.set(x, "linkify", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<std.Omit<bbcode-to-react.bbcode-to-react.TagType, 'children'>> */
  @js.native
  trait PartialOmitTagTypechildre extends StObject {
    
    var name: js.UndefOr[String] = js.native
    
    var params: js.UndefOr[js.Object] = js.native
    
    var parent: js.UndefOr[ReactNode] = js.native
    
    var text: js.UndefOr[String] = js.native
  }
  object PartialOmitTagTypechildre {
    
    @scala.inline
    def apply(): PartialOmitTagTypechildre = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOmitTagTypechildre]
    }
    
    @scala.inline
    implicit class PartialOmitTagTypechildreMutableBuilder[Self <: PartialOmitTagTypechildre] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setParent(value: ReactNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
