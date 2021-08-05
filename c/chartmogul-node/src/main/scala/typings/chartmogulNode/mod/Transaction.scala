package typings.chartmogulNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Transaction {
  
  @JSImport("chartmogul-node", "Transaction")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(config: Config, uuid: String, data: typings.chartmogulNode.mod.Transaction.Transaction): js.Promise[typings.chartmogulNode.mod.Transaction.Transaction] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.chartmogulNode.mod.Transaction.Transaction]]
  
  trait Transaction extends StObject {
    
    var date: String
    
    var external_id: js.UndefOr[String] = js.undefined
    
    var result: String
    
    var `type`: String
    
    var uuid: js.UndefOr[String] = js.undefined
  }
  object Transaction {
    
    inline def apply(date: String, result: String, `type`: String): typings.chartmogulNode.mod.Transaction.Transaction = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.chartmogulNode.mod.Transaction.Transaction]
    }
    
    extension [Self <: typings.chartmogulNode.mod.Transaction.Transaction](x: Self) {
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      inline def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
      
      inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    }
  }
}
