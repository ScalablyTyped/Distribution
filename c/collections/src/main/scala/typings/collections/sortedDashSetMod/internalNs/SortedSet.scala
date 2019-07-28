package typings.collections.sortedDashSetMod.internalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortedSet[T] extends AbstractSet {
  def add(value: T): Boolean = js.native
  def clear(): Unit = js.native
  def constructClone(): SortedSet[T] = js.native
  def constructClone(values: js.Array[T]): SortedSet[T] = js.native
  def delete(value: T): Boolean = js.native
  def find(value: T): js.UndefOr[Node[T]] = js.native
  def findGreatest(): js.UndefOr[Node[T]] = js.native
  def findGreatest(n: Node[T]): js.UndefOr[Node[T]] = js.native
  def findGreatestLessThan(value: T): js.UndefOr[Node[T]] = js.native
  def findGreatestLessThanOrEqual(value: T): js.UndefOr[Node[T]] = js.native
  def findLeast(): js.UndefOr[Node[T]] = js.native
  def findLeast(n: Node[T]): js.UndefOr[Node[T]] = js.native
  def findLeastGreaterThan(value: T): js.UndefOr[Node[T]] = js.native
  def findLeastGreaterThanOrEqual(value: T): js.UndefOr[Node[T]] = js.native
  def get(elt: T): js.UndefOr[T] = js.native
  def has(elt: T): Boolean = js.native
  def indexOf(value: T): Double = js.native
  def iterate(start: Double, stop: Double): Iterator[T] = js.native
  def max(): js.UndefOr[T] = js.native
  def max(n: Node[T]): js.UndefOr[T] = js.native
  def min(): js.UndefOr[T] = js.native
  def min(n: Node[T]): js.UndefOr[T] = js.native
  def one(): js.UndefOr[T] = js.native
  def pop(): js.UndefOr[T] = js.native
  def push(rest: T*): Unit = js.native
  def reduce(
    callback: js.Function4[
      /* result */ js.UndefOr[js.Any], 
      /* val */ js.UndefOr[js.Any], 
      /* key */ js.UndefOr[js.Any], 
      /* collection */ js.UndefOr[js.Any], 
      _
    ]
  ): js.Any = js.native
  def reduce(
    callback: js.Function4[
      /* result */ js.UndefOr[js.Any], 
      /* val */ js.UndefOr[js.Any], 
      /* key */ js.UndefOr[js.Any], 
      /* collection */ js.UndefOr[js.Any], 
      _
    ],
    basis: js.Any
  ): js.Any = js.native
  def reduce(
    callback: js.Function4[
      /* result */ js.UndefOr[js.Any], 
      /* val */ js.UndefOr[js.Any], 
      /* key */ js.UndefOr[js.Any], 
      /* collection */ js.UndefOr[js.Any], 
      _
    ],
    basis: js.Any,
    thisp: js.Any
  ): js.Any = js.native
  def reduceRight(
    callback: js.Function4[
      /* result */ js.UndefOr[js.Any], 
      /* val */ js.UndefOr[js.Any], 
      /* key */ js.UndefOr[js.Any], 
      /* collection */ js.UndefOr[js.Any], 
      _
    ]
  ): js.Any = js.native
  def reduceRight(
    callback: js.Function4[
      /* result */ js.UndefOr[js.Any], 
      /* val */ js.UndefOr[js.Any], 
      /* key */ js.UndefOr[js.Any], 
      /* collection */ js.UndefOr[js.Any], 
      _
    ],
    basis: js.Any
  ): js.Any = js.native
  def reduceRight(
    callback: js.Function4[
      /* result */ js.UndefOr[js.Any], 
      /* val */ js.UndefOr[js.Any], 
      /* key */ js.UndefOr[js.Any], 
      /* collection */ js.UndefOr[js.Any], 
      _
    ],
    basis: js.Any,
    thisp: js.Any
  ): js.Any = js.native
  def shift(): js.UndefOr[T] = js.native
  def slice(): js.Array[T] = js.native
  def slice(start: Double): js.Array[T] = js.native
  def slice(start: Double, end: Double): js.Array[T] = js.native
  def splay(value: T): Unit = js.native
  def splayIndex(index: Double): Boolean = js.native
  def splice(start: Node[T], length: Double, values: T*): js.Array[T] = js.native
  def swap(start: Double, length: Double): js.Array[T] = js.native
  def swap(start: Double, length: Double, values: js.Array[T]): js.Array[T] = js.native
  def unshift(rest: T*): Unit = js.native
}

