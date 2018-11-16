package typings
package codemirrorLib.codemirrorMod.CodeMirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EditorChangeLinkedList extends EditorChange {
  /** Points to another change object (which may point to another, etc). */
  var next: js.UndefOr[EditorChangeLinkedList] = js.undefined
}

