package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListVersionsByFunctionResponse extends js.Object {
  
  /**
    * The pagination token that's included if more results are available.
    */
  var NextMarker: js.UndefOr[String] = js.native
  
  /**
    * A list of Lambda function versions.
    */
  var Versions: js.UndefOr[FunctionList] = js.native
}
object ListVersionsByFunctionResponse {
  
  @scala.inline
  def apply(): ListVersionsByFunctionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVersionsByFunctionResponse]
  }
  
  @scala.inline
  implicit class ListVersionsByFunctionResponseOps[Self <: ListVersionsByFunctionResponse] (val x: Self) extends AnyVal {
    
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
    def setNextMarker(value: String): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: FunctionConfiguration*): Self = this.set("Versions", js.Array(value :_*))
    
    @scala.inline
    def setVersions(value: FunctionList): Self = this.set("Versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersions: Self = this.set("Versions", js.undefined)
  }
}
