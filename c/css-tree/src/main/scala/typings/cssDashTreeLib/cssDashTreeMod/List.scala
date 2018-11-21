package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("css-tree", "List")
@js.native
class List[TData] () extends js.Object {
  def append(item: ListItem[TData]): List[TData] = js.native
  def appendData(data: TData): List[TData] = js.native
  def appendList(list: List[TData]): List[TData] = js.native
  def clear(): scala.Unit = js.native
  def copy(): List[TData] = js.native
  def createItem(data: TData): ListItem[TData] = js.native
  def each(fn: IteratorFn[TData, scala.Unit, List[TData]]): scala.Unit = js.native
  def each[TContext](fn: IteratorFn[TData, scala.Unit, TContext], context: TContext): scala.Unit = js.native
  def eachRight(fn: IteratorFn[TData, scala.Unit, List[TData]]): scala.Unit = js.native
  def eachRight[TContext](fn: IteratorFn[TData, scala.Unit, TContext], context: TContext): scala.Unit = js.native
  def filter(fn: IteratorFn[TData, scala.Boolean, List[TData]]): List[TData] = js.native
  def filter[TContext](fn: IteratorFn[TData, scala.Boolean, TContext], context: TContext): List[TData] = js.native
  @JSName("filter")
  def filter_TContextTResultTData[TContext, TResult /* <: TData */](fn: FilterFn[TData, TResult, TContext], context: TContext): List[TResult] = js.native
  @JSName("filter")
  def filter_TResultTData[TResult /* <: TData */](fn: FilterFn[TData, TResult, List[TData]]): List[TResult] = js.native
  def first(): TData | scala.Null = js.native
  def forEach(fn: IteratorFn[TData, scala.Unit, List[TData]]): scala.Unit = js.native
  def forEach[TContext](fn: IteratorFn[TData, scala.Unit, TContext], context: TContext): scala.Unit = js.native
  def forEachRight(fn: IteratorFn[TData, scala.Unit, List[TData]]): scala.Unit = js.native
  def forEachRight[TContext](fn: IteratorFn[TData, scala.Unit, TContext], context: TContext): scala.Unit = js.native
  def fromArray(array: js.Array[TData]): List[TData] = js.native
  def getSize(): scala.Double = js.native
  def insert(item: ListItem[TData], before: ListItem[TData]): List[TData] = js.native
  def insertData(data: TData, before: ListItem[TData]): List[TData] = js.native
  def insertList(list: List[TData], before: ListItem[TData]): List[TData] = js.native
  def isEmpty(): scala.Boolean = js.native
  def last(): TData | scala.Null = js.native
  def map[TResult](fn: IteratorFn[TData, TResult, List[TData]]): List[TResult] = js.native
  def map[TContext, TResult](fn: IteratorFn[TData, TResult, TContext], context: TContext): List[TResult] = js.native
  def nextUntil(start: ListItem[TData], fn: IteratorFn[TData, scala.Boolean, List[TData]]): scala.Unit = js.native
  def nextUntil[TContext](start: ListItem[TData], fn: IteratorFn[TData, scala.Boolean, TContext], context: TContext): scala.Unit = js.native
  def pop(): js.UndefOr[ListItem[TData]] = js.native
  def prepend(item: ListItem[TData]): List[TData] = js.native
  def prependData(data: TData): List[TData] = js.native
  def prependList(list: List[TData]): List[TData] = js.native
  def prevUntil(start: ListItem[TData], fn: IteratorFn[TData, scala.Boolean, List[TData]]): scala.Unit = js.native
  def prevUntil[TContext](start: ListItem[TData], fn: IteratorFn[TData, scala.Boolean, TContext], context: TContext): scala.Unit = js.native
  def push(item: TData): scala.Unit = js.native
  def remove(item: ListItem[TData]): ListItem[TData] = js.native
  def replace(oldItem: ListItem[TData], newItemOrList: List[TData]): List[TData] = js.native
  def replace(oldItem: ListItem[TData], newItemOrList: ListItem[TData]): List[TData] = js.native
  def shift(): js.UndefOr[ListItem[TData]] = js.native
  def some(fn: IteratorFn[TData, scala.Boolean, List[TData]]): scala.Unit = js.native
  def some[TContext](fn: IteratorFn[TData, scala.Boolean, TContext], context: TContext): scala.Unit = js.native
  def toArray(): js.Array[TData] = js.native
  def toJSON(): js.Array[TData] = js.native
  def unshift(data: TData): scala.Unit = js.native
}

