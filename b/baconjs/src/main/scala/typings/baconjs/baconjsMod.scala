package typings.baconjs

import typings.baconjs.baconjsStrings.`<version>`
import typings.baconjs.typesBusMod.default
import typings.baconjs.typesCombinetemplateMod.CombinedTemplate
import typings.baconjs.typesCompositeunsubscribeMod.Subscription
import typings.baconjs.typesFlatmapUnderscoreMod.SpawnerOrObservable
import typings.baconjs.typesFrombinderMod.Binder
import typings.baconjs.typesFrombinderMod.EventTransformer
import typings.baconjs.typesFromeventMod.EventSourceFn
import typings.baconjs.typesFrompollMod.PollFunction
import typings.baconjs.typesObservableMod.EventStreamOptions
import typings.baconjs.typesReplyMod.Reply
import typings.baconjs.typesSchedulerMod.Scheduler
import typings.baconjs.typesSpyMod.Spy
import typings.baconjs.typesTypesMod.EventSink
import typings.baconjs.typesTypesMod.Function2
import typings.baconjs.typesTypesMod.Sink
import typings.baconjs.typesTypesMod.Subscribe
import typings.baconjs.typesTypesMod.Unsub
import typings.baconjs.typesTypesMod.VoidSink
import typings.baconjs.typesUpdateMod.UpdatePattern
import typings.baconjs.typesWhenMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", JSImport.Namespace)
@js.native
object baconjsMod extends js.Object {
  @js.native
  class Bus[V] () extends default[V]
  
  @js.native
  class CompositeUnsubscribe ()
    extends typings.baconjs.typesCompositeunsubscribeMod.default {
    def this(ss: js.Array[Subscription]) = this()
  }
  
  @js.native
  class Desc protected ()
    extends typings.baconjs.typesDescribeMod.Desc {
    def this(context: js.Any, method: String) = this()
    def this(context: js.Any, method: String, args: js.Array[_]) = this()
  }
  
  @js.native
  class End ()
    extends typings.baconjs.typesEventMod.End
  
  @js.native
  class Error protected ()
    extends typings.baconjs.typesEventMod.Error {
    def this(error: js.Any) = this()
  }
  
  @js.native
  abstract class Event[V] ()
    extends typings.baconjs.typesEventMod.Event[V]
  
  @js.native
  class EventStream[V] protected ()
    extends typings.baconjs.typesObservableMod.EventStream[V] {
    def this(desc: typings.baconjs.typesDescribeMod.Desc, subscribe: Subscribe[V]) = this()
    def this(desc: typings.baconjs.typesDescribeMod.Desc, subscribe: Subscribe[V], handler: EventSink[V]) = this()
    def this(
      desc: typings.baconjs.typesDescribeMod.Desc,
      subscribe: Subscribe[V],
      handler: EventSink[V],
      options: EventStreamOptions
    ) = this()
  }
  
  @js.native
  class Initial[V] protected ()
    extends typings.baconjs.typesEventMod.Initial[V] {
    def this(value: V) = this()
  }
  
  @js.native
  class Next[V] protected ()
    extends typings.baconjs.typesEventMod.Next[V] {
    def this(value: V) = this()
  }
  
  @js.native
  abstract class Observable[V] protected ()
    extends typings.baconjs.typesObservableMod.Observable[V] {
    def this(desc: typings.baconjs.typesDescribeMod.Desc) = this()
  }
  
  @js.native
  class Property[V] protected ()
    extends typings.baconjs.typesObservableMod.Property[V] {
    def this(desc: typings.baconjs.typesDescribeMod.Desc, subscribe: Subscribe[V]) = this()
    def this(desc: typings.baconjs.typesDescribeMod.Desc, subscribe: Subscribe[V], handler: EventSink[V]) = this()
  }
  
  @js.native
  abstract class Value[V] protected ()
    extends typings.baconjs.typesEventMod.Value[V] {
    def this(value: V) = this()
  }
  
