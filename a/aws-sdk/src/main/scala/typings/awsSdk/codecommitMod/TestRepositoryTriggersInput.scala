package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestRepositoryTriggersInput extends StObject {
  
  /**
    * The name of the repository in which to test the triggers.
    */
  var repositoryName: RepositoryName = js.native
  
  /**
    * The list of triggers to test.
    */
  var triggers: RepositoryTriggersList = js.native
}
object TestRepositoryTriggersInput {
  
  @scala.inline
  def apply(repositoryName: RepositoryName, triggers: RepositoryTriggersList): TestRepositoryTriggersInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRepositoryTriggersInput]
  }
  
  @scala.inline
  implicit class TestRepositoryTriggersInputMutableBuilder[Self <: TestRepositoryTriggersInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggers(value: RepositoryTriggersList): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggersVarargs(value: RepositoryTrigger*): Self = StObject.set(x, "triggers", js.Array(value :_*))
  }
}
