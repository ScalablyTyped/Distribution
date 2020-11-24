package typings.decorum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type IMessageHandlerMap = org.scalablytyped.runtime.StringDictionary[typings.decorum.mod.MessageHandler[js.Any]]
  
  type MessageHandler[TValidator /* <: typings.decorum.mod.BaseValidator */] = js.Function2[
    /* opts */ typings.decorum.mod.IMessageOpts, 
    /* validator */ TValidator, 
    java.lang.String
  ]
  
  type ValidationDefinitions = org.scalablytyped.runtime.StringDictionary[js.Array[typings.std.PropertyDecorator]]
}
