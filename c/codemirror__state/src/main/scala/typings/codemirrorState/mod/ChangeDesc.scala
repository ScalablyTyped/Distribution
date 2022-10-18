package typings.codemirrorState.mod

import typings.codemirrorState.codemirrorStateStrings.cover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
A change description is a variant of [change set](https://codemirror.net/6/docs/ref/#state.ChangeSet)
that doesn't store the inserted text. As such, it can't be
applied, but is cheaper to store and manipulate.
*/
@js.native
trait ChangeDesc extends StObject {
  
  /**
    Compute the combined effect of applying another set of changes
    after this one. The length of the document after this set should
    match the length before `other`.
    */
  def composeDesc(other: ChangeDesc): ChangeDesc = js.native
  
  /**
    False when there are actual changes in this set.
    */
  def empty: Boolean = js.native
  
  /**
    Get a description of the inverted form of these changes.
    */
  def invertedDesc: ChangeDesc = js.native
  
  /**
    Iterate over the ranges changed by these changes. (See
    [`ChangeSet.iterChanges`](https://codemirror.net/6/docs/ref/#state.ChangeSet.iterChanges) for a
    variant that also provides you with the inserted text.)
    `fromA`/`toA` provides the extent of the change in the starting
    document, `fromB`/`toB` the extent of the replacement in the
    changed document.
    
    When `individual` is true, adjacent changes (which are kept
    separate for [position mapping](https://codemirror.net/6/docs/ref/#state.ChangeDesc.mapPos)) are
    reported separately.
    */
  def iterChangedRanges(f: js.Function4[/* fromA */ Double, /* toA */ Double, /* fromB */ Double, /* toB */ Double, Unit]): Unit = js.native
  def iterChangedRanges(
    f: js.Function4[/* fromA */ Double, /* toA */ Double, /* fromB */ Double, /* toB */ Double, Unit],
    individual: Boolean
  ): Unit = js.native
  
  /**
    Iterate over the unchanged parts left by these changes. `posA`
    provides the position of the range in the old document, `posB`
    the new position in the changed document.
    */
  def iterGaps(f: js.Function3[/* posA */ Double, /* posB */ Double, /* length */ Double, Unit]): Unit = js.native
  
  /**
    The length of the document before the change.
    */
  def length: Double = js.native
  
  /**
    Map this description, which should start with the same document
    as `other`, over another set of changes, so that it can be
    applied after it. When `before` is true, map as if the changes
    in `other` happened before the ones in `this`.
    */
  def mapDesc(other: ChangeDesc): ChangeDesc = js.native
  def mapDesc(other: ChangeDesc, before: Boolean): ChangeDesc = js.native
  
  /**
    Map a given position through these changes, to produce a
    position pointing into the new document.
    
    `assoc` indicates which side the position should be associated
    with. When it is negative or zero, the mapping will try to keep
    the position close to the character before it (if any), and will
    move it before insertions at that point or replacements across
    that point. When it is positive, the position is associated with
    the character after it, and will be moved forward for insertions
    at or replacements across the position. Defaults to -1.
    
    `mode` determines whether deletions should be
    [reported](https://codemirror.net/6/docs/ref/#state.MapMode). It defaults to
    [`MapMode.Simple`](https://codemirror.net/6/docs/ref/#state.MapMode.Simple) (don't report
    deletions).
    */
  def mapPos(pos: Double): Double = js.native
  def mapPos(pos: Double, assoc: Double): Double = js.native
  def mapPos(pos: Double, assoc: Double, mode: MapMode): Double | Null = js.native
  
  /**
    The length of the document after the change.
    */
  def newLength: Double = js.native
  
  /**
    Serialize this change desc to a JSON-representable value.
    */
  def toJSON(): js.Array[Double] = js.native
  
  /**
    Check whether these changes touch a given range. When one of the
    changes entirely covers the range, the string `"cover"` is
    returned.
    */
  def touchesRange(from: Double): Boolean | cover = js.native
  def touchesRange(from: Double, to: Double): Boolean | cover = js.native
}
