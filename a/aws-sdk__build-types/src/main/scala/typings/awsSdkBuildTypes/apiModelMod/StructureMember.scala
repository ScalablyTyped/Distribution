package typings.awsSdkBuildTypes.apiModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StructureMember extends Member {
  
  var location: js.UndefOr[MemberLocation] = js.native
  
  var streaming: js.UndefOr[scala.Boolean] = js.native
  
  var xmlNamespace: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XmlNamespace */ js.Any) | java.lang.String
  ] = js.native
}
object StructureMember {
  
  @scala.inline
  def apply(shape: java.lang.String): StructureMember = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureMember]
  }
  
  @scala.inline
  implicit class StructureMemberOps[Self <: StructureMember] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLocation(value: MemberLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setStreaming(value: scala.Boolean): Self = this.set("streaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreaming: Self = this.set("streaming", js.undefined)
    
    @scala.inline
    def setXmlNamespace(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XmlNamespace */ js.Any) | java.lang.String
    ): Self = this.set("xmlNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlNamespace: Self = this.set("xmlNamespace", js.undefined)
  }
}
