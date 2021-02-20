package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateMetadata extends StObject {
  
  /**
    * The time and date the template was created.
    */
  var CreatedTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the template.
    */
  var Name: js.UndefOr[TemplateName] = js.native
}
object TemplateMetadata {
  
  @scala.inline
  def apply(): TemplateMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateMetadata]
  }
  
  @scala.inline
  implicit class TemplateMetadataMutableBuilder[Self <: TemplateMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedTimestamp(value: Timestamp): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setName(value: TemplateName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
