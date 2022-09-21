package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstancePatchStatesResult extends StObject {
  
  /**
    * The high-level patch state for the requested managed nodes.
    */
  var InstancePatchStates: js.UndefOr[InstancePatchStateList] = js.undefined
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
}
object DescribeInstancePatchStatesResult {
  
  inline def apply(): DescribeInstancePatchStatesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstancePatchStatesResult]
  }
  
  extension [Self <: DescribeInstancePatchStatesResult](x: Self) {
    
    inline def setInstancePatchStates(value: InstancePatchStateList): Self = StObject.set(x, "InstancePatchStates", value.asInstanceOf[js.Any])
    
    inline def setInstancePatchStatesUndefined: Self = StObject.set(x, "InstancePatchStates", js.undefined)
    
    inline def setInstancePatchStatesVarargs(value: InstancePatchState*): Self = StObject.set(x, "InstancePatchStates", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
