package typings.cassandraDriver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ArrayOrObject = js.Array[js.Any] | org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type EmptyCallback = js.Function1[/* err */ typings.std.Error, scala.Unit]
  
  type ValueCallback[T] = js.Function2[/* err */ typings.std.Error, /* val */ T, scala.Unit]
  
  @scala.inline
  def defaultOptions(): typings.cassandraDriver.mod.ClientOptions = typings.cassandraDriver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defaultOptions")().asInstanceOf[typings.cassandraDriver.mod.ClientOptions]
  
  @scala.inline
  def version: scala.Double = typings.cassandraDriver.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[scala.Double]
}
