package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRepositoryTriggersOutput extends StObject {
  
  /**
    * The system-generated unique ID for the create or update operation.
    */
  var configurationId: js.UndefOr[RepositoryTriggersConfigurationId] = js.undefined
}
object PutRepositoryTriggersOutput {
  
  @scala.inline
  def apply(): PutRepositoryTriggersOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutRepositoryTriggersOutput]
  }
  
  @scala.inline
  implicit class PutRepositoryTriggersOutputMutableBuilder[Self <: PutRepositoryTriggersOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationId(value: RepositoryTriggersConfigurationId): Self = StObject.set(x, "configurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationIdUndefined: Self = StObject.set(x, "configurationId", js.undefined)
  }
}
