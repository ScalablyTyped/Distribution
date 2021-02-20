package typings.chartmogulNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Transaction {
  
  @JSImport("chartmogul-node", "Transaction.create")
  @js.native
  def create(config: Config, uuid: String, data: typings.chartmogulNode.mod.Transaction.Transaction): js.Promise[typings.chartmogulNode.mod.Transaction.Transaction] = js.native
  
  @js.native
  trait Transaction extends StObject {
    
    var date: String = js.native
    
    var external_id: js.UndefOr[String] = js.native
    
    var result: String = js.native
    
    var `type`: String = js.native
    
    var uuid: js.UndefOr[String] = js.native
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
