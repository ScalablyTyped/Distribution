package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeaseAccessConditionsOptions extends LeaseIdOptions {
  
  var accessConditions: js.UndefOr[StorageAccessCondition] = js.native
}
object LeaseAccessConditionsOptions {
  
  @scala.inline
  def apply(): LeaseAccessConditionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeaseAccessConditionsOptions]
  }
  
  @scala.inline
  implicit class LeaseAccessConditionsOptionsMutableBuilder[Self <: LeaseAccessConditionsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessConditions(value: StorageAccessCondition): Self = StObject.set(x, "accessConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessConditionsUndefined: Self = StObject.set(x, "accessConditions", js.undefined)
  }
}
