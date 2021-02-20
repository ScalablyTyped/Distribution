package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTagOptionOutput extends StObject {
  
  /**
    * Information about the TagOption.
    */
  var TagOptionDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.TagOptionDetail] = js.native
}
object CreateTagOptionOutput {
  
  @scala.inline
  def apply(): CreateTagOptionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTagOptionOutput]
  }
  
  @scala.inline
  implicit class CreateTagOptionOutputMutableBuilder[Self <: CreateTagOptionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTagOptionDetail(value: TagOptionDetail): Self = StObject.set(x, "TagOptionDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagOptionDetailUndefined: Self = StObject.set(x, "TagOptionDetail", js.undefined)
  }
}
