package typings.clearbladejsServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CbServer {
  type CbCallback = js.Function2[
    /* error */ scala.Boolean, 
    /* response */ typings.clearbladejsServer.CbServer.Resp, 
    scala.Unit
  ]
  type ItemOptions = typings.clearbladejsServer.CbServer.CollectionOptionsWithID
  type KeyValuePair = org.scalablytyped.runtime.StringDictionary[js.Any]
  type QueryFilter = org.scalablytyped.runtime.StringDictionary[typings.clearbladejsServer.CbServer.QueryFilterValue]
  type QueryFilterValue = org.scalablytyped.runtime.StringDictionary[typings.clearbladejsServer.CbServer.QueryValue]
  type QueryValue = java.lang.String | scala.Double | scala.Boolean
  type ReqTypes = typings.clearbladejsServer.CbServer.BasicReq
}
