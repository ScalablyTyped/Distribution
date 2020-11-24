package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStreamsOutput extends js.Object {
  
  /**
    * If set to true, there are more streams available to list.
    */
  var HasMoreStreams: BooleanObject = js.native
  
  /**
    * The names of the streams that are associated with the AWS account making the ListStreams request.
    */
  var StreamNames: StreamNameList = js.native
}
object ListStreamsOutput {
  
  @scala.inline
  def apply(HasMoreStreams: BooleanObject, StreamNames: StreamNameList): ListStreamsOutput = {
    val __obj = js.Dynamic.literal(HasMoreStreams = HasMoreStreams.asInstanceOf[js.Any], StreamNames = StreamNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStreamsOutput]
  }
  
  @scala.inline
  implicit class ListStreamsOutputOps[Self <: ListStreamsOutput] (val x: Self) extends AnyVal {
    
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
    def setHasMoreStreams(value: BooleanObject): Self = this.set("HasMoreStreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamNamesVarargs(value: StreamName*): Self = this.set("StreamNames", js.Array(value :_*))
    
    @scala.inline
    def setStreamNames(value: StreamNameList): Self = this.set("StreamNames", value.asInstanceOf[js.Any])
  }
}
