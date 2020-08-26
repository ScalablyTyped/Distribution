package typings.awsSdkClientXrayNode.typesTraceSummaryMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientXrayNode.typesHttpMod.UnmarshalledHttp
import typings.awsSdkClientXrayNode.typesServiceIdMod.UnmarshalledServiceId
import typings.awsSdkClientXrayNode.typesTraceUserMod.UnmarshalledTraceUser
import typings.awsSdkClientXrayNode.typesValueWithServiceIdsMod.UnmarshalledValueWithServiceIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledTraceSummary extends TraceSummary {
  /**
    * <p>Annotations from the trace's segment documents.</p>
    */
  @JSName("Annotations")
  var Annotations_UnmarshalledTraceSummary: js.UndefOr[StringDictionary[js.Array[UnmarshalledValueWithServiceIds]]] = js.native
  /**
    * <p>Information about the HTTP request served by the trace.</p>
    */
  @JSName("Http")
  var Http_UnmarshalledTraceSummary: js.UndefOr[UnmarshalledHttp] = js.native
  /**
    * <p>Service IDs from the trace's segment documents.</p>
    */
  @JSName("ServiceIds")
  var ServiceIds_UnmarshalledTraceSummary: js.UndefOr[js.Array[UnmarshalledServiceId]] = js.native
  /**
    * <p>Users from the trace's segment documents.</p>
    */
  @JSName("Users")
  var Users_UnmarshalledTraceSummary: js.UndefOr[js.Array[UnmarshalledTraceUser]] = js.native
}

object UnmarshalledTraceSummary {
  @scala.inline
  def apply(): UnmarshalledTraceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledTraceSummary]
  }
  @scala.inline
  implicit class UnmarshalledTraceSummaryOps[Self <: UnmarshalledTraceSummary] (val x: Self) extends AnyVal {
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
    def setAnnotations(value: StringDictionary[js.Array[UnmarshalledValueWithServiceIds]]): Self = this.set("Annotations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnotations: Self = this.set("Annotations", js.undefined)
    @scala.inline
    def setHttp(value: UnmarshalledHttp): Self = this.set("Http", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttp: Self = this.set("Http", js.undefined)
    @scala.inline
    def setServiceIdsVarargs(value: UnmarshalledServiceId*): Self = this.set("ServiceIds", js.Array(value :_*))
    @scala.inline
    def setServiceIds(value: js.Array[UnmarshalledServiceId]): Self = this.set("ServiceIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceIds: Self = this.set("ServiceIds", js.undefined)
    @scala.inline
    def setUsersVarargs(value: UnmarshalledTraceUser*): Self = this.set("Users", js.Array(value :_*))
    @scala.inline
    def setUsers(value: js.Array[UnmarshalledTraceUser]): Self = this.set("Users", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsers: Self = this.set("Users", js.undefined)
  }
  
}

