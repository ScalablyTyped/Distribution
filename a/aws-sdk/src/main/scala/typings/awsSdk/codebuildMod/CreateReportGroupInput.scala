package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateReportGroupInput extends js.Object {
  /**
    *  A ReportExportConfig object that contains information about where the report group test results are exported. 
    */
  var exportConfig: ReportExportConfig = js.native
  /**
    *  The name of the report group. 
    */
  var name: ReportGroupName = js.native
  /**
    *  The type of report group. 
    */
  var `type`: ReportType = js.native
}

object CreateReportGroupInput {
  @scala.inline
  def apply(exportConfig: ReportExportConfig, name: ReportGroupName, `type`: ReportType): CreateReportGroupInput = {
    val __obj = js.Dynamic.literal(exportConfig = exportConfig.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReportGroupInput]
  }
}

