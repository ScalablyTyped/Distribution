package typings.cassandraDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ArrayOrObject = js.Array[js.Any] | org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type EmptyCallback = js.Function1[/* err */ typings.std.Error, scala.Unit]
  
  type ValueCallback[T] = js.Function2[/* err */ typings.std.Error, /* val */ T, scala.Unit]
}
