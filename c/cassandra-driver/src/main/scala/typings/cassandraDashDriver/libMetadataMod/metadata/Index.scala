package typings.cassandraDashDriver.libMetadataMod.metadata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  var kind: IndexKind
  var name: String
  var options: js.Object
  var target: String
  def isCompositesKind(): Boolean
  def isCustomKind(): Boolean
  def isKeysKind(): Boolean
}

object Index {
  @scala.inline
  def apply(
    isCompositesKind: () => Boolean,
    isCustomKind: () => Boolean,
    isKeysKind: () => Boolean,
    kind: IndexKind,
    name: String,
    options: js.Object,
    target: String
  ): Index = {
    val __obj = js.Dynamic.literal(isCompositesKind = js.Any.fromFunction0(isCompositesKind), isCustomKind = js.Any.fromFunction0(isCustomKind), isKeysKind = js.Any.fromFunction0(isKeysKind), kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Index]
  }
}

