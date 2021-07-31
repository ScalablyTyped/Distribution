package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyOptionGroupResult extends StObject {
  
  var OptionGroup: js.UndefOr[typings.awsSdk.rdsMod.OptionGroup] = js.undefined
}
object ModifyOptionGroupResult {
  
  @scala.inline
  def apply(): ModifyOptionGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyOptionGroupResult]
  }
  
  @scala.inline
  implicit class ModifyOptionGroupResultMutableBuilder[Self <: ModifyOptionGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptionGroup(value: OptionGroup): Self = StObject.set(x, "OptionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionGroupUndefined: Self = StObject.set(x, "OptionGroup", js.undefined)
  }
}
