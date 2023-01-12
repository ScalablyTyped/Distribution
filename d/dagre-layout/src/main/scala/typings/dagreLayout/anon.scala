package typings.dagreLayout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Compound extends StObject {
    
    var compound: js.UndefOr[Boolean] = js.undefined
    
    var directed: js.UndefOr[Boolean] = js.undefined
    
    var multigraph: js.UndefOr[Boolean] = js.undefined
  }
  object Compound {
    
    inline def apply(): Compound = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Compound]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Compound] (val x: Self) extends AnyVal {
      
      inline def setCompound(value: Boolean): Self = StObject.set(x, "compound", value.asInstanceOf[js.Any])
      
      inline def setCompoundUndefined: Self = StObject.set(x, "compound", js.undefined)
      
      inline def setDirected(value: Boolean): Self = StObject.set(x, "directed", value.asInstanceOf[js.Any])
      
      inline def setDirectedUndefined: Self = StObject.set(x, "directed", js.undefined)
      
      inline def setMultigraph(value: Boolean): Self = StObject.set(x, "multigraph", value.asInstanceOf[js.Any])
      
      inline def setMultigraphUndefined: Self = StObject.set(x, "multigraph", js.undefined)
    }
  }
  
  trait Name extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var v: String
    
    var w: String
  }
  object Name {
    
    inline def apply(v: String, w: String): Name = {
      val __obj = js.Dynamic.literal(v = v.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      inline def setW(value: String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    }
  }
}
