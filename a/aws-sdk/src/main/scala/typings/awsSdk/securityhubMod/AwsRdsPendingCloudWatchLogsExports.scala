package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRdsPendingCloudWatchLogsExports extends js.Object {
  
  /**
    * A list of log types that are being disabled.
    */
  var LogTypesToDisable: js.UndefOr[StringList] = js.native
  
  /**
    * A list of log types that are being enabled.
    */
  var LogTypesToEnable: js.UndefOr[StringList] = js.native
}
object AwsRdsPendingCloudWatchLogsExports {
  
  @scala.inline
  def apply(): AwsRdsPendingCloudWatchLogsExports = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsPendingCloudWatchLogsExports]
  }
  
  @scala.inline
  implicit class AwsRdsPendingCloudWatchLogsExportsOps[Self <: AwsRdsPendingCloudWatchLogsExports] (val x: Self) extends AnyVal {
    
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
    def setLogTypesToDisableVarargs(value: NonEmptyString*): Self = this.set("LogTypesToDisable", js.Array(value :_*))
    
    @scala.inline
    def setLogTypesToDisable(value: StringList): Self = this.set("LogTypesToDisable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogTypesToDisable: Self = this.set("LogTypesToDisable", js.undefined)
    
    @scala.inline
    def setLogTypesToEnableVarargs(value: NonEmptyString*): Self = this.set("LogTypesToEnable", js.Array(value :_*))
    
    @scala.inline
    def setLogTypesToEnable(value: StringList): Self = this.set("LogTypesToEnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogTypesToEnable: Self = this.set("LogTypesToEnable", js.undefined)
  }
}
