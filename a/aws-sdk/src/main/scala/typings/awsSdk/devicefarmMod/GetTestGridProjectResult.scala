package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTestGridProjectResult extends StObject {
  
  /**
    * A TestGridProject.
    */
  var testGridProject: js.UndefOr[TestGridProject] = js.undefined
}
object GetTestGridProjectResult {
  
  @scala.inline
  def apply(): GetTestGridProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTestGridProjectResult]
  }
  
  @scala.inline
  implicit class GetTestGridProjectResultMutableBuilder[Self <: GetTestGridProjectResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTestGridProject(value: TestGridProject): Self = StObject.set(x, "testGridProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestGridProjectUndefined: Self = StObject.set(x, "testGridProject", js.undefined)
  }
}
