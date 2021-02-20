package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchPermissionsRequestEntry extends StObject {
  
  /**
    * A unique identifier for the batch permissions request entry.
    */
  var Id: Identifier = js.native
  
  /**
    * The permissions to be granted.
    */
  var Permissions: js.UndefOr[PermissionList] = js.native
  
  /**
    * Indicates if the option to pass permissions is granted.
    */
  var PermissionsWithGrantOption: js.UndefOr[PermissionList] = js.native
  
  /**
    * The principal to be granted a permission.
    */
  var Principal: js.UndefOr[DataLakePrincipal] = js.native
  
  /**
    * The resource to which the principal is to be granted a permission.
    */
  var Resource: js.UndefOr[typings.awsSdk.lakeformationMod.Resource] = js.native
}
object BatchPermissionsRequestEntry {
  
  @scala.inline
  def apply(Id: Identifier): BatchPermissionsRequestEntry = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPermissionsRequestEntry]
  }
  
  @scala.inline
  implicit class BatchPermissionsRequestEntryMutableBuilder[Self <: BatchPermissionsRequestEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Identifier): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: PermissionList): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "Permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: Permission*): Self = StObject.set(x, "Permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissionsWithGrantOption(value: PermissionList): Self = StObject.set(x, "PermissionsWithGrantOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsWithGrantOptionUndefined: Self = StObject.set(x, "PermissionsWithGrantOption", js.undefined)
    
    @scala.inline
    def setPermissionsWithGrantOptionVarargs(value: Permission*): Self = StObject.set(x, "PermissionsWithGrantOption", js.Array(value :_*))
    
    @scala.inline
    def setPrincipal(value: DataLakePrincipal): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalUndefined: Self = StObject.set(x, "Principal", js.undefined)
    
    @scala.inline
    def setResource(value: Resource): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "Resource", js.undefined)
  }
}
