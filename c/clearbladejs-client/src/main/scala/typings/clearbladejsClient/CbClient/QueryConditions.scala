package typings.clearbladejsClient.CbClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueryConditions extends StObject
@JSGlobal("CbClient.QueryConditions")
@js.native
object QueryConditions extends StObject {
  
  @js.native
  sealed trait QUERY_EQUAL
    extends StObject
       with QueryConditions
  
  @js.native
  sealed trait QUERY_GREATERTHAN
    extends StObject
       with QueryConditions
  
  @js.native
  sealed trait QUERY_GREATERTHAN_EQUAL
    extends StObject
       with QueryConditions
  
  @js.native
  sealed trait QUERY_LESSTHAN
    extends StObject
       with QueryConditions
  
  @js.native
  sealed trait QUERY_LESSTHAN_EQUAL
    extends StObject
       with QueryConditions
  
  @js.native
  sealed trait QUERY_MATCHES
    extends StObject
       with QueryConditions
  
  @js.native
  sealed trait QUERY_NOTEQUAL
    extends StObject
       with QueryConditions
}
