package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityPersonaConfiguration extends StObject {
  
  /**
    * The identifier of a user or group in your Amazon Web Services SSO identity source. For example, a user ID could be an email.
    */
  var EntityId: typings.awsSdk.kendraMod.EntityId
  
  /**
    * The persona that defines the specific permissions of the user or group in your Amazon Web Services SSO identity source. The available personas or access roles are Owner and Viewer. For more information on these personas, see Providing access to your search page.
    */
  var Persona: typings.awsSdk.kendraMod.Persona
}
object EntityPersonaConfiguration {
  
  inline def apply(EntityId: EntityId, Persona: Persona): EntityPersonaConfiguration = {
    val __obj = js.Dynamic.literal(EntityId = EntityId.asInstanceOf[js.Any], Persona = Persona.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityPersonaConfiguration]
  }
  
  extension [Self <: EntityPersonaConfiguration](x: Self) {
    
    inline def setEntityId(value: EntityId): Self = StObject.set(x, "EntityId", value.asInstanceOf[js.Any])
    
    inline def setPersona(value: Persona): Self = StObject.set(x, "Persona", value.asInstanceOf[js.Any])
  }
}
