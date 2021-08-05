package typings.cqrsDomain.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventDefinition extends StObject {
  
  /**
    * optional, only makes sense if aggregates with names are defined in the 'domainPath' structure
    */
  var aggregate: js.UndefOr[String] = js.undefined
  
  /**
    * optional, default is 'aggregate.id'
    */
  var aggregateId: js.UndefOr[String] = js.undefined
  
  /**
    * optional, if defined the commit date of the eventstore will be saved in this value
    */
  var commitStamp: js.UndefOr[String] = js.undefined
  
  /**
    * optional, only makes sense if contexts are defined in the 'domainPath' structure
    */
  var context: js.UndefOr[String] = js.undefined
  
  /**
    * optional, default is 'correlationId'
    * will use the command id as correlationId, so you can match it in the sender
    */
  var correlationId: js.UndefOr[String] = js.undefined
  
  /**
    * optional, default is 'id'
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * optional, if defined the values of the command will be copied to the event (can be used to transport information like userId, etc..)
    */
  var meta: js.UndefOr[String] = js.undefined
  
  /**
    * optional, default is 'name'
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * optional, default is 'payload'
    */
  var payload: js.UndefOr[String] = js.undefined
  
  /**
    * optional, default is 'revision'
    * will represent the aggregate revision, can be used in next command
    */
  var revision: js.UndefOr[String] = js.undefined
  
  /**
    * optional
    */
  var version: js.UndefOr[String] = js.undefined
}
object EventDefinition {
  
  inline def apply(): EventDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventDefinition]
  }
  
  extension [Self <: EventDefinition](x: Self) {
    
    inline def setAggregate(value: String): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    inline def setAggregateId(value: String): Self = StObject.set(x, "aggregateId", value.asInstanceOf[js.Any])
    
    inline def setAggregateIdUndefined: Self = StObject.set(x, "aggregateId", js.undefined)
    
    inline def setAggregateUndefined: Self = StObject.set(x, "aggregate", js.undefined)
    
    inline def setCommitStamp(value: String): Self = StObject.set(x, "commitStamp", value.asInstanceOf[js.Any])
    
    inline def setCommitStampUndefined: Self = StObject.set(x, "commitStamp", js.undefined)
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
    
    inline def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMeta(value: String): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
