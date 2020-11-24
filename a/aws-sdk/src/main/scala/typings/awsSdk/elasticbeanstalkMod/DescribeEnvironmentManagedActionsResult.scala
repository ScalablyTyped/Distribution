package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEnvironmentManagedActionsResult extends js.Object {
  
  /**
    * A list of upcoming and in-progress managed actions.
    */
  var ManagedActions: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ManagedActions] = js.native
}
object DescribeEnvironmentManagedActionsResult {
  
  @scala.inline
  def apply(): DescribeEnvironmentManagedActionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEnvironmentManagedActionsResult]
  }
  
  @scala.inline
  implicit class DescribeEnvironmentManagedActionsResultOps[Self <: DescribeEnvironmentManagedActionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setManagedActionsVarargs(value: ManagedAction*): Self = this.set("ManagedActions", js.Array(value :_*))
    
    @scala.inline
    def setManagedActions(value: ManagedActions): Self = this.set("ManagedActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedActions: Self = this.set("ManagedActions", js.undefined)
  }
}
