package typings.botvs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Body extends StObject {
    
    var Body: String
    
    var Header: String
  }
  object Body {
    
    inline def apply(Body: String, Header: String): Body = {
      val __obj = js.Dynamic.literal(Body = Body.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: String): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: js.UndefOr[String] = js.undefined
    
    var method: String
  }
  object Data {
    
    inline def apply(method: String): Data = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    }
  }
}
