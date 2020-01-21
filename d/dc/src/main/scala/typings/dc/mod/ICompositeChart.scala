package typings.dc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICompositeChart[T] extends CoordinateGridMixin[T] {
  @JSName("alignYAxes")
  var alignYAxes_Original: IGetSet[Boolean, ICompositeChart[T]] = js.native
  @JSName("childOptions")
  var childOptions_Original: IGetSet[js.Object, ICompositeChart[T]] = js.native
  @JSName("compose")
  var compose_Original: IGetSet[js.Array[BaseMixin[_]], ICompositeChart[T]] = js.native
  @JSName("rightYAxis")
  var rightYAxis_Original: IGetSet[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify d3.svg.Axis */ _, 
    ICompositeChart[T]
  ] = js.native
  @JSName("rightY")
  var rightY_Original: IGetSet[js.Function1[/* n */ _, _], ICompositeChart[T]] = js.native
  @JSName("shareColors")
  var shareColors_Original: IGetSet[Boolean, ICompositeChart[T]] = js.native
  @JSName("shareTitle")
  var shareTitle_Original: IGetSet[Boolean, ICompositeChart[T]] = js.native
  @JSName("useRightAxisGridLines")
  var useRightAxisGridLines_Original: IGetSet[Boolean, ICompositeChart[T]] = js.native
  def alignYAxes(): Boolean = js.native
  def alignYAxes(t: Boolean): ICompositeChart[T] = js.native
  def childOptions(): js.Object = js.native
  def childOptions(t: js.Object): ICompositeChart[T] = js.native
  def children(): js.Array[BaseMixin[_]] = js.native
  def compose(): js.Array[BaseMixin[_]] = js.native
  def compose(t: js.Array[BaseMixin[_]]): ICompositeChart[T] = js.native
  def rightY(): js.Function1[/* n */ js.Any, _] = js.native
  def rightY(t: js.Function1[/* n */ js.Any, _]): ICompositeChart[T] = js.native
  def rightYAxis(): js.Any = js.native
  def rightYAxis(
    t: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify d3.svg.Axis */ js.Any
  ): ICompositeChart[T] = js.native
  def rightYAxisLabel(): IGetSet[String, ICompositeChart[T]] = js.native
  def rightYAxisLabel(rightYAxisLabel: String): IGetSet[String, ICompositeChart[T]] = js.native
  def rightYAxisLabel(rightYAxisLabel: String, padding: Double): IGetSet[String, ICompositeChart[T]] = js.native
  def shareColors(): Boolean = js.native
  def shareColors(t: Boolean): ICompositeChart[T] = js.native
  def shareTitle(): Boolean = js.native
  def shareTitle(t: Boolean): ICompositeChart[T] = js.native
  def useRightAxisGridLines(): Boolean = js.native
  def useRightAxisGridLines(t: Boolean): ICompositeChart[T] = js.native
}

