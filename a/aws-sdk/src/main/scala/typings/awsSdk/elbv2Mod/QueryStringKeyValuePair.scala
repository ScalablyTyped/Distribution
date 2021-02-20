package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryStringKeyValuePair extends StObject {
  
  /**
    * The key. You can omit the key.
    */
  var Key: js.UndefOr[StringValue] = js.native
  
  /**
    * The value.
    */
  var Value: js.UndefOr[StringValue] = js.native
}
object QueryStringKeyValuePair {
  
  @scala.inline
  def apply(): QueryStringKeyValuePair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryStringKeyValuePair]
  }
  
  @scala.inline
  implicit class QueryStringKeyValuePairMutableBuilder[Self <: QueryStringKeyValuePair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: StringValue): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setValue(value: StringValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
