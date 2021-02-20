package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkPicture extends EmbindObject[SkPicture] {
  
  /**
    * Returns the serialized format of this SkPicture. The format may change at anytime and
    * no promises are made for backwards or forward compatibility.
    */
  def serialize(): SkData = js.native
}
object SkPicture {
  
  @scala.inline
  def apply(
    delete: () => Unit,
    deleteAfter: () => Unit,
    isAliasOf: js.Any => Boolean,
    isDeleted: () => Boolean,
    serialize: () => SkData
  ): SkPicture = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteAfter = js.Any.fromFunction0(deleteAfter), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted), serialize = js.Any.fromFunction0(serialize))
    __obj.asInstanceOf[SkPicture]
  }
  
  @scala.inline
  implicit class SkPictureMutableBuilder[Self <: SkPicture] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSerialize(value: () => SkData): Self = StObject.set(x, "serialize", js.Any.fromFunction0(value))
  }
}
