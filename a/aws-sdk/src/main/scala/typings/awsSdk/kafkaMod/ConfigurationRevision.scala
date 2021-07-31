package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationRevision extends StObject {
  
  /**
    * 
    The time when the configuration revision was created.
    
    */
  var CreationTime: timestampIso8601
  
  /**
    * 
    The description of the configuration revision.
    
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The revision number.
    
    */
  var Revision: long
}
object ConfigurationRevision {
  
  @scala.inline
  def apply(CreationTime: timestampIso8601, Revision: long): ConfigurationRevision = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], Revision = Revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationRevision]
  }
  
  @scala.inline
  implicit class ConfigurationRevisionMutableBuilder[Self <: ConfigurationRevision] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: timestampIso8601): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setRevision(value: long): Self = StObject.set(x, "Revision", value.asInstanceOf[js.Any])
  }
}
