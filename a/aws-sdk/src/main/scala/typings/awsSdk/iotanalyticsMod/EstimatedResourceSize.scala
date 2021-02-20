package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EstimatedResourceSize extends StObject {
  
  /**
    * The time when the estimate of the size of the resource was made.
    */
  var estimatedOn: js.UndefOr[Timestamp] = js.native
  
  /**
    * The estimated size of the resource, in bytes.
    */
  var estimatedSizeInBytes: js.UndefOr[SizeInBytes] = js.native
}
object EstimatedResourceSize {
  
  @scala.inline
  def apply(): EstimatedResourceSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EstimatedResourceSize]
  }
  
  @scala.inline
  implicit class EstimatedResourceSizeMutableBuilder[Self <: EstimatedResourceSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEstimatedOn(value: Timestamp): Self = StObject.set(x, "estimatedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedOnUndefined: Self = StObject.set(x, "estimatedOn", js.undefined)
    
    @scala.inline
    def setEstimatedSizeInBytes(value: SizeInBytes): Self = StObject.set(x, "estimatedSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedSizeInBytesUndefined: Self = StObject.set(x, "estimatedSizeInBytes", js.undefined)
  }
}
