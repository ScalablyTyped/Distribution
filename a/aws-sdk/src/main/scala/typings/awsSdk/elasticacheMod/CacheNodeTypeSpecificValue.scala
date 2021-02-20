package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheNodeTypeSpecificValue extends StObject {
  
  /**
    * The cache node type for which this value applies.
    */
  var CacheNodeType: js.UndefOr[String] = js.native
  
  /**
    * The value for the cache node type.
    */
  var Value: js.UndefOr[String] = js.native
}
object CacheNodeTypeSpecificValue {
  
  @scala.inline
  def apply(): CacheNodeTypeSpecificValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheNodeTypeSpecificValue]
  }
  
  @scala.inline
  implicit class CacheNodeTypeSpecificValueMutableBuilder[Self <: CacheNodeTypeSpecificValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheNodeType(value: String): Self = StObject.set(x, "CacheNodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheNodeTypeUndefined: Self = StObject.set(x, "CacheNodeType", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
