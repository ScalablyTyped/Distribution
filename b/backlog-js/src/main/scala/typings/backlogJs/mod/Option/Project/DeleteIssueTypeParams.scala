package typings.backlogJs.mod.Option.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIssueTypeParams extends StObject {
  
  var substituteIssueTypeId: Double
}
object DeleteIssueTypeParams {
  
  @scala.inline
  def apply(substituteIssueTypeId: Double): DeleteIssueTypeParams = {
    val __obj = js.Dynamic.literal(substituteIssueTypeId = substituteIssueTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIssueTypeParams]
  }
  
  @scala.inline
  implicit class DeleteIssueTypeParamsMutableBuilder[Self <: DeleteIssueTypeParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubstituteIssueTypeId(value: Double): Self = StObject.set(x, "substituteIssueTypeId", value.asInstanceOf[js.Any])
  }
}
