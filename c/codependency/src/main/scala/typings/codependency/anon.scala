package typings.codependency

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Index extends StObject {
    
    var index: js.Array[String]
  }
  object Index {
    
    inline def apply(index: js.Array[String]): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    extension [Self <: Index](x: Self) {
      
      inline def setIndex(value: js.Array[String]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
    }
  }
}
