package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBParameterGroup extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the DB parameter group.
    */
  var DBParameterGroupArn: js.UndefOr[String] = js.native
  
  /**
    * Provides the name of the DB parameter group family that this DB parameter group is compatible with.
    */
  var DBParameterGroupFamily: js.UndefOr[String] = js.native
  
  /**
    * Provides the name of the DB parameter group.
    */
  var DBParameterGroupName: js.UndefOr[String] = js.native
  
  /**
    * Provides the customer-specified description for this DB parameter group.
    */
  var Description: js.UndefOr[String] = js.native
}
object DBParameterGroup {
  
  @scala.inline
  def apply(): DBParameterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBParameterGroup]
  }
  
  @scala.inline
  implicit class DBParameterGroupMutableBuilder[Self <: DBParameterGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBParameterGroupArn(value: String): Self = StObject.set(x, "DBParameterGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBParameterGroupArnUndefined: Self = StObject.set(x, "DBParameterGroupArn", js.undefined)
    
    @scala.inline
    def setDBParameterGroupFamily(value: String): Self = StObject.set(x, "DBParameterGroupFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBParameterGroupFamilyUndefined: Self = StObject.set(x, "DBParameterGroupFamily", js.undefined)
    
    @scala.inline
    def setDBParameterGroupName(value: String): Self = StObject.set(x, "DBParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBParameterGroupNameUndefined: Self = StObject.set(x, "DBParameterGroupName", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}
