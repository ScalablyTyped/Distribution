package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusCodes extends js.Object {
  
  /**
    * The percentage of requests over the last 10 seconds that resulted in a 2xx (200, 201, etc.) status code.
    */
  var Status2xx: js.UndefOr[NullableInteger] = js.native
  
  /**
    * The percentage of requests over the last 10 seconds that resulted in a 3xx (300, 301, etc.) status code.
    */
  var Status3xx: js.UndefOr[NullableInteger] = js.native
  
  /**
    * The percentage of requests over the last 10 seconds that resulted in a 4xx (400, 401, etc.) status code.
    */
  var Status4xx: js.UndefOr[NullableInteger] = js.native
  
  /**
    * The percentage of requests over the last 10 seconds that resulted in a 5xx (500, 501, etc.) status code.
    */
  var Status5xx: js.UndefOr[NullableInteger] = js.native
}
object StatusCodes {
  
  @scala.inline
  def apply(): StatusCodes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusCodes]
  }
  
  @scala.inline
  implicit class StatusCodesOps[Self <: StatusCodes] (val x: Self) extends AnyVal {
    
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
    def setStatus2xx(value: NullableInteger): Self = this.set("Status2xx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus2xx: Self = this.set("Status2xx", js.undefined)
    
    @scala.inline
    def setStatus3xx(value: NullableInteger): Self = this.set("Status3xx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus3xx: Self = this.set("Status3xx", js.undefined)
    
    @scala.inline
    def setStatus4xx(value: NullableInteger): Self = this.set("Status4xx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus4xx: Self = this.set("Status4xx", js.undefined)
    
    @scala.inline
    def setStatus5xx(value: NullableInteger): Self = this.set("Status5xx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus5xx: Self = this.set("Status5xx", js.undefined)
  }
}
