package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupSummary extends StObject {
  
  /**
    * The ARN of the group.
    */
  var Arn: js.UndefOr[GroupArn] = js.undefined
  
  /**
    * The unique ID of the group.
    */
  var Id: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the group.
    */
  var Name: js.UndefOr[GroupName] = js.undefined
}
object GroupSummary {
  
  inline def apply(): GroupSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupSummary]
  }
  
  extension [Self <: GroupSummary](x: Self) {
    
    inline def setArn(value: GroupArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: GroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
