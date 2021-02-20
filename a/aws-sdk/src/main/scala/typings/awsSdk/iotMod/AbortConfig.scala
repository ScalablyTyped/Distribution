package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbortConfig extends StObject {
  
  /**
    * The list of criteria that determine when and how to abort the job.
    */
  var criteriaList: AbortCriteriaList = js.native
}
object AbortConfig {
  
  @scala.inline
  def apply(criteriaList: AbortCriteriaList): AbortConfig = {
    val __obj = js.Dynamic.literal(criteriaList = criteriaList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortConfig]
  }
  
  @scala.inline
  implicit class AbortConfigMutableBuilder[Self <: AbortConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCriteriaList(value: AbortCriteriaList): Self = StObject.set(x, "criteriaList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriteriaListVarargs(value: AbortCriteria*): Self = StObject.set(x, "criteriaList", js.Array(value :_*))
  }
}
