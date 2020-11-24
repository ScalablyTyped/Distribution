package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPipelinesResponse extends js.Object {
  
  /**
    * A value that you use to access the second and subsequent pages of results, if any. When the pipelines fit on one page or when you've reached the last page of results, the value of NextPageToken is null.
    */
  var NextPageToken: js.UndefOr[Id] = js.native
  
  /**
    * An array of Pipeline objects.
    */
  var Pipelines: js.UndefOr[typings.awsSdk.elastictranscoderMod.Pipelines] = js.native
}
object ListPipelinesResponse {
  
  @scala.inline
  def apply(): ListPipelinesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPipelinesResponse]
  }
  
  @scala.inline
  implicit class ListPipelinesResponseOps[Self <: ListPipelinesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextPageToken(value: Id): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("NextPageToken", js.undefined)
    
    @scala.inline
    def setPipelinesVarargs(value: Pipeline*): Self = this.set("Pipelines", js.Array(value :_*))
    
    @scala.inline
    def setPipelines(value: Pipelines): Self = this.set("Pipelines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePipelines: Self = this.set("Pipelines", js.undefined)
  }
}
