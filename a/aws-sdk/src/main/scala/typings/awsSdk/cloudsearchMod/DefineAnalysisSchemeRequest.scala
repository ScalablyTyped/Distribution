package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefineAnalysisSchemeRequest extends js.Object {
  var AnalysisScheme: typings.awsSdk.cloudsearchMod.AnalysisScheme = js.native
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName = js.native
}

object DefineAnalysisSchemeRequest {
  @scala.inline
  def apply(AnalysisScheme: AnalysisScheme, DomainName: DomainName): DefineAnalysisSchemeRequest = {
    val __obj = js.Dynamic.literal(AnalysisScheme = AnalysisScheme.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DefineAnalysisSchemeRequest]
  }
}

