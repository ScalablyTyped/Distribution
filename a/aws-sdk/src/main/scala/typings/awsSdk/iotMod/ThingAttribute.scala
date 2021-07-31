package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThingAttribute extends StObject {
  
  /**
    * A list of thing attributes which are name-value pairs.
    */
  var attributes: js.UndefOr[Attributes] = js.undefined
  
  /**
    * The thing ARN.
    */
  var thingArn: js.UndefOr[ThingArn] = js.undefined
  
  /**
    * The name of the thing.
    */
  var thingName: js.UndefOr[ThingName] = js.undefined
  
  /**
    * The name of the thing type, if the thing has been associated with a type.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
  
  /**
    * The version of the thing record in the registry.
    */
  var version: js.UndefOr[Version] = js.undefined
}
object ThingAttribute {
  
  @scala.inline
  def apply(): ThingAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingAttribute]
  }
  
  @scala.inline
  implicit class ThingAttributeMutableBuilder[Self <: ThingAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setThingArn(value: ThingArn): Self = StObject.set(x, "thingArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingArnUndefined: Self = StObject.set(x, "thingArn", js.undefined)
    
    @scala.inline
    def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingNameUndefined: Self = StObject.set(x, "thingName", js.undefined)
    
    @scala.inline
    def setThingTypeName(value: ThingTypeName): Self = StObject.set(x, "thingTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingTypeNameUndefined: Self = StObject.set(x, "thingTypeName", js.undefined)
    
    @scala.inline
    def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
