package typings.awsSdkClientS3Browser.typesDeleteMod

import typings.awsSdkClientS3Browser.typesObjectIdentifierMod.ObjectIdentifier
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delete extends js.Object {
  
  /**
    * _ObjectIdentifierList shape
    */
  var Objects: js.Array[ObjectIdentifier] | Iterable[ObjectIdentifier] = js.native
  
  /**
    * <p>Element to enable quiet mode for the request. When you add this element, you must set its value to true.</p>
    */
  var Quiet: js.UndefOr[Boolean] = js.native
}
object Delete {
  
  @scala.inline
  def apply(Objects: js.Array[ObjectIdentifier] | Iterable[ObjectIdentifier]): Delete = {
    val __obj = js.Dynamic.literal(Objects = Objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delete]
  }
  
  @scala.inline
  implicit class DeleteOps[Self <: Delete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setObjectsVarargs(value: ObjectIdentifier*): Self = this.set("Objects", js.Array(value :_*))
    
    @scala.inline
    def setObjects(value: js.Array[ObjectIdentifier] | Iterable[ObjectIdentifier]): Self = this.set("Objects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuiet(value: Boolean): Self = this.set("Quiet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuiet: Self = this.set("Quiet", js.undefined)
  }
}
