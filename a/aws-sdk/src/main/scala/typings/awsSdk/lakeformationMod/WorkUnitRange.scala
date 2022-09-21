package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkUnitRange extends StObject {
  
  /**
    * Defines the maximum work unit ID in the range. The maximum value is inclusive.
    */
  var WorkUnitIdMax: WorkUnitIdLong
  
  /**
    * Defines the minimum work unit ID in the range.
    */
  var WorkUnitIdMin: WorkUnitIdLong
  
  /**
    * A work token used to query the execution service.
    */
  var WorkUnitToken: WorkUnitTokenString
}
object WorkUnitRange {
  
  inline def apply(WorkUnitIdMax: WorkUnitIdLong, WorkUnitIdMin: WorkUnitIdLong, WorkUnitToken: WorkUnitTokenString): WorkUnitRange = {
    val __obj = js.Dynamic.literal(WorkUnitIdMax = WorkUnitIdMax.asInstanceOf[js.Any], WorkUnitIdMin = WorkUnitIdMin.asInstanceOf[js.Any], WorkUnitToken = WorkUnitToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkUnitRange]
  }
  
  extension [Self <: WorkUnitRange](x: Self) {
    
    inline def setWorkUnitIdMax(value: WorkUnitIdLong): Self = StObject.set(x, "WorkUnitIdMax", value.asInstanceOf[js.Any])
    
    inline def setWorkUnitIdMin(value: WorkUnitIdLong): Self = StObject.set(x, "WorkUnitIdMin", value.asInstanceOf[js.Any])
    
    inline def setWorkUnitToken(value: WorkUnitTokenString): Self = StObject.set(x, "WorkUnitToken", value.asInstanceOf[js.Any])
  }
}
