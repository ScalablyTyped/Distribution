package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserDefinedFunction extends StObject {
  
  /**
    * The ID of the Data Catalog in which the function resides.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The Java class that contains the function code.
    */
  var ClassName: js.UndefOr[NameString] = js.undefined
  
  /**
    * The time at which the function was created.
    */
  var CreateTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The name of the catalog database that contains the function.
    */
  var DatabaseName: js.UndefOr[NameString] = js.undefined
  
  /**
    * The name of the function.
    */
  var FunctionName: js.UndefOr[NameString] = js.undefined
  
  /**
    * The owner of the function.
    */
  var OwnerName: js.UndefOr[NameString] = js.undefined
  
  /**
    * The owner type.
    */
  var OwnerType: js.UndefOr[PrincipalType] = js.undefined
  
  /**
    * The resource URIs for the function.
    */
  var ResourceUris: js.UndefOr[ResourceUriList] = js.undefined
}
object UserDefinedFunction {
  
  inline def apply(): UserDefinedFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserDefinedFunction]
  }
  
  extension [Self <: UserDefinedFunction](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setClassName(value: NameString): Self = StObject.set(x, "ClassName", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "ClassName", js.undefined)
    
    inline def setCreateTime(value: Timestamp): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    inline def setFunctionName(value: NameString): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    inline def setFunctionNameUndefined: Self = StObject.set(x, "FunctionName", js.undefined)
    
    inline def setOwnerName(value: NameString): Self = StObject.set(x, "OwnerName", value.asInstanceOf[js.Any])
    
    inline def setOwnerNameUndefined: Self = StObject.set(x, "OwnerName", js.undefined)
    
    inline def setOwnerType(value: PrincipalType): Self = StObject.set(x, "OwnerType", value.asInstanceOf[js.Any])
    
    inline def setOwnerTypeUndefined: Self = StObject.set(x, "OwnerType", js.undefined)
    
    inline def setResourceUris(value: ResourceUriList): Self = StObject.set(x, "ResourceUris", value.asInstanceOf[js.Any])
    
    inline def setResourceUrisUndefined: Self = StObject.set(x, "ResourceUris", js.undefined)
    
    inline def setResourceUrisVarargs(value: ResourceUri*): Self = StObject.set(x, "ResourceUris", js.Array(value :_*))
  }
}
