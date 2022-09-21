package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddonIssue extends StObject {
  
  /**
    * A code that describes the type of issue.
    */
  var code: js.UndefOr[AddonIssueCode] = js.undefined
  
  /**
    * A message that provides details about the issue and what might cause it.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * The resource IDs of the issue.
    */
  var resourceIds: js.UndefOr[StringList] = js.undefined
}
object AddonIssue {
  
  inline def apply(): AddonIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddonIssue]
  }
  
  extension [Self <: AddonIssue](x: Self) {
    
    inline def setCode(value: AddonIssueCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setResourceIds(value: StringList): Self = StObject.set(x, "resourceIds", value.asInstanceOf[js.Any])
    
    inline def setResourceIdsUndefined: Self = StObject.set(x, "resourceIds", js.undefined)
    
    inline def setResourceIdsVarargs(value: String*): Self = StObject.set(x, "resourceIds", js.Array(value*))
  }
}
