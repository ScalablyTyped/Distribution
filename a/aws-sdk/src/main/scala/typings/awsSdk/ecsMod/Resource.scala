package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resource extends js.Object {
  
  /**
    * When the doubleValue type is set, the value of the resource must be a double precision floating-point type.
    */
  var doubleValue: js.UndefOr[Double] = js.native
  
  /**
    * When the integerValue type is set, the value of the resource must be an integer.
    */
  var integerValue: js.UndefOr[Integer] = js.native
  
  /**
    * When the longValue type is set, the value of the resource must be an extended precision floating-point type.
    */
  var longValue: js.UndefOr[Long] = js.native
  
  /**
    * The name of the resource, such as CPU, MEMORY, PORTS, PORTS_UDP, or a user-defined resource.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * When the stringSetValue type is set, the value of the resource must be a string type.
    */
  var stringSetValue: js.UndefOr[StringList] = js.native
  
  /**
    * The type of the resource, such as INTEGER, DOUBLE, LONG, or STRINGSET.
    */
  var `type`: js.UndefOr[String] = js.native
}
object Resource {
  
  @scala.inline
  def apply(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  
  @scala.inline
  implicit class ResourceOps[Self <: Resource] (val x: Self) extends AnyVal {
    
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
    def setDoubleValue(value: Double): Self = this.set("doubleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoubleValue: Self = this.set("doubleValue", js.undefined)
    
    @scala.inline
    def setIntegerValue(value: Integer): Self = this.set("integerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegerValue: Self = this.set("integerValue", js.undefined)
    
    @scala.inline
    def setLongValue(value: Long): Self = this.set("longValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongValue: Self = this.set("longValue", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setStringSetValueVarargs(value: String*): Self = this.set("stringSetValue", js.Array(value :_*))
    
    @scala.inline
    def setStringSetValue(value: StringList): Self = this.set("stringSetValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringSetValue: Self = this.set("stringSetValue", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
