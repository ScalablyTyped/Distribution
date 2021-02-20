package typings.awsSdk.servicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationSummary extends StObject {
  
  /**
    * The Amazon resource name (ARN) that specifies the application across services.
    */
  var arn: js.UndefOr[ApplicationArn] = js.native
  
  /**
    * The ISO-8601 formatted timestamp of the moment when the application was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The description of the application.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * The identifier of the application.
    */
  var id: js.UndefOr[ApplicationId] = js.native
  
  /**
    *  The ISO-8601 formatted timestamp of the moment when the application was last updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the application. The name must be unique in the region in which you are creating the application.
    */
  var name: js.UndefOr[Name] = js.native
}
object ApplicationSummary {
  
  @scala.inline
  def apply(): ApplicationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationSummary]
  }
  
  @scala.inline
  implicit class ApplicationSummaryMutableBuilder[Self <: ApplicationSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ApplicationArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: ApplicationId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLastUpdateTime(value: Timestamp): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
