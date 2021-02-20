package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationRevision extends StObject {
  
  /**
    * Required. The date and time of the configuration revision.
    */
  var Created: js.UndefOr[timestampIso8601] = js.native
  
  /**
    * The description of the configuration revision.
    */
  var Description: js.UndefOr[string] = js.native
  
  /**
    * Required. The revision number of the configuration.
    */
  var Revision: js.UndefOr[integer] = js.native
}
object ConfigurationRevision {
  
  @scala.inline
  def apply(): ConfigurationRevision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationRevision]
  }
  
  @scala.inline
  implicit class ConfigurationRevisionMutableBuilder[Self <: ConfigurationRevision] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: timestampIso8601): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "Created", js.undefined)
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setRevision(value: integer): Self = StObject.set(x, "Revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionUndefined: Self = StObject.set(x, "Revision", js.undefined)
  }
}
