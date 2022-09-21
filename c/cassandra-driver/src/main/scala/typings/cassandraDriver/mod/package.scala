package typings.cassandraDriver.mod

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDriver.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def defaultOptions(): ClientOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultOptions")().asInstanceOf[ClientOptions]

inline def version: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[Double]

type ArrayOrObject = js.Array[Any] | StringDictionary[Any]

type EmptyCallback = js.Function1[/* err */ js.Error, Unit]

type ValueCallback[T] = js.Function2[/* err */ js.Error, /* val */ T, Unit]
