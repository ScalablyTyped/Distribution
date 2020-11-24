package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserDefinedFunction extends js.Object {
  
  /**
    * The ID of the Data Catalog in which the function resides.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * The Java class that contains the function code.
    */
  var ClassName: js.UndefOr[NameString] = js.native
  
  /**
    * The time at which the function was created.
    */
  var CreateTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the catalog database that contains the function.
    */
  var DatabaseName: js.UndefOr[NameString] = js.native
  
  /**
    * The name of the function.
    */
  var FunctionName: js.UndefOr[NameString] = js.native
  
  /**
    * The owner of the function.
    */
  var OwnerName: js.UndefOr[NameString] = js.native
  
  /**
    * The owner type.
    */
  var OwnerType: js.UndefOr[PrincipalType] = js.native
  
  /**
    * The resource URIs for the function.
    */
  var ResourceUris: js.UndefOr[ResourceUriList] = js.native
}
object UserDefinedFunction {
  
  @scala.inline
  def apply(): UserDefinedFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserDefinedFunction]
  }
  
  @scala.inline
  implicit class UserDefinedFunctionOps[Self <: UserDefinedFunction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
    
    @scala.inline
    def setClassName(value: NameString): Self = this.set("ClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("ClassName", js.undefined)
    
    @scala.inline
    def setCreateTime(value: Timestamp): Self = this.set("CreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("CreateTime", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: NameString): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseName: Self = this.set("DatabaseName", js.undefined)
    
    @scala.inline
    def setFunctionName(value: NameString): Self = this.set("FunctionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctionName: Self = this.set("FunctionName", js.undefined)
    
    @scala.inline
    def setOwnerName(value: NameString): Self = this.set("OwnerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerName: Self = this.set("OwnerName", js.undefined)
    
    @scala.inline
    def setOwnerType(value: PrincipalType): Self = this.set("OwnerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerType: Self = this.set("OwnerType", js.undefined)
    
    @scala.inline
    def setResourceUrisVarargs(value: ResourceUri*): Self = this.set("ResourceUris", js.Array(value :_*))
    
    @scala.inline
    def setResourceUris(value: ResourceUriList): Self = this.set("ResourceUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceUris: Self = this.set("ResourceUris", js.undefined)
  }
}
