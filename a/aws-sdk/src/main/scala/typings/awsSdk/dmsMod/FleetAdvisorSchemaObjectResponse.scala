package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetAdvisorSchemaObjectResponse extends StObject {
  
  /**
    * The number of lines of code in a schema object in a Fleet Advisor collector inventory.
    */
  var CodeLineCount: js.UndefOr[LongOptional] = js.undefined
  
  /**
    * The size level of the code in a schema object in a Fleet Advisor collector inventory.
    */
  var CodeSize: js.UndefOr[LongOptional] = js.undefined
  
  /**
    * The number of objects in a schema object in a Fleet Advisor collector inventory.
    */
  var NumberOfObjects: js.UndefOr[LongOptional] = js.undefined
  
  /**
    * The type of the schema object, as reported by the database engine. Examples include the following:    function     trigger     SYSTEM_TABLE     QUEUE   
    */
  var ObjectType: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of a schema object in a Fleet Advisor collector inventory.
    */
  var SchemaId: js.UndefOr[String] = js.undefined
}
object FleetAdvisorSchemaObjectResponse {
  
  inline def apply(): FleetAdvisorSchemaObjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetAdvisorSchemaObjectResponse]
  }
  
  extension [Self <: FleetAdvisorSchemaObjectResponse](x: Self) {
    
    inline def setCodeLineCount(value: LongOptional): Self = StObject.set(x, "CodeLineCount", value.asInstanceOf[js.Any])
    
    inline def setCodeLineCountUndefined: Self = StObject.set(x, "CodeLineCount", js.undefined)
    
    inline def setCodeSize(value: LongOptional): Self = StObject.set(x, "CodeSize", value.asInstanceOf[js.Any])
    
    inline def setCodeSizeUndefined: Self = StObject.set(x, "CodeSize", js.undefined)
    
    inline def setNumberOfObjects(value: LongOptional): Self = StObject.set(x, "NumberOfObjects", value.asInstanceOf[js.Any])
    
    inline def setNumberOfObjectsUndefined: Self = StObject.set(x, "NumberOfObjects", js.undefined)
    
    inline def setObjectType(value: String): Self = StObject.set(x, "ObjectType", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeUndefined: Self = StObject.set(x, "ObjectType", js.undefined)
    
    inline def setSchemaId(value: String): Self = StObject.set(x, "SchemaId", value.asInstanceOf[js.Any])
    
    inline def setSchemaIdUndefined: Self = StObject.set(x, "SchemaId", js.undefined)
  }
}
