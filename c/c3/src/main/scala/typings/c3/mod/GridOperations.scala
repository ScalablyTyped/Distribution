package typings.c3.mod

import typings.c3.anon.ClassValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridOperations extends StObject {
  
  /**
    * Update the grid lines.
    * @param grids Grid lines will be replaced with this argument.
    */
  def apply(): js.Array[GridLineOptionsWithAxis] = js.native
  def apply[T /* <: js.Array[GridLineOptionsWithAxis] */](grids: T): T = js.native
  
  /**
    * Add grid lines. This API adds new grid lines instead of replacing.
    * @param grids New grid lines will be added. It's possible to give an Object if only one line will be added.
    */
  def add(grids: ArrayOrSingle[GridLineOptionsWithAxis]): js.Array[GridLineOptionsWithAxis] = js.native
  
  /**
    * Remove grid lines.
    * @param params Specifies which grid line to remove. If not given, all of x/y grid lines will be removed. If empty, none will be removed
    */
  def remove(): Unit = js.native
  def remove(params: ClassValue): Unit = js.native
}
