package typings.clearbladejsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CbCallback = js.Function2[
    /* error */ scala.Boolean, 
    /* response */ typings.clearbladejsNode.mod.Resp, 
    scala.Unit
  ]
  
  @scala.inline
  def ClearBlade: typings.clearbladejsNode.mod.ClearBladeGlobal = typings.clearbladejsNode.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ClearBlade").asInstanceOf[typings.clearbladejsNode.mod.ClearBladeGlobal]
  @scala.inline
  def ClearBlade_=(x: typings.clearbladejsNode.mod.ClearBladeGlobal): scala.Unit = typings.clearbladejsNode.mod.^.asInstanceOf[js.Dynamic].updateDynamic("ClearBlade")(x.asInstanceOf[js.Any])
  
  type ItemOptions = typings.clearbladejsNode.mod.CollectionOptionsWithID
  
  type KeyValuePair = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type MessageCallback = js.Function1[/* message */ java.lang.String, scala.Unit]
  
  type QueryFilter = org.scalablytyped.runtime.StringDictionary[typings.clearbladejsNode.mod.QueryFilterValue]
  
  type QueryFilterValue = org.scalablytyped.runtime.StringDictionary[typings.clearbladejsNode.mod.QueryValue]
  
  type QueryValue = java.lang.String | scala.Double | scala.Boolean
}
