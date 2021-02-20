package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCrawlerRequest extends StObject {
  
  /**
    * The name of the crawler to remove.
    */
  var Name: NameString = js.native
}
object DeleteCrawlerRequest {
  
  @scala.inline
  def apply(Name: NameString): DeleteCrawlerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCrawlerRequest]
  }
  
  @scala.inline
  implicit class DeleteCrawlerRequestMutableBuilder[Self <: DeleteCrawlerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
