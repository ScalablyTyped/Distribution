package typings.awsSdk.cloudsearchdomainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hit extends StObject {
  
  /**
    * The expressions returned from a document that matches the search request.
    */
  var exprs: js.UndefOr[Exprs] = js.native
  
  /**
    * The fields returned from a document that matches the search request.
    */
  var fields: js.UndefOr[Fields] = js.native
  
  /**
    * The highlights returned from a document that matches the search request.
    */
  var highlights: js.UndefOr[Highlights] = js.native
  
  /**
    * The document ID of a document that matches the search request.
    */
  var id: js.UndefOr[String] = js.native
}
object Hit {
  
  @scala.inline
  def apply(): Hit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hit]
  }
  
  @scala.inline
  implicit class HitMutableBuilder[Self <: Hit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExprs(value: Exprs): Self = StObject.set(x, "exprs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExprsUndefined: Self = StObject.set(x, "exprs", js.undefined)
    
    @scala.inline
    def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setHighlights(value: Highlights): Self = StObject.set(x, "highlights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightsUndefined: Self = StObject.set(x, "highlights", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
