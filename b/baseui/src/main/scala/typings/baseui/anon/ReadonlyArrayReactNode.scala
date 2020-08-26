package typings.baseui.anon

import typings.react.mod.ReactNode
import typings.std.FlatArray
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Array<react.react.ReactNode>> */
@js.native
trait ReadonlyArrayReactNode extends js.Object {
  val concat: js.Function1[/* repeated */ js.Array[ReactNode], js.Array[ReactNode]] = js.native
  val copyWithin: js.Function2[/* target */ Double, /* start */ Double, this.type] = js.native
  val entries: js.Function0[IterableIterator[js.Tuple2[Double, ReactNode]]] = js.native
  val every: js.Function1[
    /* callbackfn */ js.Function3[/* value */ ReactNode, /* index */ Double, /* array */ js.Array[ReactNode], _], 
    Boolean
  ] = js.native
  val fill: js.Function1[/* value */ ReactNode, this.type] = js.native
  val filter: js.Function1[
    /* callbackfn */ js.Function3[
      /* value */ ReactNode, 
      /* index */ Double, 
      /* array */ js.Array[ReactNode], 
      /* is react.react.ReactNode */ Boolean
    ], 
    js.Array[ReactNode]
  ] = js.native
  val find: js.Function1[
    /* predicate */ js.ThisFunction3[
      /* this */ Unit, 
      /* value */ ReactNode, 
      /* index */ Double, 
      /* obj */ js.Array[ReactNode], 
      /* is react.react.ReactNode */ Boolean
    ], 
    js.UndefOr[ReactNode]
  ] = js.native
  val findIndex: js.Function1[
    /* predicate */ js.Function3[/* value */ ReactNode, /* index */ Double, /* obj */ js.Array[ReactNode], _], 
    Double
  ] = js.native
  val flat: js.ThisFunction0[/* this */ js.Any, js.Array[FlatArray[_, typings.baseui.baseuiNumbers.`1`]]] = js.native
  val flatMap: js.Function1[
    /* callback */ js.ThisFunction3[
      /* this */ js.UndefOr[scala.Nothing], 
      /* value */ ReactNode, 
      /* index */ Double, 
      /* array */ js.Array[ReactNode], 
      _ | js.Array[_]
    ], 
    js.Array[_]
  ] = js.native
  val forEach: js.Function1[
    /* callbackfn */ js.Function3[/* value */ ReactNode, /* index */ Double, /* array */ js.Array[ReactNode], Unit], 
    Unit
  ] = js.native
  val includes: js.Function1[/* searchElement */ ReactNode, Boolean] = js.native
  val indexOf: js.Function1[/* searchElement */ ReactNode, Double] = js.native
  val join: js.Function0[String] = js.native
  val keys: js.Function0[IterableIterator[Double]] = js.native
  val lastIndexOf: js.Function1[/* searchElement */ ReactNode, Double] = js.native
  val length: Double = js.native
  val map: js.Function1[
    /* callbackfn */ js.Function3[/* value */ ReactNode, /* index */ Double, /* array */ js.Array[ReactNode], _], 
    js.Array[_]
  ] = js.native
  val pop: js.Function0[js.UndefOr[ReactNode]] = js.native
  val push: js.Function1[/* repeated */ ReactNode, Double] = js.native
  val reduce: js.Function1[
    /* callbackfn */ js.Function4[
      /* previousValue */ ReactNode, 
      /* currentValue */ ReactNode, 
      /* currentIndex */ Double, 
      /* array */ js.Array[ReactNode], 
      ReactNode
    ], 
    ReactNode
  ] = js.native
  val reduceRight: js.Function1[
    /* callbackfn */ js.Function4[
      /* previousValue */ ReactNode, 
      /* currentValue */ ReactNode, 
      /* currentIndex */ Double, 
      /* array */ js.Array[ReactNode], 
      ReactNode
    ], 
    ReactNode
  ] = js.native
  val reverse: js.Function0[js.Array[ReactNode]] = js.native
  val shift: js.Function0[js.UndefOr[ReactNode]] = js.native
  val slice: js.Function0[js.Array[ReactNode]] = js.native
  val some: js.Function1[
    /* callbackfn */ js.Function3[/* value */ ReactNode, /* index */ Double, /* array */ js.Array[ReactNode], _], 
    Boolean
  ] = js.native
  val sort: js.Function0[this.type] = js.native
  val splice: js.Function1[/* start */ Double, js.Array[ReactNode]] = js.native
  @JSName("toLocaleString")
  val toLocaleString_FReadonlyArrayReactNode: js.Function0[String] = js.native
  @JSName("toString")
  val toString_FReadonlyArrayReactNode: js.Function0[String] = js.native
  val unshift: js.Function1[/* repeated */ ReactNode, Double] = js.native
  val values: js.Function0[IterableIterator[ReactNode]] = js.native
}

