package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBundleTasksResult extends StObject {
  
  /**
    * Information about the bundle tasks.
    */
  var BundleTasks: js.UndefOr[BundleTaskList] = js.undefined
}
object DescribeBundleTasksResult {
  
  @scala.inline
  def apply(): DescribeBundleTasksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBundleTasksResult]
  }
  
  @scala.inline
  implicit class DescribeBundleTasksResultMutableBuilder[Self <: DescribeBundleTasksResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundleTasks(value: BundleTaskList): Self = StObject.set(x, "BundleTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleTasksUndefined: Self = StObject.set(x, "BundleTasks", js.undefined)
    
    @scala.inline
    def setBundleTasksVarargs(value: BundleTask*): Self = StObject.set(x, "BundleTasks", js.Array(value :_*))
  }
}
