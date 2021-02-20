package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceLimit extends StObject {
  
  /**
    * Specifies whether the account has met the quota that corresponds to the metric specified by the UsageByAccount.type field in the response.
    */
  var isServiceLimited: js.UndefOr[boolean] = js.native
  
  /**
    * The unit of measurement for the value specified by the value field.
    */
  var unit: js.UndefOr[Unit] = js.native
  
  /**
    * The value for the metric specified by the UsageByAccount.type field in the response.
    */
  var value: js.UndefOr[long] = js.native
}
object ServiceLimit {
  
  @scala.inline
  def apply(): ServiceLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceLimit]
  }
  
  @scala.inline
  implicit class ServiceLimitMutableBuilder[Self <: ServiceLimit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsServiceLimited(value: boolean): Self = StObject.set(x, "isServiceLimited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsServiceLimitedUndefined: Self = StObject.set(x, "isServiceLimited", js.undefined)
    
    @scala.inline
    def setUnit(value: Unit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def setValue(value: long): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
