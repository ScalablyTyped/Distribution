package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAnalysisSchemeRequest extends js.Object {
  /**
    * The name of the analysis scheme you want to delete.
    */
  var AnalysisSchemeName: StandardName = js.native
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName = js.native
}

object DeleteAnalysisSchemeRequest {
  @scala.inline
  def apply(AnalysisSchemeName: StandardName, DomainName: DomainName): DeleteAnalysisSchemeRequest = {
    val __obj = js.Dynamic.literal(AnalysisSchemeName = AnalysisSchemeName.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAnalysisSchemeRequest]
  }
}

