package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListOnPremisesInstancesOutput extends StObject {
  
  /**
    * The list of matching on-premises instance names.
    */
  var instanceNames: js.UndefOr[InstanceNameList] = js.native
  
  /**
    * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list on-premises instances call to return the next set of on-premises instances in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListOnPremisesInstancesOutput {
  
  @scala.inline
  def apply(): ListOnPremisesInstancesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOnPremisesInstancesOutput]
  }
  
  @scala.inline
  implicit class ListOnPremisesInstancesOutputMutableBuilder[Self <: ListOnPremisesInstancesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceNames(value: InstanceNameList): Self = StObject.set(x, "instanceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceNamesUndefined: Self = StObject.set(x, "instanceNames", js.undefined)
    
    @scala.inline
    def setInstanceNamesVarargs(value: InstanceName*): Self = StObject.set(x, "instanceNames", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
