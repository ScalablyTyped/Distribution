package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attribute extends StObject {
  
  /**
    * The default value of the asset model property attribute. All assets that you create from the asset model contain this attribute value. You can update an attribute's value after you create an asset. For more information, see Updating attribute values in the AWS IoT SiteWise User Guide.
    */
  var defaultValue: js.UndefOr[DefaultValue] = js.undefined
}
object Attribute {
  
  @scala.inline
  def apply(): Attribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attribute]
  }
  
  @scala.inline
  implicit class AttributeMutableBuilder[Self <: Attribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: DefaultValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
  }
}
