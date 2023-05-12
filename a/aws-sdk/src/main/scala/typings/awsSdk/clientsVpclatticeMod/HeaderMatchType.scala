package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderMatchType extends StObject {
  
  /**
    * Specifies a contains type match.
    */
  var contains: js.UndefOr[HeaderMatchContains] = js.undefined
  
  /**
    * Specifies an exact type match.
    */
  var exact: js.UndefOr[HeaderMatchExact] = js.undefined
  
  /**
    * Specifies a prefix type match. Matches the value with the prefix.
    */
  var prefix: js.UndefOr[HeaderMatchPrefix] = js.undefined
}
object HeaderMatchType {
  
  inline def apply(): HeaderMatchType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderMatchType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeaderMatchType] (val x: Self) extends AnyVal {
    
    inline def setContains(value: HeaderMatchContains): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    inline def setExact(value: HeaderMatchExact): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    inline def setPrefix(value: HeaderMatchPrefix): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