  val more: Reply = js.native
  val noMore: Reply = js.native
  val nullSink: Sink[js.Any] = js.native
  val nullVoidSink: VoidSink = js.native
  val version: `<version>` = js.native
  def combine[V, V2, R](
    left: typings.baconjs.typesObservableMod.default[V],
    right: typings.baconjs.typesObservableMod.default[V2],
    f: Function2[V, V2, R]
  ): typings.baconjs.typesObservableMod.Property[R] = js.native
  def combineAsArray[V](
    streams: (typings.baconjs.typesObservableMod.default[V] | js.Array[typings.baconjs.typesObservableMod.default[V]])*
  ): typings.baconjs.typesObservableMod.Property[js.Array[V]] = js.native
  def combineTemplate[T](template: T): typings.baconjs.typesObservableMod.Property[CombinedTemplate[T]] = js.native
  def combineWith[Out](
    f: js.Function1[/* repeated */ js.Any, Out],
    streams: typings.baconjs.typesObservableMod.default[_]*
  ): typings.baconjs.typesObservableMod.Property[Out] = js.native
  def concatAll[V](
    streams_ : (typings.baconjs.typesObservableMod.default[V] | js.Array[typings.baconjs.typesObservableMod.default[V]])*
  ): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def constant[V](x: V): typings.baconjs.typesObservableMod.Property[V] = js.native
  def fromArray[T](values: js.Array[T | typings.baconjs.typesEventMod.Event[T]]): typings.baconjs.typesObservableMod.EventStream[T] = js.native
  def fromBinder[V](binder: Binder[V]): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def fromBinder[V](binder: Binder[V], eventTransformer: EventTransformer[V]): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def fromCallback[V](f: js.Function, args: js.Any*): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def fromESObservable[V](_observable: js.Any): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def fromEvent[V](target: js.Any, eventSource: String): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def fromEvent[V](target: js.Any, eventSource: String, eventTransformer: EventTransformer[V]): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def fromEvent[V](target: js.Any, eventSource: EventSourceFn): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def fromEvent[V](target: js.Any, eventSource: EventSourceFn, eventTransformer: EventTransformer[V]): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def fromEventTarget[V](target: js.Any, eventSource: String): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def fromEventTarget[V](target: js.Any, eventSource: String, eventTransformer: EventTransformer[V]): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def fromEventTarget[V](target: js.Any, eventSource: EventSourceFn): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def fromEventTarget[V](target: js.Any, eventSource: EventSourceFn, eventTransformer: EventTransformer[V]): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def fromNodeCallback[V](f: js.Function, args: js.Any*): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def fromPoll[V](delay: Double, poll: PollFunction[V]): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def fromPromise[V](promise: js.Promise[V]): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def fromPromise[V](promise: js.Promise[V], abort: Boolean): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def fromPromise[V](promise: js.Promise[V], abort: Boolean, eventTransformer: EventTransformer[V]): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def getScheduler(): Scheduler = js.native
  def groupSimultaneous[V](
    streams: (typings.baconjs.typesObservableMod.default[V] | js.Array[typings.baconjs.typesObservableMod.default[V]])*
  ): typings.baconjs.typesObservableMod.EventStream[js.Array[js.Array[V]]] = js.native
  def hasValue[V](e: typings.baconjs.typesEventMod.Event[V]): /* is baconjs.baconjs/types/event.Value<V> */ Boolean = js.native
  def interval[V](delay: Double, value: V): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def isEnd[V](e: typings.baconjs.typesEventMod.Event[V]): /* is baconjs.baconjs/types/event.End */ Boolean = js.native
  def isError[V](e: typings.baconjs.typesEventMod.Event[V]): /* is baconjs.baconjs/types/event.Error */ Boolean = js.native
  def isEvent[V](e: js.Any): /* is baconjs.baconjs/types/event.Event<V> */ Boolean = js.native
  def isInitial[V](e: typings.baconjs.typesEventMod.Event[V]): /* is baconjs.baconjs/types/event.Initial<V> */ Boolean = js.native
  def isNext[V](e: typings.baconjs.typesEventMod.Event[V]): /* is baconjs.baconjs/types/event.Next<V> */ Boolean = js.native
  def mergeAll[V](
    streams: (typings.baconjs.typesObservableMod.default[V] | js.Array[typings.baconjs.typesObservableMod.default[V]])*
  ): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def never[V](): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def onValues(args: js.Any*): Unsub = js.native
  def once[V](value: V): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def once[V](value: typings.baconjs.typesEventMod.Event[V]): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def repeat[V](
    generator: js.Function1[/* iteration */ Double, js.UndefOr[typings.baconjs.typesObservableMod.default[V]]]
  ): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def repeatedly[V](delay: Double, values: js.Array[V | typings.baconjs.typesEventMod.Event[V]]): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def retry[T](src: typings.baconjs.typesObservableMod.default[T]): typings.baconjs.typesObservableMod.default[T] = js.native
  def retry[T](
    src: typings.baconjs.typesObservableMod.default[T],
    predicate: js.Function1[/* error */ js.Any, Boolean]
  ): typings.baconjs.typesObservableMod.default[T] = js.native
  def retry[V, V2](src: typings.baconjs.typesObservableMod.default[V], f: SpawnerOrObservable[V, V2]): typings.baconjs.typesObservableMod.default[V2] = js.native
  def sequentially[V](delay: Double, values: js.Array[V | typings.baconjs.typesEventMod.Event[V]]): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def setScheduler(newScheduler: Scheduler): Unit = js.native
  def silence[V](duration: Double): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def spy(spy: Spy): Double = js.native
  def `try`[In, Out](f: js.Function1[/* value */ In, Out]): js.Function1[/* value */ In, typings.baconjs.typesObservableMod.EventStream[Out]] = js.native
  def update[Out](initial: Out, patterns: UpdatePattern[Out]*): typings.baconjs.typesObservableMod.Property[Out] = js.native
  def when[O](patterns: Pattern[O]*): typings.baconjs.typesObservableMod.EventStream[O] = js.native
  def zipAsArray[V](
    args: (typings.baconjs.typesObservableMod.default[V] | js.Array[typings.baconjs.typesObservableMod.default[V]])*
  ): typings.baconjs.typesObservableMod.default[js.Array[V]] = js.native
  def zipWith[Out](
    f: js.Function1[/* repeated */ js.Any, Out],
    streams: typings.baconjs.typesObservableMod.default[_]*
  ): typings.baconjs.typesObservableMod.EventStream[Out] = js.native
  @js.native
  object $ extends js.Object {
    def asEventStream(eventName: String, selector: js.UndefOr[scala.Nothing], eventTransformer: js.Any): typings.baconjs.typesObservableMod.EventStream[_] = js.native
    /**
      Creates an EventStream from events on a
      jQuery or Zepto.js object. You can pass optional arguments to add a
      jQuery live selector and/or a function that processes the jQuery
      event and its parameters, if given, like this:
      
      ```js
      $("#my-div").asEventStream("click", ".more-specific-selector")
      $("#my-div").asEventStream("click", ".more-specific-selector", function(event, args) { return args[0] })
      $("#my-div").asEventStream("click", function(event, args) { return args[0] })
      ```
      
      Note: you need to install the `asEventStream` method on JQuery by calling
      [init()](#_.aseventstream) as in `Bacon.$.init($)`.
      */
    def asEventStream(eventName: String, selector: String, eventTransformer: js.Any): typings.baconjs.typesObservableMod.EventStream[_] = js.native
    /**
      * Installs the [asEventStream](#_.aseventstream) to the given jQuery/Zepto object (the `$` object).
      */
    def init(jQuery: js.Any): Unit = js.native
  }
  
