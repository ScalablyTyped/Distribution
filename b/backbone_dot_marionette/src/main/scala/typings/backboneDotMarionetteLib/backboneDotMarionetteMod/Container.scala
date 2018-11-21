package typings
package backboneDotMarionetteLib.backboneDotMarionetteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone.marionette", "Container")
@js.native
class Container[TView] () extends js.Object {
  /**
       * Find a view by it's cid.
       */
  def add(view: TView): scala.Unit = js.native
  /**
       * Find a view by it's cid.
       */
  def add(view: TView, customIndex: scala.Double): scala.Unit = js.native
  /**
       * @see _.all
       */
  def all(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TView, scala.Boolean]): scala.Boolean = js.native
  /**
       * @see _.all
       */
  def all(
    iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TView, scala.Boolean],
    context: js.Any
  ): scala.Boolean = js.native
  /**
       * @see _.any
       */
  def any(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TView, scala.Boolean]): scala.Boolean = js.native
  /**
       * @see _.any
       */
  def any(
    iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TView, scala.Boolean],
    context: js.Any
  ): scala.Boolean = js.native
  /**
       * @see _.contains
       */
  def contains(value: TView): scala.Boolean = js.native
  /**
       * @see _.contains
       */
  def contains(value: TView, fromIndex: scala.Double): scala.Boolean = js.native
  /**
       * @see _.detect
       */
  def detect(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TView, scala.Boolean]): js.UndefOr[Container[TView]] = js.native
  /**
       * @see _.detect
       */
  def detect(
    iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TView, scala.Boolean],
    context: js.Any
  ): js.UndefOr[Container[TView]] = js.native
  /**
       * @see _.each
       */
  def each(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TView, scala.Unit]): Container[TView] = js.native
  /**
       * @see _.each
       */
  def each(
    iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TView, scala.Unit],
    context: js.Any
  ): Container[TView] = js.native
  /**
       * @see _.every
       */
  def every(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TView, scala.Boolean]): scala.Boolean = js.native
  /**
       * @see _.every
       */
  def every(
    iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TView, scala.Boolean],
    context: js.Any
  ): scala.Boolean = js.native
  /**
       * @see _.filter
       */
  def filter(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TView, scala.Boolean]): js.Array[TView] = js.native
  /**
       * @see _.filter
       */
  def filter(
    iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TView, scala.Boolean],
    context: js.Any
  ): js.Array[TView] = js.native
  /**
       * @see _.find
       */
  def find(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TView, scala.Boolean]): js.UndefOr[Container[TView]] = js.native
  /**
       * @see _.find
       */
  def find(
    iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TView, scala.Boolean],
    context: js.Any
  ): js.UndefOr[Container[TView]] = js.native
  /**
       * Find a view by it's cid.
       */
  def findByCid(cid: java.lang.String): TView = js.native
  /**
       * Find by custom key.
       */
  def findByCustom(key: java.lang.String): TView = js.native
  /**
       * Find by numeric index (unstable).
       */
  def findByIndex(index: scala.Double): TView = js.native
  /**
       * Find a view by model.
       */
  def findByModel(model: backboneLib.backboneMod.Model): TView = js.native
  /**
       * Find a view by model cid.
       */
  def findByModelCid(modelCid: java.lang.String): TView = js.native
  /**
       * @see _.first
       */
  def first(): js.UndefOr[TView] = js.native
  /**
       * @see _.forEach
       */
  def forEach(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TView, scala.Unit]): Container[TView] = js.native
  /**
       * @see _.forEach
       */
  def forEach(
    iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TView, scala.Unit],
    context: js.Any
  ): Container[TView] = js.native
  /**
       * @see _.include
       */
  def include(value: TView): scala.Boolean = js.native
  /**
       * @see _.include
       */
  def include(value: TView, fromIndex: scala.Double): scala.Boolean = js.native
  /**
       * @see _.initial
       */
  def initial(): js.Array[TView] = js.native
  /**
       * @see _.initial
       */
  def initial(n: scala.Double): js.Array[TView] = js.native
  /**
       * @see _.invoke
       */
  def invoke(methodName: java.lang.String, args: js.Any*): js.Any = js.native
  /**
       * @see _.isEmpty
       */
  def isEmpty(): scala.Boolean = js.native
  /**
       * @see _.last
       */
  def last(n: scala.Double): js.Array[TView] = js.native
  /**
       * @see _.map
       */
  def map[TResult](iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TView, TResult]): js.Array[TResult] = js.native
  /**
       * @see _.map
       */
  def map[TResult](iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TView, TResult], context: js.Any): js.Array[TResult] = js.native
  /**
       * @see _.partition
       */
  def partition(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TView, scala.Boolean]): js.Array[js.Array[TView]] = js.native
  /**
       * @see _.partition
       */
  def partition(
    iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TView, scala.Boolean],
    context: js.Any
  ): js.Array[js.Array[TView]] = js.native
  /**
       * @see _.pluck
       */
  def pluck(propertyName: java.lang.String): js.Array[_] = js.native
  /**
       * @see _.reduce
       */
  def reduce[TResult](iterator: underscoreLib.underscoreMod.underscoreNs.MemoIterator[TView, TResult]): TResult = js.native
  /**
       * @see _.reduce
       */
  def reduce[TResult](iterator: underscoreLib.underscoreMod.underscoreNs.MemoIterator[TView, TResult], memo: TResult): TResult = js.native
  /**
       * @see _.reduce
       */
  def reduce[TResult](
    iterator: underscoreLib.underscoreMod.underscoreNs.MemoIterator[TView, TResult],
    memo: TResult,
    context: js.Any
  ): TResult = js.native
  /**
       * @see _.reject
       */
  def reject(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TView, scala.Boolean]): js.Array[TView] = js.native
  /**
       * @see _.reject
       */
  def reject(
    iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TView, scala.Boolean],
    context: js.Any
  ): js.Array[TView] = js.native
  /**
       * Find a view by it's cid.
       */
  def remove(view: TView): scala.Unit = js.native
  /**
       * @see _.rest
       */
  def rest(): js.Array[TView] = js.native
  /**
       * @see _.rest
       */
  def rest(n: scala.Double): js.Array[TView] = js.native
  /**
       * @see _.select
       */
  def select(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TView, scala.Boolean]): js.Array[TView] = js.native
  /**
       * @see _.select
       */
  def select(
    iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TView, scala.Boolean],
    context: js.Any
  ): js.Array[TView] = js.native
  /**
       * @see _.some
       */
  def some(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TView, scala.Boolean]): scala.Boolean = js.native
  /**
       * @see _.some
       */
  def some(
    iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TView, scala.Boolean],
    context: js.Any
  ): scala.Boolean = js.native
  /**
       * @see _.toArray
       */
  def toArray(): js.Array[TView] = js.native
  /**
       * @see _.without
       */
  def without(values: TView*): js.Array[TView] = js.native
}

