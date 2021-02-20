package typings.dagreLayout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Compound extends StObject {
    
    var compound: js.UndefOr[Boolean] = js.native
    
    var directed: js.UndefOr[Boolean] = js.native
    
    var multigraph: js.UndefOr[Boolean] = js.native
  }
  object Compound {
    
    @scala.inline
    def apply(): Compound = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Compound]
    }
    
    @scala.inline
    implicit class CompoundMutableBuilder[Self <: Compound] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompound(value: Boolean): Self = StObject.set(x, "compound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompoundUndefined: Self = StObject.set(x, "compound", js.undefined)
      
      @scala.inline
      def setDirected(value: Boolean): Self = StObject.set(x, "directed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectedUndefined: Self = StObject.set(x, "directed", js.undefined)
      
      @scala.inline
      def setMultigraph(value: Boolean): Self = StObject.set(x, "multigraph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultigraphUndefined: Self = StObject.set(x, "multigraph", js.undefined)
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: js.UndefOr[String] = js.native
    
    var v: String = js.native
    
    var w: String = js.native
  }
  object Name {
    
    @scala.inline
    def apply(v: String, w: String): Name = {
      val __obj = js.Dynamic.literal(v = v.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setW(value: String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    }
  }
}
