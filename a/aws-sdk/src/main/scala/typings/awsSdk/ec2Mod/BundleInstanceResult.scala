package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BundleInstanceResult extends StObject {
  
  /**
    * Information about the bundle task.
    */
  var BundleTask: js.UndefOr[typings.awsSdk.ec2Mod.BundleTask] = js.native
}
object BundleInstanceResult {
  
  @scala.inline
  def apply(): BundleInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BundleInstanceResult]
  }
  
  @scala.inline
  implicit class BundleInstanceResultMutableBuilder[Self <: BundleInstanceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundleTask(value: BundleTask): Self = StObject.set(x, "BundleTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleTaskUndefined: Self = StObject.set(x, "BundleTask", js.undefined)
  }
}
