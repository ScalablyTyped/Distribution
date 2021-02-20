package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOptionGroupResult extends StObject {
  
  var OptionGroup: js.UndefOr[typings.awsSdk.rdsMod.OptionGroup] = js.native
}
object CreateOptionGroupResult {
  
  @scala.inline
  def apply(): CreateOptionGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOptionGroupResult]
  }
  
  @scala.inline
  implicit class CreateOptionGroupResultMutableBuilder[Self <: CreateOptionGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptionGroup(value: OptionGroup): Self = StObject.set(x, "OptionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionGroupUndefined: Self = StObject.set(x, "OptionGroup", js.undefined)
  }
}
