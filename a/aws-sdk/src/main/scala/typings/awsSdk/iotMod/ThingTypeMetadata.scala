package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThingTypeMetadata extends StObject {
  
  /**
    * The date and time when the thing type was created.
    */
  var creationDate: js.UndefOr[CreationDate] = js.undefined
  
  /**
    * Whether the thing type is deprecated. If true, no new things could be associated with this type.
    */
  var deprecated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The date and time when the thing type was deprecated.
    */
  var deprecationDate: js.UndefOr[DeprecationDate] = js.undefined
}
object ThingTypeMetadata {
  
  @scala.inline
  def apply(): ThingTypeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingTypeMetadata]
  }
  
  @scala.inline
  implicit class ThingTypeMetadataMutableBuilder[Self <: ThingTypeMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: CreationDate): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    @scala.inline
    def setDeprecationDate(value: DeprecationDate): Self = StObject.set(x, "deprecationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecationDateUndefined: Self = StObject.set(x, "deprecationDate", js.undefined)
  }
}
