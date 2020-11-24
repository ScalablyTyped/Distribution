package typings.clearbladejsServer

import typings.clearbladejsServer.CbServer.ClearBladeGlobal
import typings.clearbladejsServer.CbServer.ReqTypes
import typings.clearbladejsServer.CbServer.Resp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  var ClearBlade: ClearBladeGlobal = js.native
  
  @js.native
  object CbServer extends js.Object {
    
    var ClearBlade: ClearBladeGlobal = js.native
    
    var req: ReqTypes = js.native
    
    var resp: Resp = js.native
    
    @js.native
    object MessagingQOS extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.clearbladejsServer.CbServer.MessagingQOS with Double] = js.native
      
      /* 1 */ val MESSAGING_QOS_AT_LEAST_ONCE: typings.clearbladejsServer.CbServer.MessagingQOS.MESSAGING_QOS_AT_LEAST_ONCE with Double = js.native
      
      /* 0 */ val MESSAGING_QOS_AT_MOST_ONCE: typings.clearbladejsServer.CbServer.MessagingQOS.MESSAGING_QOS_AT_MOST_ONCE with Double = js.native
      
      /* 2 */ val MESSAGING_QOS_EXACTLY_ONCE: typings.clearbladejsServer.CbServer.MessagingQOS.MESSAGING_QOS_EXACTLY_ONCE with Double = js.native
    }
    
    @js.native
    object QueryConditions extends js.Object {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.clearbladejsServer.CbServer.QueryConditions with String] = js.native
      
      /* "EQ" */ val QUERY_EQUAL: typings.clearbladejsServer.CbServer.QueryConditions.QUERY_EQUAL with String = js.native
      
      /* "GT" */ val QUERY_GREATERTHAN: typings.clearbladejsServer.CbServer.QueryConditions.QUERY_GREATERTHAN with String = js.native
      
      /* "GTE" */ val QUERY_GREATERTHAN_EQUAL: typings.clearbladejsServer.CbServer.QueryConditions.QUERY_GREATERTHAN_EQUAL with String = js.native
      
      /* "LT" */ val QUERY_LESSTHAN: typings.clearbladejsServer.CbServer.QueryConditions.QUERY_LESSTHAN with String = js.native
      
      /* "LTE" */ val QUERY_LESSTHAN_EQUAL: typings.clearbladejsServer.CbServer.QueryConditions.QUERY_LESSTHAN_EQUAL with String = js.native
      
      /* "RE" */ val QUERY_MATCHES: typings.clearbladejsServer.CbServer.QueryConditions.QUERY_MATCHES with String = js.native
      
      /* "NEQ" */ val QUERY_NOTEQUAL: typings.clearbladejsServer.CbServer.QueryConditions.QUERY_NOTEQUAL with String = js.native
    }
    
    @js.native
    object QuerySortDirections extends js.Object {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.clearbladejsServer.CbServer.QuerySortDirections with String] = js.native
      
      /* "ASC" */ val QUERY_SORT_ASCENDING: typings.clearbladejsServer.CbServer.QuerySortDirections.QUERY_SORT_ASCENDING with String = js.native
      
      /* "DESC" */ val QUERY_SORT_DESCENDING: typings.clearbladejsServer.CbServer.QuerySortDirections.QUERY_SORT_DESCENDING with String = js.native
    }
    
    @js.native
    object TriggerModule extends js.Object {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.clearbladejsServer.CbServer.TriggerModule with String] = js.native
      
      /* "Device" */ val DEVICE: typings.clearbladejsServer.CbServer.TriggerModule.DEVICE with String = js.native
      
      /* "Data" */ val Data: typings.clearbladejsServer.CbServer.TriggerModule.Data with String = js.native
      
      /* "Messaging" */ val MESSAGING: typings.clearbladejsServer.CbServer.TriggerModule.MESSAGING with String = js.native
      
      /* "User" */ val USER: typings.clearbladejsServer.CbServer.TriggerModule.USER with String = js.native
    }
  }
}
