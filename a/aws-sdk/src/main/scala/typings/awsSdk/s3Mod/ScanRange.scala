package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScanRange extends js.Object {
  
  /**
    * Specifies the end of the byte range. This parameter is optional. Valid values: non-negative integers. The default value is one less than the size of the object being queried. If only the End parameter is supplied, it is interpreted to mean scan the last N bytes of the file. For example, &lt;scanrange&gt;&lt;end&gt;50&lt;/end&gt;&lt;/scanrange&gt; means scan the last 50 bytes.
    */
  var End: js.UndefOr[typings.awsSdk.s3Mod.End] = js.native
  
  /**
    * Specifies the start of the byte range. This parameter is optional. Valid values: non-negative integers. The default value is 0. If only start is supplied, it means scan from that point to the end of the file.For example; &lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;/scanrange&gt; means scan from byte 50 until the end of the file.
    */
  var Start: js.UndefOr[typings.awsSdk.s3Mod.Start] = js.native
}
object ScanRange {
  
  @scala.inline
  def apply(): ScanRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanRange]
  }
  
  @scala.inline
  implicit class ScanRangeOps[Self <: ScanRange] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: End): Self = this.set("End", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("End", js.undefined)
    
    @scala.inline
    def setStart(value: Start): Self = this.set("Start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("Start", js.undefined)
  }
}
