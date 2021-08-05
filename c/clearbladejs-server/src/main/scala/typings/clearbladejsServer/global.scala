package typings.clearbladejsServer

import typings.clearbladejsServer.CbServer.ClearBladeGlobal
import typings.clearbladejsServer.CbServer.ReqTypes
import typings.clearbladejsServer.CbServer.Resp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object CbServer {
    
    @JSGlobal("CbServer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("CbServer.ClearBlade")
    @js.native
    def ClearBlade: ClearBladeGlobal = js.native
    inline def ClearBlade_=(x: ClearBladeGlobal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClearBlade")(x.asInstanceOf[js.Any])
    
    @JSGlobal("CbServer.MessagingQOS")
    @js.native
    object MessagingQOS extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.clearbladejsServer.CbServer.MessagingQOS & Double] = js.native
      
      /* 1 */ val MESSAGING_QOS_AT_LEAST_ONCE: typings.clearbladejsServer.CbServer.MessagingQOS.MESSAGING_QOS_AT_LEAST_ONCE & Double = js.native
      
      /* 0 */ val MESSAGING_QOS_AT_MOST_ONCE: typings.clearbladejsServer.CbServer.MessagingQOS.MESSAGING_QOS_AT_MOST_ONCE & Double = js.native
      
      /* 2 */ val MESSAGING_QOS_EXACTLY_ONCE: typings.clearbladejsServer.CbServer.MessagingQOS.MESSAGING_QOS_EXACTLY_ONCE & Double = js.native
    }
    
    @JSGlobal("CbServer.QueryConditions")
    @js.native
    object QueryConditions extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.clearbladejsServer.CbServer.QueryConditions & String] = js.native
      
      /* "EQ" */ val QUERY_EQUAL: typings.clearbladejsServer.CbServer.QueryConditions.QUERY_EQUAL & String = js.native
      
      /* "GT" */ val QUERY_GREATERTHAN: typings.clearbladejsServer.CbServer.QueryConditions.QUERY_GREATERTHAN & String = js.native
      
      /* "GTE" */ val QUERY_GREATERTHAN_EQUAL: typings.clearbladejsServer.CbServer.QueryConditions.QUERY_GREATERTHAN_EQUAL & String = js.native
      
      /* "LT" */ val QUERY_LESSTHAN: typings.clearbladejsServer.CbServer.QueryConditions.QUERY_LESSTHAN & String = js.native
      
      /* "LTE" */ val QUERY_LESSTHAN_EQUAL: typings.clearbladejsServer.CbServer.QueryConditions.QUERY_LESSTHAN_EQUAL & String = js.native
      
      /* "RE" */ val QUERY_MATCHES: typings.clearbladejsServer.CbServer.QueryConditions.QUERY_MATCHES & String = js.native
      
      /* "NEQ" */ val QUERY_NOTEQUAL: typings.clearbladejsServer.CbServer.QueryConditions.QUERY_NOTEQUAL & String = js.native
    }
    
    @JSGlobal("CbServer.QuerySortDirections")
    @js.native
    object QuerySortDirections extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.clearbladejsServer.CbServer.QuerySortDirections & String] = js.native
      
      /* "ASC" */ val QUERY_SORT_ASCENDING: typings.clearbladejsServer.CbServer.QuerySortDirections.QUERY_SORT_ASCENDING & String = js.native
      
      /* "DESC" */ val QUERY_SORT_DESCENDING: typings.clearbladejsServer.CbServer.QuerySortDirections.QUERY_SORT_DESCENDING & String = js.native
    }
    
    @JSGlobal("CbServer.TriggerModule")
    @js.native
    object TriggerModule extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.clearbladejsServer.CbServer.TriggerModule & String] = js.native
      
      /* "Device" */ val DEVICE: typings.clearbladejsServer.CbServer.TriggerModule.DEVICE & String = js.native
      
      /* "Data" */ val Data: typings.clearbladejsServer.CbServer.TriggerModule.Data & String = js.native
      
      /* "Messaging" */ val MESSAGING: typings.clearbladejsServer.CbServer.TriggerModule.MESSAGING & String = js.native
      
      /* "User" */ val USER: typings.clearbladejsServer.CbServer.TriggerModule.USER & String = js.native
    }
    
    @JSGlobal("CbServer.req")
    @js.native
    def req: ReqTypes = js.native
    inline def req_=(x: ReqTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("req")(x.asInstanceOf[js.Any])
    
    @JSGlobal("CbServer.resp")
    @js.native
    def resp: Resp = js.native
    inline def resp_=(x: Resp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resp")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("ClearBlade")
  @js.native
  def ClearBlade: ClearBladeGlobal = js.native
  inline def ClearBlade_=(x: ClearBladeGlobal): Unit = js.Dynamic.global.updateDynamic("ClearBlade")(x.asInstanceOf[js.Any])
}
