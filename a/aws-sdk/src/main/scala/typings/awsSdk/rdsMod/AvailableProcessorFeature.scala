package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvailableProcessorFeature extends js.Object {
  
  /**
    * The allowed values for the processor feature of the DB instance class.
    */
  var AllowedValues: js.UndefOr[String] = js.native
  
  /**
    * The default value for the processor feature of the DB instance class.
    */
  var DefaultValue: js.UndefOr[String] = js.native
  
  /**
    * The name of the processor feature. Valid names are coreCount and threadsPerCore.
    */
  var Name: js.UndefOr[String] = js.native
}
object AvailableProcessorFeature {
  
  @scala.inline
  def apply(): AvailableProcessorFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailableProcessorFeature]
  }
  
  @scala.inline
  implicit class AvailableProcessorFeatureOps[Self <: AvailableProcessorFeature] (val x: Self) extends AnyVal {
    
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
    def setAllowedValues(value: String): Self = this.set("AllowedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedValues: Self = this.set("AllowedValues", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("DefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("DefaultValue", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
