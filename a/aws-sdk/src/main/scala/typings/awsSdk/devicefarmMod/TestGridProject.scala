package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestGridProject extends StObject {
  
  /**
    * The ARN for the project.
    */
  var arn: js.UndefOr[DeviceFarmArn] = js.undefined
  
  /**
    * When the project was created.
    */
  var created: js.UndefOr[DateTime] = js.undefined
  
  /**
    * A human-readable description for the project.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A human-readable name for the project.
    */
  var name: js.UndefOr[String] = js.undefined
}
object TestGridProject {
  
  inline def apply(): TestGridProject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestGridProject]
  }
  
  extension [Self <: TestGridProject](x: Self) {
    
    inline def setArn(value: DeviceFarmArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreated(value: DateTime): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
