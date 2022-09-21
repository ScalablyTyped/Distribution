package typings.clearbladejsServer.CbServer

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CbCallback = js.Function2[/* error */ Boolean, /* response */ Resp, Unit]

type ItemOptions = CollectionOptionsWithID

type KeyValuePair = StringDictionary[Any]

type QueryFilter = StringDictionary[QueryFilterValue]

type QueryFilterValue = StringDictionary[QueryValue]

type QueryValue = String | Double | Boolean

type ReqTypes = BasicReq
