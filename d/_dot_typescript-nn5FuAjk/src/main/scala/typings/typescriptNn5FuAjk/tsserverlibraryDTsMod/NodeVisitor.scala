package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeVisitor extends StObject {
  
  def apply[T /* <: Node */](): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](nodes: T): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](nodes: T, visitor: Unit, test: js.Function1[/* node */ Node, Boolean]): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](
    nodes: T,
    visitor: Unit,
    test: js.Function1[/* node */ Node, Boolean],
    lift: js.Function1[/* node */ Array[Node], T]
  ): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](nodes: T, visitor: Unit, test: Unit, lift: js.Function1[/* node */ Array[Node], T]): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](nodes: T, visitor: Visitor): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](nodes: T, visitor: Visitor, test: js.Function1[/* node */ Node, Boolean]): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](
    nodes: T,
    visitor: Visitor,
    test: js.Function1[/* node */ Node, Boolean],
    lift: js.Function1[/* node */ Array[Node], T]
  ): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](nodes: T, visitor: Visitor, test: Unit, lift: js.Function1[/* node */ Array[Node], T]): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](nodes: Unit, visitor: Unit, test: js.Function1[/* node */ Node, Boolean]): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](
    nodes: Unit,
    visitor: Unit,
    test: js.Function1[/* node */ Node, Boolean],
    lift: js.Function1[/* node */ Array[Node], T]
  ): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](nodes: Unit, visitor: Unit, test: Unit, lift: js.Function1[/* node */ Array[Node], T]): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](nodes: Unit, visitor: Visitor): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](nodes: Unit, visitor: Visitor, test: js.Function1[/* node */ Node, Boolean]): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](
    nodes: Unit,
    visitor: Visitor,
    test: js.Function1[/* node */ Node, Boolean],
    lift: js.Function1[/* node */ Array[Node], T]
  ): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](nodes: Unit, visitor: Visitor, test: Unit, lift: js.Function1[/* node */ Array[Node], T]): js.UndefOr[T] = js.native
}
