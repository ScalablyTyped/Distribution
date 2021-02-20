package typings.awsSdk.simpledbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateCondition extends StObject {
  
  /**
    * A value specifying whether or not the specified attribute must exist with the specified value in order for the update condition to be satisfied. Specify true if the attribute must exist for the update condition to be satisfied. Specify false if the attribute should not exist in order for the update condition to be satisfied.
    */
  var Exists: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the attribute involved in the condition.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The value of an attribute. This value can only be specified when the Exists parameter is equal to true.
    */
  var Value: js.UndefOr[String] = js.native
}
object UpdateCondition {
  
  @scala.inline
  def apply(): UpdateCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCondition]
  }
  
  @scala.inline
  implicit class UpdateConditionMutableBuilder[Self <: UpdateCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExists(value: Boolean): Self = StObject.set(x, "Exists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExistsUndefined: Self = StObject.set(x, "Exists", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
