package typings.backlogJs.mod.Option.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchIssueTypeParams extends StObject {
  
  var color: js.UndefOr[IssueTypeColor] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object PatchIssueTypeParams {
  
  @scala.inline
  def apply(): PatchIssueTypeParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchIssueTypeParams]
  }
  
  @scala.inline
  implicit class PatchIssueTypeParamsMutableBuilder[Self <: PatchIssueTypeParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: IssueTypeColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
