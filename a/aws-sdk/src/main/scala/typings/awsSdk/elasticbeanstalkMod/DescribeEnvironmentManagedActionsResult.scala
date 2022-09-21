package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEnvironmentManagedActionsResult extends StObject {
  
  /**
    * A list of upcoming and in-progress managed actions.
    */
  var ManagedActions: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ManagedActions] = js.undefined
}
object DescribeEnvironmentManagedActionsResult {
  
  inline def apply(): DescribeEnvironmentManagedActionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEnvironmentManagedActionsResult]
  }
  
  extension [Self <: DescribeEnvironmentManagedActionsResult](x: Self) {
    
    inline def setManagedActions(value: ManagedActions): Self = StObject.set(x, "ManagedActions", value.asInstanceOf[js.Any])
    
    inline def setManagedActionsUndefined: Self = StObject.set(x, "ManagedActions", js.undefined)
    
    inline def setManagedActionsVarargs(value: ManagedAction*): Self = StObject.set(x, "ManagedActions", js.Array(value*))
  }
}
