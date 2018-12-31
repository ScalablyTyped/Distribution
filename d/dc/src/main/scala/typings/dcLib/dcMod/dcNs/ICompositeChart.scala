package typings
package dcLib.dcMod.dcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICompositeChart[T] extends CoordinateGridMixin[T] {
  @JSName("childOptions")
  var childOptions_Original: IGetSet[_, ICompositeChart[T]] = js.native
  @JSName("compose")
  var compose_Original: IGetSet[js.Array[BaseMixin[_]], ICompositeChart[T]] = js.native
  @JSName("rightYAxisLabel")
  var rightYAxisLabel_Original: IGetSet[java.lang.String, ICompositeChart[T]] = js.native
  @JSName("rightYAxis")
  var rightYAxis_Original: IGetSet[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify d3.svg.Axis */ _, 
    ICompositeChart[T]
  ] = js.native
  @JSName("rightY")
  var rightY_Original: IGetSet[js.Function1[/* n */ _, _], ICompositeChart[T]] = js.native
  @JSName("shareColors")
  var shareColors_Original: IGetSet[scala.Boolean, ICompositeChart[T]] = js.native
  @JSName("shareTitle")
  var shareTitle_Original: IGetSet[scala.Boolean, ICompositeChart[T]] = js.native
  @JSName("useRightAxisGridLines")
  var useRightAxisGridLines_Original: IGetSet[scala.Boolean, ICompositeChart[T]] = js.native
  def childOptions(): js.Any = js.native
  def childOptions(t: js.Any): ICompositeChart[_] = js.native
  def children(): js.Array[BaseMixin[_]] = js.native
  def compose(): js.Array[BaseMixin[_]] = js.native
  def compose(t: js.Array[BaseMixin[_]]): ICompositeChart[js.Array[BaseMixin[_]]] = js.native
  def rightY(): js.Function1[/* n */ js.Any, _] = js.native
  def rightY(t: js.Function1[/* n */ js.Any, _]): ICompositeChart[js.Function1[/* n */ _, _]] = js.native
  def rightYAxis(): js.Any = js.native
  def rightYAxis(t: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify d3.svg.Axis */ js.Any): ICompositeChart[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify d3.svg.Axis */ _
  ] = js.native
  def rightYAxisLabel(): java.lang.String = js.native
  def rightYAxisLabel(t: java.lang.String): ICompositeChart[java.lang.String] = js.native
  def shareColors(): scala.Boolean = js.native
  def shareColors(t: scala.Boolean): ICompositeChart[scala.Boolean] = js.native
  def shareTitle(): scala.Boolean = js.native
  def shareTitle(t: scala.Boolean): ICompositeChart[scala.Boolean] = js.native
  def useRightAxisGridLines(): scala.Boolean = js.native
  def useRightAxisGridLines(t: scala.Boolean): ICompositeChart[scala.Boolean] = js.native
}

