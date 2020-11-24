package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@babel/types", "objectTypeAnnotation")
@js.native
object objectTypeAnnotation extends js.Object {
  
  def apply(
    properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_],
    indexers: js.UndefOr[js.Array[ObjectTypeIndexer_] | Null],
    callProperties: js.UndefOr[js.Array[ObjectTypeCallProperty_] | Null],
    internalSlots: js.UndefOr[js.Array[ObjectTypeInternalSlot_] | Null],
    exact: js.UndefOr[Boolean]
  ): ObjectTypeAnnotation_ = js.native
}
