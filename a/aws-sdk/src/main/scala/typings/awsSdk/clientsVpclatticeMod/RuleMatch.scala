package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleMatch extends StObject {
  
  /**
    * The HTTP criteria that a rule must match.
    */
  var httpMatch: js.UndefOr[HttpMatch] = js.undefined
}
object RuleMatch {
  
  inline def apply(): RuleMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleMatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleMatch] (val x: Self) extends AnyVal {
    
    inline def setHttpMatch(value: HttpMatch): Self = StObject.set(x, "httpMatch", value.asInstanceOf[js.Any])
    
    inline def setHttpMatchUndefined: Self = StObject.set(x, "httpMatch", js.undefined)
  }
}
