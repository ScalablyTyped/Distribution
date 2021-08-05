package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestRepositoryTriggersInput extends StObject {
  
  /**
    * The name of the repository in which to test the triggers.
    */
  var repositoryName: RepositoryName
  
  /**
    * The list of triggers to test.
    */
  var triggers: RepositoryTriggersList
}
object TestRepositoryTriggersInput {
  
  inline def apply(repositoryName: RepositoryName, triggers: RepositoryTriggersList): TestRepositoryTriggersInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRepositoryTriggersInput]
  }
  
  extension [Self <: TestRepositoryTriggersInput](x: Self) {
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setTriggers(value: RepositoryTriggersList): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
    
    inline def setTriggersVarargs(value: RepositoryTrigger*): Self = StObject.set(x, "triggers", js.Array(value :_*))
  }
}
