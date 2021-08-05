package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStackResourceDriftsOutput extends StObject {
  
  /**
    * If the request doesn't return all of the remaining results, NextToken is set to a token. To retrieve the next set of results, call DescribeStackResourceDrifts again and assign that token to the request object's NextToken parameter. If the request returns all results, NextToken is set to null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.undefined
  
  /**
    * Drift information for the resources that have been checked for drift in the specified stack. This includes actual and expected configuration values for resources where AWS CloudFormation detects drift. For a given stack, there will be one StackResourceDrift for each stack resource that has been checked for drift. Resources that have not yet been checked for drift are not included. Resources that do not currently support drift detection are not checked, and so not included. For a list of resources that support drift detection, see Resources that Support Drift Detection.
    */
  var StackResourceDrifts: typings.awsSdk.cloudformationMod.StackResourceDrifts
}
object DescribeStackResourceDriftsOutput {
  
  inline def apply(StackResourceDrifts: StackResourceDrifts): DescribeStackResourceDriftsOutput = {
    val __obj = js.Dynamic.literal(StackResourceDrifts = StackResourceDrifts.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStackResourceDriftsOutput]
  }
  
  extension [Self <: DescribeStackResourceDriftsOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStackResourceDrifts(value: StackResourceDrifts): Self = StObject.set(x, "StackResourceDrifts", value.asInstanceOf[js.Any])
    
    inline def setStackResourceDriftsVarargs(value: StackResourceDrift*): Self = StObject.set(x, "StackResourceDrifts", js.Array(value :_*))
  }
}
