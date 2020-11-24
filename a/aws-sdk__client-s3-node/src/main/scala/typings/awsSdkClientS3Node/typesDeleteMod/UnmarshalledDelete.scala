package typings.awsSdkClientS3Node.typesDeleteMod

import typings.awsSdkClientS3Node.typesObjectIdentifierMod.UnmarshalledObjectIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledDelete extends Delete {
  
  /**
    * _ObjectIdentifierList shape
    */
  @JSName("Objects")
  var Objects_UnmarshalledDelete: js.Array[UnmarshalledObjectIdentifier] = js.native
}
object UnmarshalledDelete {
  
  @scala.inline
  def apply(Objects: js.Array[UnmarshalledObjectIdentifier]): UnmarshalledDelete = {
    val __obj = js.Dynamic.literal(Objects = Objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledDelete]
  }
  
  @scala.inline
  implicit class UnmarshalledDeleteOps[Self <: UnmarshalledDelete] (val x: Self) extends AnyVal {
    
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
    def setObjectsVarargs(value: UnmarshalledObjectIdentifier*): Self = this.set("Objects", js.Array(value :_*))
    
    @scala.inline
    def setObjects(value: js.Array[UnmarshalledObjectIdentifier]): Self = this.set("Objects", value.asInstanceOf[js.Any])
  }
}
