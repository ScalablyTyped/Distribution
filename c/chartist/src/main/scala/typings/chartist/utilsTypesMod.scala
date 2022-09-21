package typings.chartist

import org.scalablytyped.runtime.TopLevel
import typings.std.Pick
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsTypesMod {
  
  type FilterByKey[T, K /* <: String */] = (T & typings.chartist.chartistStrings.FilterByKey & TopLevel[T]) | T
  
  type RequiredKeys[T, K /* <: /* keyof T */ String */, V /* <: /* keyof T */ String */] = T & (Required[Pick[T, K | V]]) & typings.chartist.chartistStrings.RequiredKeys & TopLevel[T]
}
