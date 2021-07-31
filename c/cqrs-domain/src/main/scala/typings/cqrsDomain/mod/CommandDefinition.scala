package typings.cqrsDomain.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// endregion
// region Domain itself
trait CommandDefinition extends StObject {
  
  /**
    * optional, only makes sense if aggregates with names are defined in the 'domainPath' structure
    */
  var aggregate: js.UndefOr[String] = js.undefined
  
  /**
    * optional, default is 'aggregate.id'
    * if an aggregate id is not defined in the command, the command handler will create a new aggregate instance
    */
  var aggregateId: js.UndefOr[String] = js.undefined
  
  /**
    * optional, only makes sense if contexts are defined in the 'domainPath' structure
    */
  var context: js.UndefOr[String] = js.undefined
  
  /**
    * optional, default is 'id'
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * optional, if defined theses values will be copied to the event (can be used to transport information like userId, etc..)
    */
  var meta: js.UndefOr[String] = js.undefined
  
  /**
    * optional, default is 'name'
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * optional, but recommended
    */
  var payload: js.UndefOr[String] = js.undefined
  
  /**
    * optional, if defined the command handler will check if the command can be handled
    * if you want the command to be handled in a secure/transactional way pass a revision value that matches the current aggregate revision
    */
  var revision: js.UndefOr[String] = js.undefined
  
  /**
    * optional, if defined the command handler will search for a handle that matches command name and version number
    */
  var version: js.UndefOr[String] = js.undefined
}
object CommandDefinition {
  
  @scala.inline
  def apply(): CommandDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommandDefinition]
  }
  
  @scala.inline
  implicit class CommandDefinitionMutableBuilder[Self <: CommandDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregate(value: String): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateId(value: String): Self = StObject.set(x, "aggregateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateIdUndefined: Self = StObject.set(x, "aggregateId", js.undefined)
    
    @scala.inline
    def setAggregateUndefined: Self = StObject.set(x, "aggregate", js.undefined)
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMeta(value: String): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
