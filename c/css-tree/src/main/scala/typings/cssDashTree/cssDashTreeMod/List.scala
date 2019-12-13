package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("css-tree", "List")
@js.native
class List[TData] () extends js.Object {
  def append(item: ListItem[TData]): List[TData] = js.native
  def appendData(data: TData): List[TData] = js.native
  def appendList(list: List[TData]): List[TData] = js.native
  def clear(): Unit = js.native
  def copy(): List[TData] = js.native
  def createItem(data: TData): ListItem[TData] = js.native
  def each(fn: IteratorFn[TData, Unit, List[TData]]): Unit = js.native
  def each[TContext](fn: IteratorFn[TData, Unit, TContext], context: TContext): Unit = js.native
  def eachRight(fn: IteratorFn[TData, Unit, List[TData]]): Unit = js.native
  def eachRight[TContext](fn: IteratorFn[TData, Unit, TContext], context: TContext): Unit = js.native
  def filter(fn: IteratorFn[TData, Boolean, List[TData]]): List[TData] = js.native
  def filter[TContext](fn: IteratorFn[TData, Boolean, TContext], context: TContext): List[TData] = js.native
  @JSName("filter")
  def filter_TContextTResult_TData[TContext, TResult /* <: TData */](fn: FilterFn[TData, TResult, TContext], context: TContext): List[TResult] = js.native
  @JSName("filter")
  def filter_TResult_TData[TResult /* <: TData */](fn: FilterFn[TData, TResult, List[TData]]): List[TResult] = js.native
  def first(): TData | Null = js.native
  def forEach(fn: IteratorFn[TData, Unit, List[TData]]): Unit = js.native
  def forEach[TContext](fn: IteratorFn[TData, Unit, TContext], context: TContext): Unit = js.native
  def forEachRight(fn: IteratorFn[TData, Unit, List[TData]]): Unit = js.native
  def forEachRight[TContext](fn: IteratorFn[TData, Unit, TContext], context: TContext): Unit = js.native
  def fromArray(array: js.Array[TData]): List[TData] = js.native
  def getSize(): Double = js.native
  def insert(item: ListItem[TData], before: ListItem[TData]): List[TData] = js.native
  def insertData(data: TData, before: ListItem[TData]): List[TData] = js.native
  def insertList(list: List[TData], before: ListItem[TData]): List[TData] = js.native
  def isEmpty(): Boolean = js.native
  def last(): TData | Null = js.native
  def map[TResult](fn: IteratorFn[TData, TResult, List[TData]]): List[TResult] = js.native
  def map[TContext, TResult](fn: IteratorFn[TData, TResult, TContext], context: TContext): List[TResult] = js.native
  def nextUntil(start: ListItem[TData], fn: IteratorFn[TData, Boolean, List[TData]]): Unit = js.native
  def nextUntil[TContext](start: ListItem[TData], fn: IteratorFn[TData, Boolean, TContext], context: TContext): Unit = js.native
  def pop(): js.UndefOr[ListItem[TData]] = js.native
  def prepend(item: ListItem[TData]): List[TData] = js.native
  def prependData(data: TData): List[TData] = js.native
  def prependList(list: List[TData]): List[TData] = js.native
  def prevUntil(start: ListItem[TData], fn: IteratorFn[TData, Boolean, List[TData]]): Unit = js.native
  def prevUntil[TContext](start: ListItem[TData], fn: IteratorFn[TData, Boolean, TContext], context: TContext): Unit = js.native
  def push(item: TData): Unit = js.native
  def remove(item: ListItem[TData]): ListItem[TData] = js.native
  def replace(oldItem: ListItem[TData], newItemOrList: List[TData]): List[TData] = js.native
  def replace(oldItem: ListItem[TData], newItemOrList: ListItem[TData]): List[TData] = js.native
  def shift(): js.UndefOr[ListItem[TData]] = js.native
  def some(fn: IteratorFn[TData, Boolean, List[TData]]): Boolean = js.native
  def some[TContext](fn: IteratorFn[TData, Boolean, TContext], context: TContext): Boolean = js.native
  def toArray(): js.Array[TData] = js.native
  def toJSON(): js.Array[TData] = js.native
  def unshift(data: TData): Unit = js.native
}

