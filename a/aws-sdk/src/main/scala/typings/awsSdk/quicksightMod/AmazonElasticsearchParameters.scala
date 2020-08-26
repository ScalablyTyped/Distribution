package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmazonElasticsearchParameters extends js.Object {
  /**
    * The Amazon Elasticsearch Service domain.
    */
  var Domain: typings.awsSdk.quicksightMod.Domain = js.native
}

object AmazonElasticsearchParameters {
  @scala.inline
  def apply(Domain: Domain): AmazonElasticsearchParameters = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmazonElasticsearchParameters]
  }
  @scala.inline
  implicit class AmazonElasticsearchParametersOps[Self <: AmazonElasticsearchParameters] (val x: Self) extends AnyVal {
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
    def setDomain(value: Domain): Self = this.set("Domain", value.asInstanceOf[js.Any])
  }
  
}

