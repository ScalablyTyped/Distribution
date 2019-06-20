package typings
package atBlueprintjsCoreLib.libEsmComponentsOverflowDashListOverflowListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/overflow-list/overflowList", "OverflowList")
@js.native
class OverflowList[T] ()
  extends reactLib.reactMod.Component[IOverflowListProps[T], IOverflowListState[T], js.Any] {
  /** A cache containing the widths of all elements being observed to detect growing/shrinking */
  var previousWidths: js.Any = js.native
  var resize: js.Any = js.native
  var spacer: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MOverflowList(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MOverflowList(_prevProps: IOverflowListProps[T], prevState: IOverflowListState[T]): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MOverflowList(nextProps: IOverflowListProps[T]): scala.Unit = js.native
  /* private */ def maybeRenderOverflow(): js.Any = js.native
  /* private */ def repartition(growing: js.Any): js.Any = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MOverflowList(_nextProps: IOverflowListProps[T], nextState: IOverflowListState[T]): scala.Boolean = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/overflow-list/overflowList", "OverflowList")
@js.native
object OverflowList extends js.Object {
  var defaultProps: stdLib.Partial[
    atBlueprintjsCoreLib.libEsmComponentsOverflowDashListOverflowListMod.IOverflowListProps[_]
  ] = js.native
  var displayName: java.lang.String = js.native
  def ofType[T](): org.scalablytyped.runtime.Instantiable1[
    /* props */ atBlueprintjsCoreLib.libEsmComponentsOverflowDashListOverflowListMod.IOverflowListProps[T], 
    atBlueprintjsCoreLib.libEsmComponentsOverflowDashListOverflowListMod.OverflowList[T]
  ] = js.native
}

