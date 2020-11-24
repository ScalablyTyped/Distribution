package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.chrome.fileSystemProvider.internal.RequestedEventOptions
import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetActionsRequestedEventOptions extends RequestedEventOptions {
  
  /** The path of the entry to which this operation is related to. */
  var entryPaths: js.Array[String] = js.native
}
object GetActionsRequestedEventOptions {
  
  @scala.inline
  def apply(entryPaths: js.Array[String], fileSystemId: String, requestId: integer): GetActionsRequestedEventOptions = {
    val __obj = js.Dynamic.literal(entryPaths = entryPaths.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetActionsRequestedEventOptions]
  }
  
  @scala.inline
  implicit class GetActionsRequestedEventOptionsOps[Self <: GetActionsRequestedEventOptions] (val x: Self) extends AnyVal {
    
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
    def setEntryPathsVarargs(value: String*): Self = this.set("entryPaths", js.Array(value :_*))
    
    @scala.inline
    def setEntryPaths(value: js.Array[String]): Self = this.set("entryPaths", value.asInstanceOf[js.Any])
  }
}
