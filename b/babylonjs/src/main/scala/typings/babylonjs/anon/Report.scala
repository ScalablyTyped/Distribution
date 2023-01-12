package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Report extends StObject {
  
  var report: String
  
  var skinned: Boolean
  
  var valid: Boolean
}
object Report {
  
  inline def apply(report: String, skinned: Boolean, valid: Boolean): Report = {
    val __obj = js.Dynamic.literal(report = report.asInstanceOf[js.Any], skinned = skinned.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Report]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Report] (val x: Self) extends AnyVal {
    
    inline def setReport(value: String): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
    
    inline def setSkinned(value: Boolean): Self = StObject.set(x, "skinned", value.asInstanceOf[js.Any])
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
