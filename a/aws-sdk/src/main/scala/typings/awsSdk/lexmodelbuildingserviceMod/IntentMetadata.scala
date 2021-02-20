package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntentMetadata extends StObject {
  
  /**
    * The date that the intent was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * A description of the intent.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * The date that the intent was updated. When you create an intent, the creation date and last updated date are the same.
    */
  var lastUpdatedDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the intent.
    */
  var name: js.UndefOr[IntentName] = js.native
  
  /**
    * The version of the intent.
    */
  var version: js.UndefOr[Version] = js.native
}
object IntentMetadata {
  
  @scala.inline
  def apply(): IntentMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntentMetadata]
  }
  
  @scala.inline
  implicit class IntentMetadataMutableBuilder[Self <: IntentMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedDate(value: Timestamp): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLastUpdatedDate(value: Timestamp): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDateUndefined: Self = StObject.set(x, "lastUpdatedDate", js.undefined)
    
    @scala.inline
    def setName(value: IntentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
