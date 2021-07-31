package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminologyDataLocation extends StObject {
  
  /**
    * The location of the custom terminology data.
    */
  var Location: String
  
  /**
    * The repository type for the custom terminology data.
    */
  var RepositoryType: String
}
object TerminologyDataLocation {
  
  @scala.inline
  def apply(Location: String, RepositoryType: String): TerminologyDataLocation = {
    val __obj = js.Dynamic.literal(Location = Location.asInstanceOf[js.Any], RepositoryType = RepositoryType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminologyDataLocation]
  }
  
  @scala.inline
  implicit class TerminologyDataLocationMutableBuilder[Self <: TerminologyDataLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryType(value: String): Self = StObject.set(x, "RepositoryType", value.asInstanceOf[js.Any])
  }
}
