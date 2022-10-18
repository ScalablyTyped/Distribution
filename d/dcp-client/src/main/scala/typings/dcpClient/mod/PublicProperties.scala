package typings.dcpClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicProperties extends StObject {
  
  /**
    * Public-facing description of the job.
    */
  var description: String
  
  /**
    * Public-facing link to an external resource about the job.
    */
  var link: String
  
  /**
    * Public-facing name of the job.
    */
  var name: String
}
object PublicProperties {
  
  inline def apply(description: String, link: String, name: String): PublicProperties = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicProperties]
  }
  
  extension [Self <: PublicProperties](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
