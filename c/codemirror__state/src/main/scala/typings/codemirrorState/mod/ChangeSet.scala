package typings.codemirrorState.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
A change set represents a group of modifications to a document. It
stores the document length, and can only be applied to documents
with exactly that length.
*/
@js.native
trait ChangeSet
  extends StObject
     with ChangeDesc
     with _ChangeSpec {
  
  /**
    Apply the changes to a document, returning the modified
    document.
    */
  @JSName("apply")
  def apply(doc: Text): Text = js.native
  
  /**
    Combine two subsequent change sets into a single set. `other`
    must start in the document produced by `this`. If `this` goes
    `docA` → `docB` and `other` represents `docB` → `docC`, the
    returned value will represent the change `docA` → `docC`.
    */
  def compose(other: ChangeSet): ChangeSet = js.native
  
  /**
    Get a [change description](https://codemirror.net/6/docs/ref/#state.ChangeDesc) for this change
    set.
    */
  def desc: ChangeDesc = js.native
  
  /**
    Given the document as it existed _before_ the changes, return a
    change set that represents the inverse of this set, which could
    be used to go from the document created by the changes back to
    the document as it existed before the changes.
    */
  def invert(doc: Text): ChangeSet = js.native
  
  /**
    Iterate over the changed ranges in the document, calling `f` for
    each, with the range in the original document (`fromA`-`toA`)
    and the range that replaces it in the new document
    (`fromB`-`toB`).
    
    When `individual` is true, adjacent changes are reported
    separately.
    */
  def iterChanges(
    f: js.Function5[
      /* fromA */ Double, 
      /* toA */ Double, 
      /* fromB */ Double, 
      /* toB */ Double, 
      /* inserted */ Text, 
      Unit
    ]
  ): Unit = js.native
  def iterChanges(
    f: js.Function5[
      /* fromA */ Double, 
      /* toA */ Double, 
      /* fromB */ Double, 
      /* toB */ Double, 
      /* inserted */ Text, 
      Unit
    ],
    individual: Boolean
  ): Unit = js.native
  
  /**
    Given another change set starting in the same document, maps this
    change set over the other, producing a new change set that can be
    applied to the document produced by applying `other`. When
    `before` is `true`, order changes as if `this` comes before
    `other`, otherwise (the default) treat `other` as coming first.
    
    Given two changes `A` and `B`, `A.compose(B.map(A))` and
    `B.compose(A.map(B, true))` will produce the same document. This
    provides a basic form of [operational
    transformation](https://en.wikipedia.org/wiki/Operational_transformation),
    and can be used for collaborative editing.
    */
  def map(other: ChangeDesc): ChangeSet = js.native
  def map(other: ChangeDesc, before: Boolean): ChangeSet = js.native
}
