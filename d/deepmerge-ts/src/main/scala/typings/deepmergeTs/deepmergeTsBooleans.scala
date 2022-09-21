package typings.deepmergeTs

import typings.deepmergeTs.v46Mod.EveryIsRecord
import typings.deepmergeTs.v46Mod.Is
import typings.deepmergeTs.v46Mod.IsTuple
import typings.deepmergeTs.v46Mod.Not
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deepmergeTsBooleans {
  
  @js.native
  sealed trait `false`
    extends StObject
       with EveryIsRecord[Any]
       with Is[Any, Any]
       with IsTuple[Any]
       with Not[Any]
  inline def `false`: `false` = false.asInstanceOf[`false`]
  
  @js.native
  sealed trait `true`
    extends StObject
       with EveryIsRecord[Any]
       with Is[Any, Any]
       with IsTuple[Any]
       with Not[Any]
  inline def `true`: `true` = true.asInstanceOf[`true`]
}