  @js.native
  object `_` extends js.Object {
    @JSName("all")
    var all_Original: Fn_FXXs = js.native
    @JSName("always")
    var always_Original: Fn_XA = js.native
    var any: js.Any = js.native
    @JSName("bind")
    var bind_Original: Fn_Fn = js.native
    @JSName("contains")
    var contains_Original: Fn_XXs = js.native
    @JSName("each")
    var each_Original: Fn_FKey = js.native
    @JSName("empty")
    var empty_Original: Fn_XsA = js.native
    @JSName("filter")
    var filter_Original: Fn_A = js.native
    @JSName("flatMap")
    var flatMap_Original: Fn_FXXsA = js.native
    @JSName("fold")
    var fold_Original: Fn_Acc = js.native
    @JSName("head")
    var head_Original: Fn_Xs = js.native
    @JSName("id")
    var id_Original: Fn_XA_2056052176 = js.native
    @JSName("indexOf")
    var indexOf_Original: Fn_X = js.native
    @JSName("indexWhere")
    var indexWhere_Original: Fn_F = js.native
    @JSName("isFunction")
    var isFunction_Original: js.Function1[/* f */ js.Any, /* is std.Function */ Boolean] = js.native
    @JSName("last")
    var last_Original: Fn_XsAArray_988238076 = js.native
    @JSName("map")
    var map_Original: Fn_AF = js.native
    @JSName("negate")
    var negate_Original: Fn_FX = js.native
    @JSName("remove")
    var remove_Original: Fn_XXsArray = js.native
    @JSName("tail")
    var tail_Original: Fn_XsArray = js.native
    @JSName("toArray")
    var toArray_Original: Fn_XsAArray = js.native
    @JSName("toFunction")
    var toFunction_Original: Fn_FXV = js.native
    @JSName("toString")
    var toString_Original: js.Function1[/* obj */ js.Any, String] = js.native
    @JSName("without")
    var without_Original: Fn_XXsA = js.native
    def all[A](xs: js.Array[A], f: js.Function1[/* x */ A, Boolean]): Boolean = js.native
    def always[A](x: A): js.Function0[A] = js.native
    def bind[F /* <: js.Function */](fn: F, me: js.Any): F = js.native
    def contains[A](xs: js.Array[A], x: A): Boolean = js.native
    def each[A](xs: js.Any, f: js.Function2[/* key */ String, /* x */ A, _]): Unit = js.native
    def empty[A](xs: js.Array[A]): Boolean = js.native
    def filter[A](f: js.Function1[/* a */ A, Boolean], xs: js.Array[A]): js.Array[A] = js.native
    def flatMap[A, B](f: js.Function1[/* x */ A, js.Array[B]], xs: js.Array[A]): js.Array[B] = js.native
    def fold[V, A](xs: js.Array[V], seed: A, f: js.Function2[/* acc */ A, /* x */ V, A]): A = js.native
    def head[V](xs: js.Array[V]): V = js.native
    def id[A](x: A): A = js.native
    def indexOf[A](xs: js.Array[A], x: A): Double = js.native
    def indexWhere[A](xs: js.Array[A], f: js.Function1[/* x */ A, Boolean]): Double = js.native
    def isFunction(f: js.Any): /* is std.Function */ Boolean = js.native
    def last[A](xs: js.Array[A]): A = js.native
    def map[A, B](f: js.Function1[/* a */ A, B], xs: js.Array[A]): js.Array[B] = js.native
    def negate[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* x */ A, Boolean] = js.native
    def remove[V](x: V, xs: js.Array[V]): js.UndefOr[js.Array[V]] = js.native
    def tail[V](xs: js.Array[V]): js.Array[V] = js.native
    def toArray[A](xs: A): js.Array[A] = js.native
    def toArray[A](xs: js.Array[A]): js.Array[A] = js.native
    def toFunction[V, V2](f: V2): js.Function1[/* x */ V, V2] = js.native
    def toFunction[V, V2](f: js.Function1[/* x */ V, V2]): js.Function1[/* x */ V, V2] = js.native
    def toString(obj: js.Any): String = js.native
    def without[A](x: A, xs: js.Array[A]): js.Array[A] = js.native
  }
  
  @js.native
  object later extends js.Object {
    var scheduler: Scheduler = js.native
  }
  
}

