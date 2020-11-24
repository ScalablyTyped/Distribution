package typings.bunyan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type LogLevel = typings.bunyan.mod.LogLevelString | scala.Double
  
  type Serializer = js.Function1[/* input */ js.Any, js.Any]
  
  type Serializers = org.scalablytyped.runtime.StringDictionary[typings.bunyan.mod.Serializer]
}
