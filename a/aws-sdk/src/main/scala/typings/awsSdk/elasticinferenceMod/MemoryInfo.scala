package typings.awsSdk.elasticinferenceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemoryInfo extends StObject {
  
  /**
    *  The size in mebibytes of the Elastic Inference Accelerator type. 
    */
  var sizeInMiB: js.UndefOr[Integer] = js.native
}
object MemoryInfo {
  
  @scala.inline
  def apply(): MemoryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemoryInfo]
  }
  
  @scala.inline
  implicit class MemoryInfoMutableBuilder[Self <: MemoryInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSizeInMiB(value: Integer): Self = StObject.set(x, "sizeInMiB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeInMiBUndefined: Self = StObject.set(x, "sizeInMiB", js.undefined)
  }
}
