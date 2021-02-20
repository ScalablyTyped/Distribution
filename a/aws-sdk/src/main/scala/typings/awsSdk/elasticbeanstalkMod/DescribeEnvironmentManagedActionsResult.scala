package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEnvironmentManagedActionsResult extends StObject {
  
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
  implicit class DescribeEnvironmentManagedActionsResultMutableBuilder[Self <: DescribeEnvironmentManagedActionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManagedActions(value: ManagedActions): Self = StObject.set(x, "ManagedActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedActionsUndefined: Self = StObject.set(x, "ManagedActions", js.undefined)
    
    @scala.inline
    def setManagedActionsVarargs(value: ManagedAction*): Self = StObject.set(x, "ManagedActions", js.Array(value :_*))
  }
}
