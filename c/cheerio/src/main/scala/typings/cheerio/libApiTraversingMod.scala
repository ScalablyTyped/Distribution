package typings.cheerio

import typings.cheerio.libCheerioMod.Cheerio
import typings.cheerio.libTypesMod.AcceptedFilters
import typings.domhandler.libNodeMod.AnyNode
import typings.domhandler.mod.Document
import typings.domhandler.mod.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiTraversingMod {
  
  @JSImport("cheerio/lib/api/traversing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def add[S /* <: AnyNode */, T /* <: AnyNode */](other: S): Cheerio[S | T] = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(other.asInstanceOf[js.Any]).asInstanceOf[Cheerio[S | T]]
  inline def add[S /* <: AnyNode */, T /* <: AnyNode */](other: S, context: String): Cheerio[S | T] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(other.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Cheerio[S | T]]
  inline def add[S /* <: AnyNode */, T /* <: AnyNode */](other: S, context: Cheerio[S]): Cheerio[S | T] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(other.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Cheerio[S | T]]
  inline def add[S /* <: AnyNode */, T /* <: AnyNode */](other: String): Cheerio[S | T] = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(other.asInstanceOf[js.Any]).asInstanceOf[Cheerio[S | T]]
  inline def add[S /* <: AnyNode */, T /* <: AnyNode */](other: String, context: String): Cheerio[S | T] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(other.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Cheerio[S | T]]
  inline def add[S /* <: AnyNode */, T /* <: AnyNode */](other: String, context: Cheerio[S]): Cheerio[S | T] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(other.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Cheerio[S | T]]
  inline def add[S /* <: AnyNode */, T /* <: AnyNode */](other: js.Array[S]): Cheerio[S | T] = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(other.asInstanceOf[js.Any]).asInstanceOf[Cheerio[S | T]]
  inline def add[S /* <: AnyNode */, T /* <: AnyNode */](other: js.Array[S], context: String): Cheerio[S | T] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(other.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Cheerio[S | T]]
  inline def add[S /* <: AnyNode */, T /* <: AnyNode */](other: js.Array[S], context: Cheerio[S]): Cheerio[S | T] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(other.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Cheerio[S | T]]
  inline def add[S /* <: AnyNode */, T /* <: AnyNode */](other: Cheerio[S]): Cheerio[S | T] = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(other.asInstanceOf[js.Any]).asInstanceOf[Cheerio[S | T]]
  inline def add[S /* <: AnyNode */, T /* <: AnyNode */](other: Cheerio[S], context: String): Cheerio[S | T] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(other.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Cheerio[S | T]]
  inline def add[S /* <: AnyNode */, T /* <: AnyNode */](other: Cheerio[S], context: Cheerio[S]): Cheerio[S | T] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(other.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Cheerio[S | T]]
  
  inline def addBack[T /* <: AnyNode */](): Cheerio[AnyNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("addBack")().asInstanceOf[Cheerio[AnyNode]]
  inline def addBack[T /* <: AnyNode */](selector: String): Cheerio[AnyNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("addBack")(selector.asInstanceOf[js.Any]).asInstanceOf[Cheerio[AnyNode]]
  
  inline def children[T /* <: AnyNode */](): Cheerio[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("children")().asInstanceOf[Cheerio[Element]]
  inline def children[T /* <: AnyNode */](selector: AcceptedFilters[Element]): Cheerio[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("children")(selector.asInstanceOf[js.Any]).asInstanceOf[Cheerio[Element]]
  
  inline def closest[T /* <: AnyNode */](): Cheerio[AnyNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("closest")().asInstanceOf[Cheerio[AnyNode]]
  inline def closest[T /* <: AnyNode */](selector: AcceptedFilters[Element]): Cheerio[AnyNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("closest")(selector.asInstanceOf[js.Any]).asInstanceOf[Cheerio[AnyNode]]
  
  inline def contents[T /* <: AnyNode */](): Cheerio[AnyNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("contents")().asInstanceOf[Cheerio[AnyNode]]
  
  inline def each[T](fn: js.ThisFunction2[/* this */ T, /* i */ Double, /* el */ T, Unit | Boolean]): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any]).asInstanceOf[Cheerio[T]]
  
  inline def end[T](): Cheerio[AnyNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("end")().asInstanceOf[Cheerio[AnyNode]]
  
  inline def eq_[T](i: Double): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("eq")(i.asInstanceOf[js.Any]).asInstanceOf[Cheerio[T]]
  
  inline def filter[T](`match`: String): Cheerio[
    /* import warning: importer.ImportType#apply Failed type conversion: string extends string ? domhandler.domhandler.Element : T */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(`match`.asInstanceOf[js.Any]).asInstanceOf[Cheerio[
    /* import warning: importer.ImportType#apply Failed type conversion: string extends string ? domhandler.domhandler.Element : T */ js.Any
  ]]
  inline def filter[T](`match`: Cheerio[T]): Cheerio[
    /* import warning: importer.ImportType#apply Failed type conversion: cheerio.cheerio/lib/cheerio.Cheerio<T> extends string ? domhandler.domhandler.Element : T */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(`match`.asInstanceOf[js.Any]).asInstanceOf[Cheerio[
    /* import warning: importer.ImportType#apply Failed type conversion: cheerio.cheerio/lib/cheerio.Cheerio<T> extends string ? domhandler.domhandler.Element : T */ js.Any
  ]]
  inline def filter[T, S /* <: (js.ThisFunction2[/* this */ T, /* i */ Double, /* el */ T, Boolean]) | T */](`match`: S): Cheerio[
    /* import warning: importer.ImportType#apply Failed type conversion: S extends string ? domhandler.domhandler.Element : T */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(`match`.asInstanceOf[js.Any]).asInstanceOf[Cheerio[
    /* import warning: importer.ImportType#apply Failed type conversion: S extends string ? domhandler.domhandler.Element : T */ js.Any
  ]]
  inline def filter[T, S /* <: T */](`match`: js.ThisFunction2[/* this */ T, /* index */ Double, /* value */ T, /* is S */ Boolean]): Cheerio[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(`match`.asInstanceOf[js.Any]).asInstanceOf[Cheerio[S]]
  
  inline def filterArray[T](nodes: js.Array[T], `match`: AcceptedFilters[T]): js.Array[Element | T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterArray")(nodes.asInstanceOf[js.Any], `match`.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element | T]]
  inline def filterArray[T](nodes: js.Array[T], `match`: AcceptedFilters[T], xmlMode: Boolean): js.Array[Element | T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterArray")(nodes.asInstanceOf[js.Any], `match`.asInstanceOf[js.Any], xmlMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element | T]]
  inline def filterArray[T](nodes: js.Array[T], `match`: AcceptedFilters[T], xmlMode: Boolean, root: Document): js.Array[Element | T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterArray")(nodes.asInstanceOf[js.Any], `match`.asInstanceOf[js.Any], xmlMode.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element | T]]
  inline def filterArray[T](nodes: js.Array[T], `match`: AcceptedFilters[T], xmlMode: Unit, root: Document): js.Array[Element | T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterArray")(nodes.asInstanceOf[js.Any], `match`.asInstanceOf[js.Any], xmlMode.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element | T]]
  
  inline def find[T /* <: AnyNode */](): Cheerio[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")().asInstanceOf[Cheerio[Element]]
  inline def find[T /* <: AnyNode */](selectorOrHaystack: String): Cheerio[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(selectorOrHaystack.asInstanceOf[js.Any]).asInstanceOf[Cheerio[Element]]
  inline def find[T /* <: AnyNode */](selectorOrHaystack: Cheerio[Element]): Cheerio[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(selectorOrHaystack.asInstanceOf[js.Any]).asInstanceOf[Cheerio[Element]]
  inline def find[T /* <: AnyNode */](selectorOrHaystack: Element): Cheerio[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(selectorOrHaystack.asInstanceOf[js.Any]).asInstanceOf[Cheerio[Element]]
  
  inline def first[T /* <: AnyNode */](): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("first")().asInstanceOf[Cheerio[T]]
  
  inline def get[T](): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Array[T]]
  inline def get[T](i: Double): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(i.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  inline def has(selectorOrHaystack: String): Cheerio[AnyNode | Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("has")(selectorOrHaystack.asInstanceOf[js.Any]).asInstanceOf[Cheerio[AnyNode | Element]]
  inline def has(selectorOrHaystack: Cheerio[Element]): Cheerio[AnyNode | Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("has")(selectorOrHaystack.asInstanceOf[js.Any]).asInstanceOf[Cheerio[AnyNode | Element]]
  inline def has(selectorOrHaystack: Element): Cheerio[AnyNode | Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("has")(selectorOrHaystack.asInstanceOf[js.Any]).asInstanceOf[Cheerio[AnyNode | Element]]
  
  inline def index[T /* <: AnyNode */](): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("index")().asInstanceOf[Double]
  inline def index[T /* <: AnyNode */](selectorOrNeedle: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("index")(selectorOrNeedle.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def index[T /* <: AnyNode */](selectorOrNeedle: Cheerio[AnyNode]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("index")(selectorOrNeedle.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def index[T /* <: AnyNode */](selectorOrNeedle: AnyNode): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("index")(selectorOrNeedle.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def is[T](): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")().asInstanceOf[Boolean]
  inline def is[T](selector: AcceptedFilters[T]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(selector.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def last[T](): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("last")().asInstanceOf[Cheerio[T]]
  
  inline def map[T, M](fn: js.ThisFunction2[/* this */ T, /* i */ Double, /* el */ T, js.UndefOr[js.Array[M] | M | Null]]): Cheerio[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(fn.asInstanceOf[js.Any]).asInstanceOf[Cheerio[M]]
  
  inline def next[T /* <: AnyNode */](): Cheerio[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("next")().asInstanceOf[Cheerio[Element]]
  inline def next[T /* <: AnyNode */](selector: AcceptedFilters[Element]): Cheerio[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("next")(selector.asInstanceOf[js.Any]).asInstanceOf[Cheerio[Element]]
  
  inline def nextAll[T /* <: AnyNode */](): Cheerio[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("nextAll")().asInstanceOf[Cheerio[Element]]
  inline def nextAll[T /* <: AnyNode */](selector: AcceptedFilters[Element]): Cheerio[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("nextAll")(selector.asInstanceOf[js.Any]).asInstanceOf[Cheerio[Element]]
  
  inline def nextUntil[T /* <: AnyNode */](): Cheerio[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("nextUntil")().asInstanceOf[Cheerio[Element]]
  inline def nextUntil[T /* <: AnyNode */](selector: Null, filterSelector: AcceptedFilters[Element]): Cheerio[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("nextUntil")(selector.asInstanceOf[js.Any], filterSelector.asInstanceOf[js.Any])).asInstanceOf[Cheerio[Element]]
  inline def nextUntil[T /* <: AnyNode */](selector: Unit, filterSelector: AcceptedFilters[Element]): Cheerio[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("nextUntil")(selector.asInstanceOf[js.Any], filterSelector.asInstanceOf[js.Any])).asInstanceOf[Cheerio[Element]]
  inline def nextUntil[T /* <: AnyNode */](selector: AcceptedFilters[Element]): Cheerio[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("nextUntil")(selector.asInstanceOf[js.Any]).asInstanceOf[Cheerio[Element]]
  inline def nextUntil[T /* <: AnyNode */](selector: AcceptedFilters[Element], filterSelector: AcceptedFilters[Element]): Cheerio[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("nextUntil")(selector.asInstanceOf[js.Any], filterSelector.asInstanceOf[js.Any])).asInstanceOf[Cheerio[Element]]
  
  inline def not[T /* <: AnyNode */](`match`: AcceptedFilters[T]): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(`match`.asInstanceOf[js.Any]).asInstanceOf[Cheerio[T]]
  
  inline def parent[T /* <: AnyNode */](): Cheerio[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("parent")().asInstanceOf[Cheerio[Element]]
  inline def parent[T /* <: AnyNode */](selector: AcceptedFilters[Element]): Cheerio[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("parent")(selector.asInstanceOf[js.Any]).asInstanceOf[Cheerio[Element]]
  
  inline def parents[T /* <: AnyNode */](): Cheerio[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("parents")().asInstanceOf[Cheerio[Element]]
  inline def parents[T /* <: AnyNode */](selector: AcceptedFilters[Element]): Cheerio[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("parents")(selector.asInstanceOf[js.Any]).asInstanceOf[Cheerio[Element]]
  
  inline def parentsUntil[T /* <: AnyNode */](): Cheerio[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("parentsUntil")().asInstanceOf[Cheerio[Element]]
  inline def parentsUntil[T /* <: AnyNode */](selector: Null, filterSelector: AcceptedFilters[Element]): Cheerio[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("parentsUntil")(selector.asInstanceOf[js.Any], filterSelector.asInstanceOf[js.Any])).asInstanceOf[Cheerio[Element]]
  inline def parentsUntil[T /* <: AnyNode */](selector: Unit, filterSelector: AcceptedFilters[Element]): Cheerio[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("parentsUntil")(selector.asInstanceOf[js.Any], filterSelector.asInstanceOf[js.Any])).asInstanceOf[Cheerio[Element]]
  inline def parentsUntil[T /* <: AnyNode */](selector: AcceptedFilters[Element]): Cheerio[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("parentsUntil")(selector.asInstanceOf[js.Any]).asInstanceOf[Cheerio[Element]]
  inline def parentsUntil[T /* <: AnyNode */](selector: AcceptedFilters[Element], filterSelector: AcceptedFilters[Element]): Cheerio[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("parentsUntil")(selector.asInstanceOf[js.Any], filterSelector.asInstanceOf[js.Any])).asInstanceOf[Cheerio[Element]]
  
  inline def prev[T /* <: AnyNode */](): Cheerio[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("prev")().asInstanceOf[Cheerio[Element]]
  inline def prev[T /* <: AnyNode */](selector: AcceptedFilters[Element]): Cheerio[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("prev")(selector.asInstanceOf[js.Any]).asInstanceOf[Cheerio[Element]]
  
  inline def prevAll[T /* <: AnyNode */](): Cheerio[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("prevAll")().asInstanceOf[Cheerio[Element]]
  inline def prevAll[T /* <: AnyNode */](selector: AcceptedFilters[Element]): Cheerio[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("prevAll")(selector.asInstanceOf[js.Any]).asInstanceOf[Cheerio[Element]]
  
  inline def prevUntil[T /* <: AnyNode */](): Cheerio[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("prevUntil")().asInstanceOf[Cheerio[Element]]
  inline def prevUntil[T /* <: AnyNode */](selector: Null, filterSelector: AcceptedFilters[Element]): Cheerio[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("prevUntil")(selector.asInstanceOf[js.Any], filterSelector.asInstanceOf[js.Any])).asInstanceOf[Cheerio[Element]]
  inline def prevUntil[T /* <: AnyNode */](selector: Unit, filterSelector: AcceptedFilters[Element]): Cheerio[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("prevUntil")(selector.asInstanceOf[js.Any], filterSelector.asInstanceOf[js.Any])).asInstanceOf[Cheerio[Element]]
  inline def prevUntil[T /* <: AnyNode */](selector: AcceptedFilters[Element]): Cheerio[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("prevUntil")(selector.asInstanceOf[js.Any]).asInstanceOf[Cheerio[Element]]
  inline def prevUntil[T /* <: AnyNode */](selector: AcceptedFilters[Element], filterSelector: AcceptedFilters[Element]): Cheerio[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("prevUntil")(selector.asInstanceOf[js.Any], filterSelector.asInstanceOf[js.Any])).asInstanceOf[Cheerio[Element]]
  
  inline def siblings[T /* <: AnyNode */](): Cheerio[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("siblings")().asInstanceOf[Cheerio[Element]]
  inline def siblings[T /* <: AnyNode */](selector: AcceptedFilters[Element]): Cheerio[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("siblings")(selector.asInstanceOf[js.Any]).asInstanceOf[Cheerio[Element]]
  
  inline def slice[T](): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")().asInstanceOf[Cheerio[T]]
  inline def slice[T](start: Double): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any]).asInstanceOf[Cheerio[T]]
  inline def slice[T](start: Double, end: Double): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  inline def slice[T](start: Unit, end: Double): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  
  inline def toArray[T](): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")().asInstanceOf[js.Array[T]]
}
