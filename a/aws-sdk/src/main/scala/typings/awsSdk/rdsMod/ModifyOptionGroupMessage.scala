package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyOptionGroupMessage extends StObject {
  
  /**
    * A value that indicates whether to apply the change immediately or during the next maintenance window for each instance associated with the option group.
    */
  var ApplyImmediately: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the option group to be modified. Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option group, and that option group can't be removed from a DB instance once it is associated with a DB instance
    */
  var OptionGroupName: String = js.native
  
  /**
    * Options in this list are added to the option group or, if already present, the specified configuration is used to update the existing configuration.
    */
  var OptionsToInclude: js.UndefOr[OptionConfigurationList] = js.native
  
  /**
    * Options in this list are removed from the option group.
    */
  var OptionsToRemove: js.UndefOr[OptionNamesList] = js.native
}
object ModifyOptionGroupMessage {
  
  @scala.inline
  def apply(OptionGroupName: String): ModifyOptionGroupMessage = {
    val __obj = js.Dynamic.literal(OptionGroupName = OptionGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyOptionGroupMessage]
  }
  
  @scala.inline
  implicit class ModifyOptionGroupMessageMutableBuilder[Self <: ModifyOptionGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyImmediately(value: Boolean): Self = StObject.set(x, "ApplyImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyImmediatelyUndefined: Self = StObject.set(x, "ApplyImmediately", js.undefined)
    
    @scala.inline
    def setOptionGroupName(value: String): Self = StObject.set(x, "OptionGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsToInclude(value: OptionConfigurationList): Self = StObject.set(x, "OptionsToInclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsToIncludeUndefined: Self = StObject.set(x, "OptionsToInclude", js.undefined)
    
    @scala.inline
    def setOptionsToIncludeVarargs(value: OptionConfiguration*): Self = StObject.set(x, "OptionsToInclude", js.Array(value :_*))
    
    @scala.inline
    def setOptionsToRemove(value: OptionNamesList): Self = StObject.set(x, "OptionsToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsToRemoveUndefined: Self = StObject.set(x, "OptionsToRemove", js.undefined)
    
    @scala.inline
    def setOptionsToRemoveVarargs(value: String*): Self = StObject.set(x, "OptionsToRemove", js.Array(value :_*))
  }
}
