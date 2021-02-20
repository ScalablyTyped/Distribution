package typings.awsSdk.iot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacementTemplate extends StObject {
  
  /**
    * The default attributes (key/value pairs) to be applied to all placements using this template.
    */
  var defaultAttributes: js.UndefOr[DefaultPlacementAttributeMap] = js.native
  
  /**
    * An object specifying the DeviceTemplate for all placements using this (PlacementTemplate) template.
    */
  var deviceTemplates: js.UndefOr[DeviceTemplateMap] = js.native
}
object PlacementTemplate {
  
  @scala.inline
  def apply(): PlacementTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementTemplate]
  }
  
  @scala.inline
  implicit class PlacementTemplateMutableBuilder[Self <: PlacementTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultAttributes(value: DefaultPlacementAttributeMap): Self = StObject.set(x, "defaultAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAttributesUndefined: Self = StObject.set(x, "defaultAttributes", js.undefined)
    
    @scala.inline
    def setDeviceTemplates(value: DeviceTemplateMap): Self = StObject.set(x, "deviceTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceTemplatesUndefined: Self = StObject.set(x, "deviceTemplates", js.undefined)
  }
}
