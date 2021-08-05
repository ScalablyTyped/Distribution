package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HierarchyLevel extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the hierarchy level.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier of the hierarchy level.
    */
  var Id: js.UndefOr[HierarchyLevelId] = js.undefined
  
  /**
    * The name of the hierarchy level.
    */
  var Name: js.UndefOr[HierarchyLevelName] = js.undefined
}
object HierarchyLevel {
  
  inline def apply(): HierarchyLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchyLevel]
  }
  
  extension [Self <: HierarchyLevel](x: Self) {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: HierarchyLevelId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: HierarchyLevelName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
