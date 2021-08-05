package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopCrawlerRequest extends StObject {
  
  /**
    * Name of the crawler to stop.
    */
  var Name: NameString
}
object StopCrawlerRequest {
  
  inline def apply(Name: NameString): StopCrawlerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopCrawlerRequest]
  }
  
  extension [Self <: StopCrawlerRequest](x: Self) {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
