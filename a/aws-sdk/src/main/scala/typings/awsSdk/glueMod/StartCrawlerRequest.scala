package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartCrawlerRequest extends StObject {
  
  /**
    * Name of the crawler to start.
    */
  var Name: NameString
}
object StartCrawlerRequest {
  
  inline def apply(Name: NameString): StartCrawlerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartCrawlerRequest]
  }
  
  extension [Self <: StartCrawlerRequest](x: Self) {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
