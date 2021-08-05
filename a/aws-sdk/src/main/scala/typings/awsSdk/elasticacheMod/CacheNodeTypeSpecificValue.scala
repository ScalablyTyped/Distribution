package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheNodeTypeSpecificValue extends StObject {
  
  /**
    * The cache node type for which this value applies.
    */
  var CacheNodeType: js.UndefOr[String] = js.undefined
  
  /**
    * The value for the cache node type.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object CacheNodeTypeSpecificValue {
  
  inline def apply(): CacheNodeTypeSpecificValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheNodeTypeSpecificValue]
  }
  
  extension [Self <: CacheNodeTypeSpecificValue](x: Self) {
    
    inline def setCacheNodeType(value: String): Self = StObject.set(x, "CacheNodeType", value.asInstanceOf[js.Any])
    
    inline def setCacheNodeTypeUndefined: Self = StObject.set(x, "CacheNodeType", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
