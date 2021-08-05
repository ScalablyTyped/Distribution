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
  
  inline def apply(): PutRepositoryTriggersOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutRepositoryTriggersOutput]
  }
  
  extension [Self <: PutRepositoryTriggersOutput](x: Self) {
    
    inline def setConfigurationId(value: RepositoryTriggersConfigurationId): Self = StObject.set(x, "configurationId", value.asInstanceOf[js.Any])
    
    inline def setConfigurationIdUndefined: Self = StObject.set(x, "configurationId", js.undefined)
  }
}
