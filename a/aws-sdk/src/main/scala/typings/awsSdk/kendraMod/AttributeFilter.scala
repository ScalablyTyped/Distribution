package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeFilter extends js.Object {
  /**
    * Performs a logical AND operation on all supplied filters.
    */
  var AndAllFilters: js.UndefOr[AttributeFilterList] = js.native
  /**
    * Returns true when a document contains all of the specified document attributes. This filter is only appicable to StringListValue metadata.
    */
  var ContainsAll: js.UndefOr[DocumentAttribute] = js.native
  /**
    * Returns true when a document contains any of the specified document attributes.This filter is only appicable to StringListValue metadata.
    */
  var ContainsAny: js.UndefOr[DocumentAttribute] = js.native
  /**
    * Performs an equals operation on two document attributes.
    */
  var EqualsTo: js.UndefOr[DocumentAttribute] = js.native
  /**
    * Performs a greater than operation on two document attributes. Use with a document attribute of type Integer or Long.
    */
  var GreaterThan: js.UndefOr[DocumentAttribute] = js.native
  /**
    * Performs a greater or equals than operation on two document attributes. Use with a document attribute of type Integer or Long.
    */
  var GreaterThanOrEquals: js.UndefOr[DocumentAttribute] = js.native
  /**
    * Performs a less than operation on two document attributes. Use with a document attribute of type Integer or Long.
    */
  var LessThan: js.UndefOr[DocumentAttribute] = js.native
  /**
    * Performs a less than or equals operation on two document attributes. Use with a document attribute of type Integer or Long.
    */
  var LessThanOrEquals: js.UndefOr[DocumentAttribute] = js.native
  /**
    * Performs a logical NOT operation on all supplied filters.
    */
  var NotFilter: js.UndefOr[AttributeFilter] = js.native
  /**
    * Performs a logical OR operation on all supplied filters.
    */
  var OrAllFilters: js.UndefOr[AttributeFilterList] = js.native
}

object AttributeFilter {
  @scala.inline
  def apply(): AttributeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeFilter]
  }
  @scala.inline
  implicit class AttributeFilterOps[Self <: AttributeFilter] (val x: Self) extends AnyVal {
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
    def setAndAllFiltersVarargs(value: AttributeFilter*): Self = this.set("AndAllFilters", js.Array(value :_*))
    @scala.inline
    def setAndAllFilters(value: AttributeFilterList): Self = this.set("AndAllFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndAllFilters: Self = this.set("AndAllFilters", js.undefined)
    @scala.inline
    def setContainsAll(value: DocumentAttribute): Self = this.set("ContainsAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainsAll: Self = this.set("ContainsAll", js.undefined)
    @scala.inline
    def setContainsAny(value: DocumentAttribute): Self = this.set("ContainsAny", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainsAny: Self = this.set("ContainsAny", js.undefined)
    @scala.inline
    def setEqualsTo(value: DocumentAttribute): Self = this.set("EqualsTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEqualsTo: Self = this.set("EqualsTo", js.undefined)
    @scala.inline
    def setGreaterThan(value: DocumentAttribute): Self = this.set("GreaterThan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGreaterThan: Self = this.set("GreaterThan", js.undefined)
    @scala.inline
    def setGreaterThanOrEquals(value: DocumentAttribute): Self = this.set("GreaterThanOrEquals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGreaterThanOrEquals: Self = this.set("GreaterThanOrEquals", js.undefined)
    @scala.inline
    def setLessThan(value: DocumentAttribute): Self = this.set("LessThan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLessThan: Self = this.set("LessThan", js.undefined)
    @scala.inline
    def setLessThanOrEquals(value: DocumentAttribute): Self = this.set("LessThanOrEquals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLessThanOrEquals: Self = this.set("LessThanOrEquals", js.undefined)
    @scala.inline
    def setNotFilter(value: AttributeFilter): Self = this.set("NotFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotFilter: Self = this.set("NotFilter", js.undefined)
    @scala.inline
    def setOrAllFiltersVarargs(value: AttributeFilter*): Self = this.set("OrAllFilters", js.Array(value :_*))
    @scala.inline
    def setOrAllFilters(value: AttributeFilterList): Self = this.set("OrAllFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrAllFilters: Self = this.set("OrAllFilters", js.undefined)
  }
  
}

