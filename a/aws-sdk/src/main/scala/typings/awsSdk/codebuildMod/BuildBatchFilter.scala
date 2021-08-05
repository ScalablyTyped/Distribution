package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBatchFilter extends StObject {
  
  /**
    * The status of the batch builds to retrieve. Only batch builds that have this status will be retrieved.
    */
  var status: js.UndefOr[StatusType] = js.undefined
}
object BuildBatchFilter {
  
  inline def apply(): BuildBatchFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBatchFilter]
  }
  
  extension [Self <: BuildBatchFilter](x: Self) {
    
    inline def setStatus(value: StatusType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
