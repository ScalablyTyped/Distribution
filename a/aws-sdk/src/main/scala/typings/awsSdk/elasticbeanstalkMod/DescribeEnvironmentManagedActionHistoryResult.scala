package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEnvironmentManagedActionHistoryResult extends StObject {
  
  /**
    * A list of completed and failed managed actions.
    */
  var ManagedActionHistoryItems: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ManagedActionHistoryItems] = js.native
  
  /**
    * A pagination token that you pass to DescribeEnvironmentManagedActionHistory to get the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeEnvironmentManagedActionHistoryResult {
  
  @scala.inline
  def apply(): DescribeEnvironmentManagedActionHistoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEnvironmentManagedActionHistoryResult]
  }
  
  @scala.inline
  implicit class DescribeEnvironmentManagedActionHistoryResultMutableBuilder[Self <: DescribeEnvironmentManagedActionHistoryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManagedActionHistoryItems(value: ManagedActionHistoryItems): Self = StObject.set(x, "ManagedActionHistoryItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedActionHistoryItemsUndefined: Self = StObject.set(x, "ManagedActionHistoryItems", js.undefined)
    
    @scala.inline
    def setManagedActionHistoryItemsVarargs(value: ManagedActionHistoryItem*): Self = StObject.set(x, "ManagedActionHistoryItems", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
