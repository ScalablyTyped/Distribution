package typings.cypress.typesLodashMod

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecursiveArray[T]
  extends StObject
     with Array[T | RecursiveArray[T]]
