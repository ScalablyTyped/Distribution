package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThingTypeMetadata extends js.Object {
  
  /**
    * The date and time when the thing type was created.
    */
  var creationDate: js.UndefOr[CreationDate] = js.native
  
  /**
    * Whether the thing type is deprecated. If true, no new things could be associated with this type.
    */
  var deprecated: js.UndefOr[Boolean] = js.native
  
  /**
    * The date and time when the thing type was deprecated.
    */
  var deprecationDate: js.UndefOr[DeprecationDate] = js.native
}
object ThingTypeMetadata {
  
  @scala.inline
  def apply(): ThingTypeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingTypeMetadata]
  }
  
  @scala.inline
  implicit class ThingTypeMetadataOps[Self <: ThingTypeMetadata] (val x: Self) extends AnyVal {
    
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
    def setCreationDate(value: CreationDate): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    
    @scala.inline
    def setDeprecated(value: Boolean): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecated: Self = this.set("deprecated", js.undefined)
    
    @scala.inline
    def setDeprecationDate(value: DeprecationDate): Self = this.set("deprecationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecationDate: Self = this.set("deprecationDate", js.undefined)
  }
}
