package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityType extends StObject {
  
  /**
    * The name of this activity.  The combination of activity type name and version must be unique within a domain. 
    */
  var name: Name = js.native
  
  /**
    * The version of this activity.  The combination of activity type name and version must be unique with in a domain. 
    */
  var version: Version = js.native
}
object ActivityType {
  
  @scala.inline
  def apply(name: Name, version: Version): ActivityType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityType]
  }
  
  @scala.inline
  implicit class ActivityTypeMutableBuilder[Self <: ActivityType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
