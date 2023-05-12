package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMatchType extends StObject {
  
  /**
    * An exact match of the path.
    */
  var exact: js.UndefOr[PathMatchExact] = js.undefined
  
  /**
    * A prefix match of the path.
    */
  var prefix: js.UndefOr[PathMatchPrefix] = js.undefined
}
object PathMatchType {
  
  inline def apply(): PathMatchType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathMatchType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathMatchType] (val x: Self) extends AnyVal {
    
    inline def setExact(value: PathMatchExact): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    inline def setPrefix(value: PathMatchPrefix): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
