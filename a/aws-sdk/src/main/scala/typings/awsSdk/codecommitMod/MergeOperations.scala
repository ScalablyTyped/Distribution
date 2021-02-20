package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MergeOperations extends StObject {
  
  /**
    * The operation on a file in the destination of a merge or pull request.
    */
  var destination: js.UndefOr[ChangeTypeEnum] = js.native
  
  /**
    * The operation (add, modify, or delete) on a file in the source of a merge or pull request.
    */
  var source: js.UndefOr[ChangeTypeEnum] = js.native
}
object MergeOperations {
  
  @scala.inline
  def apply(): MergeOperations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeOperations]
  }
  
  @scala.inline
  implicit class MergeOperationsMutableBuilder[Self <: MergeOperations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: ChangeTypeEnum): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setSource(value: ChangeTypeEnum): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
