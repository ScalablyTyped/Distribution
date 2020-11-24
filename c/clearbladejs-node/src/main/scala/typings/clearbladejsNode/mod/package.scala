package typings.clearbladejsNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CbCallback = js.Function2[
    /* error */ scala.Boolean, 
    /* response */ typings.clearbladejsNode.mod.Resp, 
    scala.Unit
  ]
  
  type ItemOptions = typings.clearbladejsNode.mod.CollectionOptionsWithID
  
  type KeyValuePair = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type MessageCallback = js.Function1[/* message */ java.lang.String, scala.Unit]
  
  type QueryFilter = org.scalablytyped.runtime.StringDictionary[typings.clearbladejsNode.mod.QueryFilterValue]
  
  type QueryFilterValue = org.scalablytyped.runtime.StringDictionary[typings.clearbladejsNode.mod.QueryValue]
  
  type QueryValue = java.lang.String | scala.Double | scala.Boolean
}
