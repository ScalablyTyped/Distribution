package typings.clearbladejsClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object CbClient {
  
  type CbCallback = js.Function2[
    /* error */ scala.Boolean, 
    /* response */ typings.clearbladejsClient.CbClient.Resp, 
    scala.Unit
  ]
  
  type ItemOptions = typings.clearbladejsClient.CbClient.CollectionOptionsWithID
  
  type MessageCallback = js.Function1[/* message */ java.lang.String, scala.Unit]
  
  type QueryFilter = org.scalablytyped.runtime.StringDictionary[typings.clearbladejsClient.CbClient.QueryFilterValue]
  
  type QueryFilterValue = org.scalablytyped.runtime.StringDictionary[typings.clearbladejsClient.CbClient.QueryValue]
  
  type QueryValue = java.lang.String | scala.Double | scala.Boolean
}
