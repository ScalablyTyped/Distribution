package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListKafkaVersionsResponse extends js.Object {
  
  var KafkaVersions: js.UndefOr[listOfKafkaVersion] = js.native
  
  var NextToken: js.UndefOr[string] = js.native
}
object ListKafkaVersionsResponse {
  
  @scala.inline
  def apply(): ListKafkaVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListKafkaVersionsResponse]
  }
  
  @scala.inline
  implicit class ListKafkaVersionsResponseOps[Self <: ListKafkaVersionsResponse] (val x: Self) extends AnyVal {
    
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
    def setKafkaVersionsVarargs(value: KafkaVersion*): Self = this.set("KafkaVersions", js.Array(value :_*))
    
    @scala.inline
    def setKafkaVersions(value: listOfKafkaVersion): Self = this.set("KafkaVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKafkaVersions: Self = this.set("KafkaVersions", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