object ReadonlyArrayReactNode {
  @scala.inline
  def apply(
    concat: /* repeated */ js.Array[ReactNode] => js.Array[ReactNode],
    copyWithin: (/* target */ Double, /* start */ Double) => ReadonlyArrayReactNode,
    entries: () => IterableIterator[js.Tuple2[Double, ReactNode]],
    every: /* callbackfn */ js.Function3[/* value */ ReactNode, /* index */ Double, /* array */ js.Array[ReactNode], _] => Boolean,
    fill: /* value */ ReactNode => ReadonlyArrayReactNode,
    filter: /* callbackfn */ js.Function3[
      /* value */ ReactNode, 
      /* index */ Double, 
      /* array */ js.Array[ReactNode], 
      /* is react.react.ReactNode */ Boolean
    ] => js.Array[ReactNode],
    find: /* predicate */ js.ThisFunction3[
      /* this */ Unit, 
      /* value */ ReactNode, 
      /* index */ Double, 
      /* obj */ js.Array[ReactNode], 
      /* is react.react.ReactNode */ Boolean
    ] => js.UndefOr[ReactNode],
    findIndex: /* predicate */ js.Function3[/* value */ ReactNode, /* index */ Double, /* obj */ js.Array[ReactNode], _] => Double,
    flat: js.ThisFunction0[/* this */ js.Any, js.Array[FlatArray[_, typings.baseui.baseuiNumbers.`1`]]],
    flatMap: /* callback */ js.ThisFunction3[
      /* this */ js.UndefOr[scala.Nothing], 
      /* value */ ReactNode, 
      /* index */ Double, 
      /* array */ js.Array[ReactNode], 
      _ | js.Array[_]
    ] => js.Array[_],
    forEach: /* callbackfn */ js.Function3[/* value */ ReactNode, /* index */ Double, /* array */ js.Array[ReactNode], Unit] => Unit,
    includes: /* searchElement */ ReactNode => Boolean,
    indexOf: /* searchElement */ ReactNode => Double,
    join: () => String,
    keys: () => IterableIterator[Double],
    lastIndexOf: /* searchElement */ ReactNode => Double,
    length: Double,
    map: /* callbackfn */ js.Function3[/* value */ ReactNode, /* index */ Double, /* array */ js.Array[ReactNode], _] => js.Array[_],
    pop: () => js.UndefOr[ReactNode],
    push: /* repeated */ ReactNode => Double,
    reduce: /* callbackfn */ js.Function4[
      /* previousValue */ ReactNode, 
      /* currentValue */ ReactNode, 
      /* currentIndex */ Double, 
      /* array */ js.Array[ReactNode], 
      ReactNode
    ] => ReactNode,
    reduceRight: /* callbackfn */ js.Function4[
      /* previousValue */ ReactNode, 
      /* currentValue */ ReactNode, 
      /* currentIndex */ Double, 
      /* array */ js.Array[ReactNode], 
      ReactNode
    ] => ReactNode,
    reverse: () => js.Array[ReactNode],
    shift: () => js.UndefOr[ReactNode],
    slice: () => js.Array[ReactNode],
    some: /* callbackfn */ js.Function3[/* value */ ReactNode, /* index */ Double, /* array */ js.Array[ReactNode], _] => Boolean,
    sort: () => ReadonlyArrayReactNode,
    splice: /* start */ Double => js.Array[ReactNode],
    toLocaleString: () => String,
    toString: () => String,
    unshift: /* repeated */ ReactNode => Double,
    values: () => IterableIterator[ReactNode]
  ): ReadonlyArrayReactNode = {
    val __obj = js.Dynamic.literal(concat = js.Any.fromFunction1(concat), copyWithin = js.Any.fromFunction2(copyWithin), entries = js.Any.fromFunction0(entries), every = js.Any.fromFunction1(every), fill = js.Any.fromFunction1(fill), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), findIndex = js.Any.fromFunction1(findIndex), flat = flat.asInstanceOf[js.Any], flatMap = js.Any.fromFunction1(flatMap), forEach = js.Any.fromFunction1(forEach), includes = js.Any.fromFunction1(includes), indexOf = js.Any.fromFunction1(indexOf), join = js.Any.fromFunction0(join), keys = js.Any.fromFunction0(keys), lastIndexOf = js.Any.fromFunction1(lastIndexOf), length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), reduce = js.Any.fromFunction1(reduce), reduceRight = js.Any.fromFunction1(reduceRight), reverse = js.Any.fromFunction0(reverse), shift = js.Any.fromFunction0(shift), slice = js.Any.fromFunction0(slice), some = js.Any.fromFunction1(some), sort = js.Any.fromFunction0(sort), splice = js.Any.fromFunction1(splice), toLocaleString = js.Any.fromFunction0(toLocaleString), toString = js.Any.fromFunction0(toString), unshift = js.Any.fromFunction1(unshift), values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[ReadonlyArrayReactNode]
  }
  @scala.inline
  implicit class ReadonlyArrayReactNodeOps[Self <: ReadonlyArrayReactNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConcat(value: /* repeated */ js.Array[ReactNode] => js.Array[ReactNode]): Self = this.set("concat", js.Any.fromFunction1(value))
    @scala.inline
    def setCopyWithin(value: (/* target */ Double, /* start */ Double) => ReadonlyArrayReactNode): Self = this.set("copyWithin", js.Any.fromFunction2(value))
    @scala.inline
    def setEntries(value: () => IterableIterator[js.Tuple2[Double, ReactNode]]): Self = this.set("entries", js.Any.fromFunction0(value))
    @scala.inline
    def setEvery(
      value: /* callbackfn */ js.Function3[/* value */ ReactNode, /* index */ Double, /* array */ js.Array[ReactNode], _] => Boolean
    ): Self = this.set("every", js.Any.fromFunction1(value))
    @scala.inline
    def setFill(value: /* value */ ReactNode => ReadonlyArrayReactNode): Self = this.set("fill", js.Any.fromFunction1(value))
    @scala.inline
    def setFilter(
      value: /* callbackfn */ js.Function3[
          /* value */ ReactNode, 
          /* index */ Double, 
          /* array */ js.Array[ReactNode], 
          /* is react.react.ReactNode */ Boolean
        ] => js.Array[ReactNode]
    ): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def setFind(
      value: /* predicate */ js.ThisFunction3[
          /* this */ Unit, 
          /* value */ ReactNode, 
          /* index */ Double, 
          /* obj */ js.Array[ReactNode], 
          /* is react.react.ReactNode */ Boolean
        ] => js.UndefOr[ReactNode]
    ): Self = this.set("find", js.Any.fromFunction1(value))
    @scala.inline
    def setFindIndex(
      value: /* predicate */ js.Function3[/* value */ ReactNode, /* index */ Double, /* obj */ js.Array[ReactNode], _] => Double
    ): Self = this.set("findIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setFlat(
      value: js.ThisFunction0[/* this */ js.Any, js.Array[FlatArray[_, typings.baseui.baseuiNumbers.`1`]]]
    ): Self = this.set("flat", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlatMap(
      value: /* callback */ js.ThisFunction3[
          /* this */ js.UndefOr[scala.Nothing], 
          /* value */ ReactNode, 
          /* index */ Double, 
          /* array */ js.Array[ReactNode], 
          _ | js.Array[_]
        ] => js.Array[_]
    ): Self = this.set("flatMap", js.Any.fromFunction1(value))
    @scala.inline
    def setForEach(
      value: /* callbackfn */ js.Function3[/* value */ ReactNode, /* index */ Double, /* array */ js.Array[ReactNode], Unit] => Unit
    ): Self = this.set("forEach", js.Any.fromFunction1(value))
    @scala.inline
    def setIncludes(value: /* searchElement */ ReactNode => Boolean): Self = this.set("includes", js.Any.fromFunction1(value))
    @scala.inline
    def setIndexOf(value: /* searchElement */ ReactNode => Double): Self = this.set("indexOf", js.Any.fromFunction1(value))
    @scala.inline
    def setJoin(value: () => String): Self = this.set("join", js.Any.fromFunction0(value))
    @scala.inline
    def setKeys(value: () => IterableIterator[Double]): Self = this.set("keys", js.Any.fromFunction0(value))
    @scala.inline
    def setLastIndexOf(value: /* searchElement */ ReactNode => Double): Self = this.set("lastIndexOf", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap(
      value: /* callbackfn */ js.Function3[/* value */ ReactNode, /* index */ Double, /* array */ js.Array[ReactNode], _] => js.Array[_]
    ): Self = this.set("map", js.Any.fromFunction1(value))
    @scala.inline
    def setPop(value: () => js.UndefOr[ReactNode]): Self = this.set("pop", js.Any.fromFunction0(value))
    @scala.inline
    def setPush(value: /* repeated */ ReactNode => Double): Self = this.set("push", js.Any.fromFunction1(value))
    @scala.inline
    def setReduce(
      value: /* callbackfn */ js.Function4[
          /* previousValue */ ReactNode, 
          /* currentValue */ ReactNode, 
          /* currentIndex */ Double, 
          /* array */ js.Array[ReactNode], 
          ReactNode
        ] => ReactNode
    ): Self = this.set("reduce", js.Any.fromFunction1(value))
    @scala.inline
    def setReduceRight(
      value: /* callbackfn */ js.Function4[
          /* previousValue */ ReactNode, 
          /* currentValue */ ReactNode, 
          /* currentIndex */ Double, 
          /* array */ js.Array[ReactNode], 
          ReactNode
        ] => ReactNode
    ): Self = this.set("reduceRight", js.Any.fromFunction1(value))
    @scala.inline
    def setReverse(value: () => js.Array[ReactNode]): Self = this.set("reverse", js.Any.fromFunction0(value))
    @scala.inline
    def setShift(value: () => js.UndefOr[ReactNode]): Self = this.set("shift", js.Any.fromFunction0(value))
    @scala.inline
    def setSlice(value: () => js.Array[ReactNode]): Self = this.set("slice", js.Any.fromFunction0(value))
    @scala.inline
    def setSome(
      value: /* callbackfn */ js.Function3[/* value */ ReactNode, /* index */ Double, /* array */ js.Array[ReactNode], _] => Boolean
    ): Self = this.set("some", js.Any.fromFunction1(value))
    @scala.inline
    def setSort(value: () => ReadonlyArrayReactNode): Self = this.set("sort", js.Any.fromFunction0(value))
    @scala.inline
    def setSplice(value: /* start */ Double => js.Array[ReactNode]): Self = this.set("splice", js.Any.fromFunction1(value))
    @scala.inline
    def setToLocaleString(value: () => String): Self = this.set("toLocaleString", js.Any.fromFunction0(value))
    @scala.inline
    def setToString(value: () => String): Self = this.set("toString", js.Any.fromFunction0(value))
    @scala.inline
    def setUnshift(value: /* repeated */ ReactNode => Double): Self = this.set("unshift", js.Any.fromFunction1(value))
    @scala.inline
    def setValues(value: () => IterableIterator[ReactNode]): Self = this.set("values", js.Any.fromFunction0(value))
  }
  
}

