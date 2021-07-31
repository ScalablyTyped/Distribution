package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTagOptionOutput extends StObject {
  
  /**
    * Information about the TagOption.
    */
  var TagOptionDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.TagOptionDetail] = js.undefined
}
object UpdateTagOptionOutput {
  
  @scala.inline
  def apply(): UpdateTagOptionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTagOptionOutput]
  }
  
  @scala.inline
  implicit class UpdateTagOptionOutputMutableBuilder[Self <: UpdateTagOptionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTagOptionDetail(value: TagOptionDetail): Self = StObject.set(x, "TagOptionDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagOptionDetailUndefined: Self = StObject.set(x, "TagOptionDetail", js.undefined)
  }
}
