package typings.cqrsDomain.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandleMetaInfos extends StObject {
  
  var aggregate: String
  
  var aggregateId: String
  
  var context: String
}
object HandleMetaInfos {
  
  @scala.inline
  def apply(aggregate: String, aggregateId: String, context: String): HandleMetaInfos = {
    val __obj = js.Dynamic.literal(aggregate = aggregate.asInstanceOf[js.Any], aggregateId = aggregateId.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleMetaInfos]
  }
  
  @scala.inline
  implicit class HandleMetaInfosMutableBuilder[Self <: HandleMetaInfos] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregate(value: String): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateId(value: String): Self = StObject.set(x, "aggregateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
  }
}
