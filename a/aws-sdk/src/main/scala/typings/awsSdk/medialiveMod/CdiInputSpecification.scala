package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CdiInputSpecification extends StObject {
  
  /**
    * Maximum CDI input resolution
    */
  var Resolution: js.UndefOr[CdiInputResolution] = js.native
}
object CdiInputSpecification {
  
  @scala.inline
  def apply(): CdiInputSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CdiInputSpecification]
  }
  
  @scala.inline
  implicit class CdiInputSpecificationMutableBuilder[Self <: CdiInputSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolution(value: CdiInputResolution): Self = StObject.set(x, "Resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionUndefined: Self = StObject.set(x, "Resolution", js.undefined)
  }
}
