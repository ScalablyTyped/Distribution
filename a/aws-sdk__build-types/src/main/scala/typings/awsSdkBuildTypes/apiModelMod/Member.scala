package typings.awsSdkBuildTypes.apiModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Member extends js.Object {
  
  var documentation: js.UndefOr[java.lang.String] = js.native
  
  var flattened: js.UndefOr[scala.Boolean] = js.native
  
  var locationName: js.UndefOr[java.lang.String] = js.native
  
  var shape: java.lang.String = js.native
  
  var xmlAttribute: js.UndefOr[scala.Boolean] = js.native
}
object Member {
  
  @scala.inline
  def apply(shape: java.lang.String): Member = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Member]
  }
  
  @scala.inline
  implicit class MemberOps[Self <: Member] (val x: Self) extends AnyVal {
    
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
    def setShape(value: java.lang.String): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentation(value: java.lang.String): Self = this.set("documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
    
    @scala.inline
    def setFlattened(value: scala.Boolean): Self = this.set("flattened", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlattened: Self = this.set("flattened", js.undefined)
    
    @scala.inline
    def setLocationName(value: java.lang.String): Self = this.set("locationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationName: Self = this.set("locationName", js.undefined)
    
    @scala.inline
    def setXmlAttribute(value: scala.Boolean): Self = this.set("xmlAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlAttribute: Self = this.set("xmlAttribute", js.undefined)
  }
}
