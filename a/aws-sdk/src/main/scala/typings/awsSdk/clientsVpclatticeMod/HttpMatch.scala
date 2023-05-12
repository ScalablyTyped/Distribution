package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpMatch extends StObject {
  
  /**
    * The header matches. Matches incoming requests with rule based on request header value before applying rule action.
    */
  var headerMatches: js.UndefOr[HeaderMatchList] = js.undefined
  
  /**
    * The HTTP method type.
    */
  var method: js.UndefOr[HttpMethod] = js.undefined
  
  /**
    * The path match.
    */
  var pathMatch: js.UndefOr[PathMatch] = js.undefined
}
object HttpMatch {
  
  inline def apply(): HttpMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpMatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpMatch] (val x: Self) extends AnyVal {
    
    inline def setHeaderMatches(value: HeaderMatchList): Self = StObject.set(x, "headerMatches", value.asInstanceOf[js.Any])
    
    inline def setHeaderMatchesUndefined: Self = StObject.set(x, "headerMatches", js.undefined)
    
    inline def setHeaderMatchesVarargs(value: HeaderMatch*): Self = StObject.set(x, "headerMatches", js.Array(value*))
    
    inline def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setPathMatch(value: PathMatch): Self = StObject.set(x, "pathMatch", value.asInstanceOf[js.Any])
    
    inline def setPathMatchUndefined: Self = StObject.set(x, "pathMatch", js.undefined)
  }
}
