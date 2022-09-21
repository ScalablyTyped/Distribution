package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.Iterable
import typings.typescriptNn5FuAjk.MapConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Map")
@js.native
open class Map[K, V] ()
  extends StObject
     with typings.typescriptNn5FuAjk.Map[K, V] {
  def this(entries: typings.typescriptNn5FuAjk.Array[js.Tuple2[K, V]]) = this()
  def this(iterable: Iterable[js.Tuple2[K, V]]) = this()
}
object Map {
  
  inline def apply: MapConstructor = js.Dynamic.global.selectDynamic("Map").asInstanceOf[MapConstructor]
}
