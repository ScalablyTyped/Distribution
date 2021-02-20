package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AclConfiguration extends StObject {
  
  /**
    * A list of groups, separated by semi-colons, that filters a query response based on user context. The document is only returned to users that are in one of the groups specified in the UserContext field of the Query operation.
    */
  var AllowedGroupsColumnName: ColumnName = js.native
}
object AclConfiguration {
  
  @scala.inline
  def apply(AllowedGroupsColumnName: ColumnName): AclConfiguration = {
    val __obj = js.Dynamic.literal(AllowedGroupsColumnName = AllowedGroupsColumnName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AclConfiguration]
  }
  
  @scala.inline
  implicit class AclConfigurationMutableBuilder[Self <: AclConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedGroupsColumnName(value: ColumnName): Self = StObject.set(x, "AllowedGroupsColumnName", value.asInstanceOf[js.Any])
  }
}
