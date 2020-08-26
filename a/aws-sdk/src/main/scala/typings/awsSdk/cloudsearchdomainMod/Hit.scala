package typings.awsSdk.cloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hit extends js.Object {
  /**
    * The expressions returned from a document that matches the search request.
    */
  var exprs: js.UndefOr[Exprs] = js.native
  /**
    * The fields returned from a document that matches the search request.
    */
  var fields: js.UndefOr[Fields] = js.native
  /**
    * The highlights returned from a document that matches the search request.
    */
  var highlights: js.UndefOr[Highlights] = js.native
  /**
    * The document ID of a document that matches the search request.
    */
  var id: js.UndefOr[String] = js.native
}

object Hit {
  @scala.inline
  def apply(): Hit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hit]
  }
  @scala.inline
  implicit class HitOps[Self <: Hit] (val x: Self) extends AnyVal {
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
    def setExprs(value: Exprs): Self = this.set("exprs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExprs: Self = this.set("exprs", js.undefined)
    @scala.inline
    def setFields(value: Fields): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setHighlights(value: Highlights): Self = this.set("highlights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlights: Self = this.set("highlights", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

