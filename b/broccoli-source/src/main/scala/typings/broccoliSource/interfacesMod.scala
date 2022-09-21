package typings.broccoliSource

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  trait ConstructorOptions extends StObject {
    
    /**
      * A human-readable description for this node.
      */
    var annotation: js.UndefOr[String] = js.undefined
    
    /**
      * A name for this node. Defaults to "Directory".
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object ConstructorOptions {
    
    inline def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    extension [Self <: ConstructorOptions](x: Self) {
      
      inline def setAnnotation(value: String): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
      
      inline def setAnnotationUndefined: Self = StObject.set(x, "annotation", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  type MapSeriesIterator[T] = js.Function3[
    /* item */ T, 
    /* index */ js.UndefOr[Double], 
    /* array */ js.UndefOr[js.Array[T]], 
    js.Promise[T] | T
  ]
}
