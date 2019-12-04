package typings.dc.dcMod

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
  var rightYAxisLabel_Original: IGetSet[String, ICompositeChart[T]] = js.native
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
  def childOptions(): js.Any = js.native
  def childOptions(t: js.Any): ICompositeChart[T] = js.native
  def children(): js.Array[BaseMixin[_]] = js.native
  def compose(): js.Array[BaseMixin[_]] = js.native
  def compose(t: js.Array[BaseMixin[_]]): ICompositeChart[T] = js.native
  def rightY(): js.Function1[/* n */ js.Any, _] = js.native
  def rightY(t: js.Function1[/* n */ js.Any, _]): ICompositeChart[T] = js.native
  def rightYAxis(): js.Any = js.native
  def rightYAxis(
    t: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify d3.svg.Axis */ js.Any
  ): ICompositeChart[T] = js.native
  def rightYAxisLabel(): String = js.native
  def rightYAxisLabel(t: String): ICompositeChart[T] = js.native
  def shareColors(): Boolean = js.native
  def shareColors(t: Boolean): ICompositeChart[T] = js.native
  def shareTitle(): Boolean = js.native
  def shareTitle(t: Boolean): ICompositeChart[T] = js.native
  def useRightAxisGridLines(): Boolean = js.native
  def useRightAxisGridLines(t: Boolean): ICompositeChart[T] = js.native
}

