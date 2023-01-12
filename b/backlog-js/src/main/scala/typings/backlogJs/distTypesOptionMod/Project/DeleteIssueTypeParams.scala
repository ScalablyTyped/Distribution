package typings.backlogJs.distTypesOptionMod.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIssueTypeParams extends StObject {
  
  var substituteIssueTypeId: Double
}
object DeleteIssueTypeParams {
  
  inline def apply(substituteIssueTypeId: Double): DeleteIssueTypeParams = {
    val __obj = js.Dynamic.literal(substituteIssueTypeId = substituteIssueTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIssueTypeParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteIssueTypeParams] (val x: Self) extends AnyVal {
    
    inline def setSubstituteIssueTypeId(value: Double): Self = StObject.set(x, "substituteIssueTypeId", value.asInstanceOf[js.Any])
  }
}
