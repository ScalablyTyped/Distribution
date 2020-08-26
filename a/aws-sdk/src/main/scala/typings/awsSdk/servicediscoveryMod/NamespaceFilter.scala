package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamespaceFilter extends js.Object {
  /**
    * The operator that you want to use to determine whether ListNamespaces returns a namespace. Valid values for condition include:    EQ: When you specify EQ for the condition, you can choose to list only public namespaces or private namespaces, but not both. EQ is the default condition and can be omitted.    IN: When you specify IN for the condition, you can choose to list public namespaces, private namespaces, or both.     BETWEEN: Not applicable  
    */
  var Condition: js.UndefOr[FilterCondition] = js.native
  /**
    * Specify TYPE.
    */
  var Name: NamespaceFilterName = js.native
  /**
    * If you specify EQ for Condition, specify either DNS_PUBLIC or DNS_PRIVATE. If you specify IN for Condition, you can specify DNS_PUBLIC, DNS_PRIVATE, or both.
    */
  var Values: FilterValues = js.native
}

object NamespaceFilter {
  @scala.inline
  def apply(Name: NamespaceFilterName, Values: FilterValues): NamespaceFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceFilter]
  }
  @scala.inline
  implicit class NamespaceFilterOps[Self <: NamespaceFilter] (val x: Self) extends AnyVal {
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
    def setName(value: NamespaceFilterName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: FilterValue*): Self = this.set("Values", js.Array(value :_*))
    @scala.inline
    def setValues(value: FilterValues): Self = this.set("Values", value.asInstanceOf[js.Any])
    @scala.inline
    def setCondition(value: FilterCondition): Self = this.set("Condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("Condition", js.undefined)
  }
  
}

