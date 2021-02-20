package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Report extends StObject {
  
  var report: String = js.native
  
  var skinned: Boolean = js.native
  
  var valid: Boolean = js.native
}
object Report {
  
  @scala.inline
  def apply(report: String, skinned: Boolean, valid: Boolean): Report = {
    val __obj = js.Dynamic.literal(report = report.asInstanceOf[js.Any], skinned = skinned.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Report]
  }
  
  @scala.inline
  implicit class ReportMutableBuilder[Self <: Report] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReport(value: String): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkinned(value: Boolean): Self = StObject.set(x, "skinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
