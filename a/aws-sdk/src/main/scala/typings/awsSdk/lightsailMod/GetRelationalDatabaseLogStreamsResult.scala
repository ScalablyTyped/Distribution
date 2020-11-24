package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRelationalDatabaseLogStreamsResult extends js.Object {
  
  /**
    * An object describing the result of your get relational database log streams request.
    */
  var logStreams: js.UndefOr[StringList] = js.native
}
object GetRelationalDatabaseLogStreamsResult {
  
  @scala.inline
  def apply(): GetRelationalDatabaseLogStreamsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseLogStreamsResult]
  }
  
  @scala.inline
  implicit class GetRelationalDatabaseLogStreamsResultOps[Self <: GetRelationalDatabaseLogStreamsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLogStreamsVarargs(value: String*): Self = this.set("logStreams", js.Array(value :_*))
    
    @scala.inline
    def setLogStreams(value: StringList): Self = this.set("logStreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogStreams: Self = this.set("logStreams", js.undefined)
  }
}
