package typings.clearbladejsNode.mod

import org.scalablytyped.runtime.StringDictionary
import typings.clearbladejsNode.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def ClearBlade: ClearBladeGlobal = ^.asInstanceOf[js.Dynamic].selectDynamic("ClearBlade").asInstanceOf[ClearBladeGlobal]
inline def ClearBlade_=(x: ClearBladeGlobal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClearBlade")(x.asInstanceOf[js.Any])

type CbCallback = js.Function2[/* error */ Boolean, /* response */ Resp, Unit]

type ItemOptions = CollectionOptionsWithID

type KeyValuePair = StringDictionary[Any]

type MessageCallback = js.Function1[/* message */ String, Unit]

type QueryFilter = StringDictionary[QueryFilterValue]

type QueryFilterValue = StringDictionary[QueryValue]

type QueryValue = String | Double | Boolean
