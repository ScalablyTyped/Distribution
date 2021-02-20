package typings.clearbladejsClient

import typings.clearbladejsClient.CbClient.ClearBladeGlobal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object CbClient {
    
    @JSGlobal("CbClient")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("CbClient.ClearBlade")
    @js.native
    def ClearBlade: ClearBladeGlobal = js.native
    @scala.inline
    def ClearBlade_=(x: ClearBladeGlobal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClearBlade")(x.asInstanceOf[js.Any])
    
    @JSGlobal("CbClient.MessagingQOS")
    @js.native
    object MessagingQOS extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.clearbladejsClient.CbClient.MessagingQOS with Double] = js.native
      
      /* 1 */ val MESSAGING_QOS_AT_LEAST_ONCE: typings.clearbladejsClient.CbClient.MessagingQOS.MESSAGING_QOS_AT_LEAST_ONCE with Double = js.native
      
      /* 0 */ val MESSAGING_QOS_AT_MOST_ONCE: typings.clearbladejsClient.CbClient.MessagingQOS.MESSAGING_QOS_AT_MOST_ONCE with Double = js.native
      
      /* 2 */ val MESSAGING_QOS_EXACTLY_ONCE: typings.clearbladejsClient.CbClient.MessagingQOS.MESSAGING_QOS_EXACTLY_ONCE with Double = js.native
    }
    
    @JSGlobal("CbClient.QueryConditions")
    @js.native
    object QueryConditions extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.clearbladejsClient.CbClient.QueryConditions with String] = js.native
      
      /* "EQ" */ val QUERY_EQUAL: typings.clearbladejsClient.CbClient.QueryConditions.QUERY_EQUAL with String = js.native
      
      /* "GT" */ val QUERY_GREATERTHAN: typings.clearbladejsClient.CbClient.QueryConditions.QUERY_GREATERTHAN with String = js.native
      
      /* "GTE" */ val QUERY_GREATERTHAN_EQUAL: typings.clearbladejsClient.CbClient.QueryConditions.QUERY_GREATERTHAN_EQUAL with String = js.native
      
      /* "LT" */ val QUERY_LESSTHAN: typings.clearbladejsClient.CbClient.QueryConditions.QUERY_LESSTHAN with String = js.native
      
      /* "LTE" */ val QUERY_LESSTHAN_EQUAL: typings.clearbladejsClient.CbClient.QueryConditions.QUERY_LESSTHAN_EQUAL with String = js.native
      
      /* "RE" */ val QUERY_MATCHES: typings.clearbladejsClient.CbClient.QueryConditions.QUERY_MATCHES with String = js.native
      
      /* "NEQ" */ val QUERY_NOTEQUAL: typings.clearbladejsClient.CbClient.QueryConditions.QUERY_NOTEQUAL with String = js.native
    }
    
    @JSGlobal("CbClient.QuerySortDirections")
    @js.native
    object QuerySortDirections extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.clearbladejsClient.CbClient.QuerySortDirections with String] = js.native
      
      /* "ASC" */ val QUERY_SORT_ASCENDING: typings.clearbladejsClient.CbClient.QuerySortDirections.QUERY_SORT_ASCENDING with String = js.native
      
      /* "DESC" */ val QUERY_SORT_DESCENDING: typings.clearbladejsClient.CbClient.QuerySortDirections.QUERY_SORT_DESCENDING with String = js.native
    }
  }
  
  @JSGlobal("ClearBlade")
  @js.native
  def ClearBlade: ClearBladeGlobal = js.native
  @scala.inline
  def ClearBlade_=(x: ClearBladeGlobal): Unit = js.Dynamic.global.updateDynamic("ClearBlade")(x.asInstanceOf[js.Any])
}
