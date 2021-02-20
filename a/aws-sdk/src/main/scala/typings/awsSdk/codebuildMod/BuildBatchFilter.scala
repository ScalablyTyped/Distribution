package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBatchFilter extends StObject {
  
  /**
    * The status of the batch builds to retrieve. Only batch builds that have this status will be retrieved.
    */
  var status: js.UndefOr[StatusType] = js.native
}
object BuildBatchFilter {
  
  @scala.inline
  def apply(): BuildBatchFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBatchFilter]
  }
  
  @scala.inline
  implicit class BuildBatchFilterMutableBuilder[Self <: BuildBatchFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: StatusType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
