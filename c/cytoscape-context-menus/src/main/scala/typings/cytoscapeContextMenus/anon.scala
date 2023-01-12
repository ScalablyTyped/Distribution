package typings.cytoscapeContextMenus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CoreAsWell extends StObject {
    
    var coreAsWell: js.UndefOr[String] = js.undefined
    
    var selector: js.UndefOr[String] = js.undefined
  }
  object CoreAsWell {
    
    inline def apply(): CoreAsWell = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CoreAsWell]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CoreAsWell] (val x: Self) extends AnyVal {
      
      inline def setCoreAsWell(value: String): Self = StObject.set(x, "coreAsWell", value.asInstanceOf[js.Any])
      
      inline def setCoreAsWellUndefined: Self = StObject.set(x, "coreAsWell", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var src: String
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, src: String, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Src extends StObject {
    
    var height: Double
    
    var src: String
    
    var width: Double
    
    var x: String
    
    var y: String
  }
  object Src {
    
    inline def apply(height: Double, src: String, width: Double, x: String, y: String): Src = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Src]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Src] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
