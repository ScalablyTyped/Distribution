package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetBuildsInput extends StObject {
  
  /**
    * The IDs of the builds.
    */
  var ids: BuildIds = js.native
}
object BatchGetBuildsInput {
  
  @scala.inline
  def apply(ids: BuildIds): BatchGetBuildsInput = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetBuildsInput]
  }
  
  @scala.inline
  implicit class BatchGetBuildsInputMutableBuilder[Self <: BatchGetBuildsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIds(value: BuildIds): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "ids", js.Array(value :_*))
  }
}
