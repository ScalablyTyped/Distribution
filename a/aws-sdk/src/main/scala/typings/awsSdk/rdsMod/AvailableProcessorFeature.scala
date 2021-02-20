package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvailableProcessorFeature extends StObject {
  
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
  implicit class AvailableProcessorFeatureMutableBuilder[Self <: AvailableProcessorFeature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedValues(value: String): Self = StObject.set(x, "AllowedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedValuesUndefined: Self = StObject.set(x, "AllowedValues", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "DefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "DefaultValue", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
