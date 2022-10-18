package typings.azureMsalCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUrlIuriMod {
  
  trait IUri extends StObject {
    
    var AbsolutePath: String
    
    var Hash: String
    
    var HostNameAndPort: String
    
    var PathSegments: js.Array[String]
    
    var Protocol: String
    
    var QueryString: String
    
    var Search: String
  }
  object IUri {
    
    inline def apply(
      AbsolutePath: String,
      Hash: String,
      HostNameAndPort: String,
      PathSegments: js.Array[String],
      Protocol: String,
      QueryString: String,
      Search: String
    ): IUri = {
      val __obj = js.Dynamic.literal(AbsolutePath = AbsolutePath.asInstanceOf[js.Any], Hash = Hash.asInstanceOf[js.Any], HostNameAndPort = HostNameAndPort.asInstanceOf[js.Any], PathSegments = PathSegments.asInstanceOf[js.Any], Protocol = Protocol.asInstanceOf[js.Any], QueryString = QueryString.asInstanceOf[js.Any], Search = Search.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUri]
    }
    
    extension [Self <: IUri](x: Self) {
      
      inline def setAbsolutePath(value: String): Self = StObject.set(x, "AbsolutePath", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "Hash", value.asInstanceOf[js.Any])
      
      inline def setHostNameAndPort(value: String): Self = StObject.set(x, "HostNameAndPort", value.asInstanceOf[js.Any])
      
      inline def setPathSegments(value: js.Array[String]): Self = StObject.set(x, "PathSegments", value.asInstanceOf[js.Any])
      
      inline def setPathSegmentsVarargs(value: String*): Self = StObject.set(x, "PathSegments", js.Array(value*))
      
      inline def setProtocol(value: String): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
      
      inline def setQueryString(value: String): Self = StObject.set(x, "QueryString", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: String): Self = StObject.set(x, "Search", value.asInstanceOf[js.Any])
    }
  }
}
