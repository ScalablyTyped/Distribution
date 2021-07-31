package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTestGridProjectResult extends StObject {
  
  /**
    * The project, including updated information.
    */
  var testGridProject: js.UndefOr[TestGridProject] = js.undefined
}
object UpdateTestGridProjectResult {
  
  @scala.inline
  def apply(): UpdateTestGridProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTestGridProjectResult]
  }
  
  @scala.inline
  implicit class UpdateTestGridProjectResultMutableBuilder[Self <: UpdateTestGridProjectResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTestGridProject(value: TestGridProject): Self = StObject.set(x, "testGridProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestGridProjectUndefined: Self = StObject.set(x, "testGridProject", js.undefined)
  }
}
