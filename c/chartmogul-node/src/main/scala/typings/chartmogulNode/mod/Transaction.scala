package typings.chartmogulNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Transaction {
  
  @JSImport("chartmogul-node", "Transaction")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(config: Config, uuid: String, data: typings.chartmogulNode.mod.Transaction.Transaction): js.Promise[typings.chartmogulNode.mod.Transaction.Transaction] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.chartmogulNode.mod.Transaction.Transaction]]
  
  trait Transaction extends StObject {
    
    var date: String
    
    var external_id: js.UndefOr[String] = js.undefined
    
    var result: String
    
    var `type`: String
    
    var uuid: js.UndefOr[String] = js.undefined
  }
  object Transaction {
    
    @scala.inline
    def apply(date: String, result: String, `type`: String): typings.chartmogulNode.mod.Transaction.Transaction = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.chartmogulNode.mod.Transaction.Transaction]
    }
    
    @scala.inline
    implicit class TransactionMutableBuilder[Self <: typings.chartmogulNode.mod.Transaction.Transaction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
      
      @scala.inline
      def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    }
  }
}
