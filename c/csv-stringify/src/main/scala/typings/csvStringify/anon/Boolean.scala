package typings.csvStringify.anon

import typings.csvStringify.es5Mod.Cast
import typings.csvStringify.es5Mod.CastingContext
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Boolean extends js.Object {
  var boolean: js.UndefOr[Cast[scala.Boolean]] = js.native
  var date: js.UndefOr[Cast[typings.std.Date]] = js.native
  var number: js.UndefOr[Cast[Double]] = js.native
  /**
    * Custom formatter for generic object values
    */
  var `object`: js.UndefOr[Cast[Record[String, _]]] = js.native
  var string: js.UndefOr[Cast[String]] = js.native
}

object Boolean {
  @scala.inline
  def apply(): Boolean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Boolean]
  }
  @scala.inline
  implicit class BooleanOps[Self <: Boolean] (val x: Self) extends AnyVal {
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
    def setBoolean(value: (scala.Boolean, /* context */ CastingContext) => String): Self = this.set("boolean", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBoolean: Self = this.set("boolean", js.undefined)
    @scala.inline
    def setDate(value: (typings.std.Date, /* context */ CastingContext) => String): Self = this.set("date", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setNumber(value: (Double, /* context */ CastingContext) => String): Self = this.set("number", js.Any.fromFunction2(value))
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    @scala.inline
    def setObject(value: (Record[String, _], /* context */ CastingContext) => String): Self = this.set("object", js.Any.fromFunction2(value))
    @scala.inline
    def deleteObject: Self = this.set("object", js.undefined)
    @scala.inline
    def setString(value: (String, /* context */ CastingContext) => String): Self = this.set("string", js.Any.fromFunction2(value))
    @scala.inline
    def deleteString: Self = this.set("string", js.undefined)
  }
  
}

