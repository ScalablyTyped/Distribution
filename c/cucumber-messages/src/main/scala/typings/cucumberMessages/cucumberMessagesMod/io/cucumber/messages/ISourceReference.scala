package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SourceReference. */
trait ISourceReference extends StObject {
  
  /** SourceReference location */
  var location: js.UndefOr[ILocation | Null] = js.undefined
  
  /** SourceReference uri */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object ISourceReference {
  
  @scala.inline
  def apply(): ISourceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISourceReference]
  }
  
  @scala.inline
  implicit class ISourceReferenceMutableBuilder[Self <: ISourceReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: ILocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationNull: Self = StObject.set(x, "location", null)
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriNull: Self = StObject.set(x, "uri", null)
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
