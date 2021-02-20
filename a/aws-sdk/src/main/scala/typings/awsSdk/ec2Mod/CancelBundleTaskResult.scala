package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelBundleTaskResult extends StObject {
  
  /**
    * Information about the bundle task.
    */
  var BundleTask: js.UndefOr[typings.awsSdk.ec2Mod.BundleTask] = js.native
}
object CancelBundleTaskResult {
  
  @scala.inline
  def apply(): CancelBundleTaskResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelBundleTaskResult]
  }
  
  @scala.inline
  implicit class CancelBundleTaskResultMutableBuilder[Self <: CancelBundleTaskResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundleTask(value: BundleTask): Self = StObject.set(x, "BundleTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleTaskUndefined: Self = StObject.set(x, "BundleTask", js.undefined)
  }
}
