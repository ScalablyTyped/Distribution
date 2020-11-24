package typings.awsSdkBuildTypes.apiModelMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait String
  extends ShapeDef
     with Shape {
  
  var enum: js.UndefOr[js.Array[java.lang.String]] = js.native
  
  var idempotencyToken: js.UndefOr[scala.Boolean] = js.native
  
  var jsonValue: js.UndefOr[scala.Boolean] = js.native
  
  var max: js.UndefOr[scala.Double] = js.native
  
  var min: js.UndefOr[scala.Double] = js.native
  
  var pattern: js.UndefOr[java.lang.String] = js.native
  
  @JSName("type")
  val type_String: string = js.native
}
object String {
  
  @scala.inline
  def apply(`type`: string): String = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[String]
  }
  
  @scala.inline
  implicit class StringOps[Self <: String] (val x: Self) extends AnyVal {
    
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
    def setType(value: string): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumVarargs(value: java.lang.String*): Self = this.set("enum", js.Array(value :_*))
    
    @scala.inline
    def setEnum(value: js.Array[java.lang.String]): Self = this.set("enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnum: Self = this.set("enum", js.undefined)
    
    @scala.inline
    def setIdempotencyToken(value: scala.Boolean): Self = this.set("idempotencyToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdempotencyToken: Self = this.set("idempotencyToken", js.undefined)
    
    @scala.inline
    def setJsonValue(value: scala.Boolean): Self = this.set("jsonValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonValue: Self = this.set("jsonValue", js.undefined)
    
    @scala.inline
    def setMax(value: scala.Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: scala.Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setPattern(value: java.lang.String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
  }
}
