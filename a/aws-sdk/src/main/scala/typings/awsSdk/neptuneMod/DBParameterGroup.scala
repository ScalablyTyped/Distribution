package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBParameterGroup extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the DB parameter group.
    */
  var DBParameterGroupArn: js.UndefOr[String] = js.undefined
  
  /**
    * Provides the name of the DB parameter group family that this DB parameter group is compatible with.
    */
  var DBParameterGroupFamily: js.UndefOr[String] = js.undefined
  
  /**
    * Provides the name of the DB parameter group.
    */
  var DBParameterGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * Provides the customer-specified description for this DB parameter group.
    */
  var Description: js.UndefOr[String] = js.undefined
}
object DBParameterGroup {
  
  inline def apply(): DBParameterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBParameterGroup]
  }
  
  extension [Self <: DBParameterGroup](x: Self) {
    
    inline def setDBParameterGroupArn(value: String): Self = StObject.set(x, "DBParameterGroupArn", value.asInstanceOf[js.Any])
    
    inline def setDBParameterGroupArnUndefined: Self = StObject.set(x, "DBParameterGroupArn", js.undefined)
    
    inline def setDBParameterGroupFamily(value: String): Self = StObject.set(x, "DBParameterGroupFamily", value.asInstanceOf[js.Any])
    
    inline def setDBParameterGroupFamilyUndefined: Self = StObject.set(x, "DBParameterGroupFamily", js.undefined)
    
    inline def setDBParameterGroupName(value: String): Self = StObject.set(x, "DBParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setDBParameterGroupNameUndefined: Self = StObject.set(x, "DBParameterGroupName", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}
