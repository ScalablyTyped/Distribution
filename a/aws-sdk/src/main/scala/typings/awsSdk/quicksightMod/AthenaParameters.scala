package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AthenaParameters extends StObject {
  
  /**
    * The workgroup that Amazon Athena uses.
    */
  var WorkGroup: js.UndefOr[typings.awsSdk.quicksightMod.WorkGroup] = js.undefined
}
object AthenaParameters {
  
  inline def apply(): AthenaParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AthenaParameters]
  }
  
  extension [Self <: AthenaParameters](x: Self) {
    
    inline def setWorkGroup(value: WorkGroup): Self = StObject.set(x, "WorkGroup", value.asInstanceOf[js.Any])
    
    inline def setWorkGroupUndefined: Self = StObject.set(x, "WorkGroup", js.undefined)
  }
}
